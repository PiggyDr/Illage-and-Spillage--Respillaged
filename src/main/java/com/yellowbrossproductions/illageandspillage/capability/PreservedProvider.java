package com.yellowbrossproductions.illageandspillage.capability;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;

public class PreservedProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<IPreserved> PRESERVED_CAPABILITY = CapabilityManager.get(new CapabilityToken<>() {
    });

    private IPreserved instance = new PreservedCapability();
    private final LazyOptional<IPreserved> optional = LazyOptional.of(() -> instance);

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
        return cap == PRESERVED_CAPABILITY ? optional.cast() : LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        nbt.putBoolean("preserved", instance.isPreserved());
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        instance.setPreserved(nbt.getBoolean("preserved"));
    }
}