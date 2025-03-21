package com.yellowbrossproductions.illageandspillage.util;

import com.yellowbrossproductions.illageandspillage.effect.*;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectRegisterer {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "illageandspillage");
    public static final RegistryObject<MobEffect> DISABILITY = EFFECTS.register("disability", () -> new DisabilityEffect(MobEffectCategory.HARMFUL, 3484199));
    public static final RegistryObject<MobEffect> MISCONDUCTION = EFFECTS.register("misconduction", () -> new MisconductionEffect(MobEffectCategory.BENEFICIAL, 3484199));
    public static final RegistryObject<MobEffect> PRESERVED = EFFECTS.register("preserved", () -> new PreservedEffect(MobEffectCategory.BENEFICIAL, 3484199));
    public static final RegistryObject<MobEffect> MUTATION = EFFECTS.register("mutation", () -> new MutationEffect(MobEffectCategory.HARMFUL, 3484199));
    public static final RegistryObject<MobEffect> WEBBED = EFFECTS.register("webbed", () -> new WebbedEffect(MobEffectCategory.HARMFUL, 3484199));
}
