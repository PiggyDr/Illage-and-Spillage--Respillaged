package com.yellowbrossproductions.illageandspillage.util;

import com.yellowbrossproductions.illageandspillage.IllageAndSpillage;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class ModTags {
    public static class EntityTypes {
        public static final TagKey<EntityType<?>> ILLAGER_BOSSES = tag("illager_bosses");

        public static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(IllageAndSpillage.MOD_ID, name));
        }
    }
}