package com.yellowbrossproductions.illageandspillage.util;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PotionRegisterer {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, "illageandspillage");
    public static final RegistryObject<Potion> MUTATION = POTIONS.register("mutation", () -> new Potion(new MobEffectInstance(EffectRegisterer.MUTATION.get(), 600)));
}
