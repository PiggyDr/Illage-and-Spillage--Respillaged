package com.yellowbrossproductions.illageandspillage.mixin;

import com.yellowbrossproductions.illageandspillage.util.EntityUtil;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.level.GameRules;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.EnumSet;

@Mixin(HurtByTargetGoal.class)
public abstract class HurtByTargetGoalMixin extends TargetGoal {
    @Final
    @Shadow
    private static TargetingConditions HURT_BY_TARGETING;
    @Shadow
    private int timestamp;
    @Final
    @Shadow
    private Class<?>[] toIgnoreDamage;

    public HurtByTargetGoalMixin(Mob p_26140_, boolean p_26141_) {
        super(p_26140_, p_26141_);
        this.setFlags(EnumSet.of(Goal.Flag.TARGET));
    }

    @Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
    public void canUse(CallbackInfoReturnable<Boolean> cir) {
        int i = this.mob.getLastHurtByMobTimestamp();
        LivingEntity livingentity = this.mob.getLastHurtByMob();
        if (i != this.timestamp && livingentity != null) {
            if (livingentity.getType() == EntityType.PLAYER && this.mob.level().getGameRules().getBoolean(GameRules.RULE_UNIVERSAL_ANGER)) {
                cir.setReturnValue(false);
            } else {
                for (Class<?> oclass : this.toIgnoreDamage) {
                    if (oclass.isAssignableFrom(livingentity.getClass()) && !EntityUtil.isEntityCrazyRagno(livingentity)) {
                        cir.setReturnValue(false);
                        return;
                    }
                }

                cir.setReturnValue(this.canAttack(livingentity, HURT_BY_TARGETING));
            }
        } else {
            cir.setReturnValue(false);
        }
    }
}