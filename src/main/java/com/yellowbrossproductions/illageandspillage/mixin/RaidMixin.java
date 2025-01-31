package com.yellowbrossproductions.illageandspillage.mixin;

import com.yellowbrossproductions.illageandspillage.config.IllageAndSpillageConfig;
import com.yellowbrossproductions.illageandspillage.util.ModTags;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.entity.raid.Raider;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.*;
import java.util.stream.Collectors;

@Mixin(Raid.class)
public abstract class RaidMixin {
    @Final
    @Shadow
    private static Component RAID_NAME_COMPONENT;
    @Final
    @Shadow
    private Map<Integer, Set<Raider>> groupRaiderMap;
    @Final
    @Shadow
    private ServerBossEvent raidEvent;
    @Shadow
    private float totalHealth;

    @Shadow
    public abstract int getTotalRaidersAlive();

    @Shadow
    public abstract boolean isStopped();

    @Shadow
    public abstract boolean isOver();

    @Unique
    private static final String BOSSES_REMAINING = "event.illageandspillage.raid.bosses_remaining";
    @Unique
    private boolean onlyBosses = false;
    @Unique
    private float previousTotalHealth = 0.0F;
    @Unique
    private Set<UUID> oldNonBossUUIDs = new HashSet<>();

    @Unique
    private List<Raider> getBossesInRaid() {
        return this.groupRaiderMap.values().stream().flatMap(Set::stream).filter(r -> r.getType().is(ModTags.EntityTypes.ILLAGER_BOSSES)).collect(Collectors.toList());
    }

    @Unique
    private List<Raider> getNonBossesInRaid() {
        return this.groupRaiderMap.values().stream().flatMap(Set::stream).filter(r -> !r.getType().is(ModTags.EntityTypes.ILLAGER_BOSSES)).collect(Collectors.toList());
    }

    @Inject(method = "tick", at = @At("TAIL"))
    private void tick(CallbackInfo ci) {
        if (IllageAndSpillageConfig.bossbar_type.get() != 3 || this.isStopped() || this.isOver()) {
            return;
        }

        List<Raider> bosses = this.getBossesInRaid();
        List<Raider> nonBosses = this.getNonBossesInRaid();

        if (!bosses.isEmpty() && bosses.size() == this.getTotalRaidersAlive()) {
            if (!this.onlyBosses) {
                this.onlyBosses = true;
                this.previousTotalHealth = this.totalHealth;
                this.oldNonBossUUIDs = nonBosses.stream().map(Raider::getUUID).collect(Collectors.toSet());
                this.raidEvent.setDarkenScreen(IllageAndSpillageConfig.bosses_darken_sky.get());
            }

            this.totalHealth = this.getBossesMaxHealth(bosses);

            if (bosses.size() > 2) {
                this.raidEvent.setName(RAID_NAME_COMPONENT.copy().append(" - ").append(Component.translatable(BOSSES_REMAINING, bosses.size())));
            } else if (bosses.size() == 2) {
                this.raidEvent.setName(RAID_NAME_COMPONENT.copy().append(" - ").append(bosses.get(0).getDisplayName()).append(" & ").append(bosses.get(1).getDisplayName()));
            } else if (bosses.size() == 1) {
                this.raidEvent.setName(RAID_NAME_COMPONENT.copy().append(" - ").append(bosses.get(0).getDisplayName()));
            }
        } else {
            if (this.onlyBosses) {
                this.onlyBosses = false;

                float newRaiderHP = 0.0F;

                Set<UUID> newlyAdded = nonBosses.stream().map(Raider::getUUID).collect(Collectors.toSet());
                newlyAdded.removeAll(this.oldNonBossUUIDs);

                for (Raider newNonBoss : nonBosses) {
                    if (newlyAdded.contains(newNonBoss.getUUID())) {
                        newRaiderHP += newNonBoss.getMaxHealth();
                    }
                }

                this.totalHealth = this.previousTotalHealth + newRaiderHP;
                this.raidEvent.setDarkenScreen(false);
            }
        }
    }

    @Unique
    private float getBossesMaxHealth(List<Raider> bosses) {
        float sum = 0.0F;
        for (Raider boss : bosses) {
            sum += boss.getMaxHealth();
        }
        return sum;
    }
}