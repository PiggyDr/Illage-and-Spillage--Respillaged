package com.yellowbrossproductions.illageandspillage.packet;

import com.yellowbrossproductions.illageandspillage.capability.PreservedProvider;
import com.yellowbrossproductions.illageandspillage.capability.WebbedProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PreservedSyncPacket {
    private final int entityId;
    private final boolean preserved;

    public PreservedSyncPacket(int entityId, boolean preserved) {
        this.entityId = entityId;
        this.preserved = preserved;
    }

    public static void encode(PreservedSyncPacket msg, FriendlyByteBuf buf) {
        buf.writeInt(msg.entityId);
        buf.writeBoolean(msg.preserved);
    }

    public static PreservedSyncPacket decode(FriendlyByteBuf buf) {
        return new PreservedSyncPacket(buf.readInt(), buf.readBoolean());
    }

    public static void handle(PreservedSyncPacket msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            if (Minecraft.getInstance().level != null) {
                Entity entity = Minecraft.getInstance().level.getEntity(msg.entityId);
                if (entity != null) {
                    entity.getCapability(PreservedProvider.PRESERVED_CAPABILITY).ifPresent(preserved -> preserved.setPreserved(msg.preserved));
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }
}