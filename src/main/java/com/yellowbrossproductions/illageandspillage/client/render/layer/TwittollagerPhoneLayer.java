package com.yellowbrossproductions.illageandspillage.client.render.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.yellowbrossproductions.illageandspillage.client.model.TwittollagerModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TwittollagerPhoneLayer<T extends LivingEntity> extends EyesLayer<T, TwittollagerModel<T>> {
    private static final RenderType LAYER = RenderType.eyes(new ResourceLocation("illageandspillage", "textures/entity/twittollager/twittollager_glow.png"));

    public TwittollagerPhoneLayer(RenderLayerParent<T, TwittollagerModel<T>> p_i226039_1_) {
        super(p_i226039_1_);
    }

    public RenderType renderType() {
        return LAYER;
    }

    public void render(PoseStack p_225628_1_, MultiBufferSource p_225628_2_, int p_225628_3_, T p_225628_4_, float p_225628_5_, float p_225628_6_, float p_225628_7_, float p_225628_8_, float p_225628_9_, float p_225628_10_) {
        if (!p_225628_4_.isInvisible()) {
            super.render(p_225628_1_, p_225628_2_, p_225628_3_, p_225628_4_, p_225628_5_, p_225628_6_, p_225628_7_, p_225628_8_, p_225628_9_, p_225628_10_);
        }
    }
}
