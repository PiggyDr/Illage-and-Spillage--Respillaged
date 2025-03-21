package com.yellowbrossproductions.illageandspillage.client.model.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationChannel.Interpolations;
import net.minecraft.client.animation.AnimationChannel.Targets;
import net.minecraft.client.animation.AnimationDefinition.Builder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AbsorberAnimation {
    public static final AnimationDefinition ATTACK = Builder.withLength(1.5F).addAnimation("waist", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.25F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.4F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.8F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.85F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("chest", new AnimationChannel(Targets.ROTATION, new Keyframe(0.15F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.4F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.55F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.9F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.05F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.1F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(25.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("arm1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(-110.0F, 10.0F, 10.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(-110.0F, 10.0F, 10.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(-25.0F, -25.0F, 15.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(-25.0F, -25.0F, 15.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("glove1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(120.0F, 10.0F, -75.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(120.0F, 10.0F, -75.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("fist1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 15.0F, 70.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 15.0F, 70.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("arm2", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(-155.0F, 0.0F, -10.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(-155.0F, 0.0F, -10.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(-45.0F, -25.0F, 55.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(-45.0F, -25.0F, 55.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("glove2", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(25.0F, 15.0F, 50.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(25.0F, 15.0F, 50.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("fist2", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("head", new AnimationChannel(Targets.ROTATION, new Keyframe(0.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.3F, KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.1F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.2F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR))).build();
    public static final AnimationDefinition DEATH = Builder.withLength(4.5F).addAnimation("waist", new AnimationChannel(Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.15F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -14.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.55F, KeyframeAnimations.posVec(0.0F, -14.5F, -1.0F), Interpolations.LINEAR), new Keyframe(1.65F, KeyframeAnimations.posVec(0.0F, -14.0F, -2.0F), Interpolations.LINEAR))).addAnimation("waist", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.1F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.7F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.8F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.9F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.1F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.4F, KeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.55F, KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.65F, KeyframeAnimations.degreeVec(8.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(2.05F, KeyframeAnimations.degreeVec(-8.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(2.2F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(2.9F, KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(3.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(3.1F, KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(3.2F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(3.6F, KeyframeAnimations.degreeVec(80.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("arm1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.degreeVec(45.0F, 0.0F, 45.0F), Interpolations.LINEAR), new Keyframe(0.1F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 45.0F), Interpolations.LINEAR), new Keyframe(0.65F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 45.0F), Interpolations.LINEAR), new Keyframe(0.7F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 40.0F), Interpolations.LINEAR), new Keyframe(0.95F, KeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.0F, KeyframeAnimations.degreeVec(40.0F, 0.0F, -5.0F), Interpolations.LINEAR), new Keyframe(2.9F, KeyframeAnimations.degreeVec(40.0F, 0.0F, -5.0F), Interpolations.LINEAR), new Keyframe(3.1F, KeyframeAnimations.degreeVec(15.0F, 0.0F, -5.0F), Interpolations.LINEAR), new Keyframe(3.6F, KeyframeAnimations.degreeVec(-120.0F, 0.0F, -5.0F), Interpolations.LINEAR))).addAnimation("glove1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.degreeVec(115.0F, 0.0F, -30.0F), Interpolations.LINEAR), new Keyframe(0.1F, KeyframeAnimations.degreeVec(110.0F, 0.0F, -25.0F), Interpolations.LINEAR), new Keyframe(1.25F, KeyframeAnimations.degreeVec(110.0F, 0.0F, -25.0F), Interpolations.LINEAR), new Keyframe(1.35F, KeyframeAnimations.degreeVec(100.0F, 0.0F, -20.0F), Interpolations.LINEAR), new Keyframe(1.55F, KeyframeAnimations.degreeVec(50.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(2.15F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 5.0F), Interpolations.LINEAR), new Keyframe(2.9F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 5.0F), Interpolations.LINEAR), new Keyframe(3.1F, KeyframeAnimations.degreeVec(75.0F, 0.0F, 5.0F), Interpolations.LINEAR), new Keyframe(3.65F, KeyframeAnimations.degreeVec(120.0F, -30.0F, -10.0F), Interpolations.LINEAR))).addAnimation("fist1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(2.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(3.1F, KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F), Interpolations.LINEAR), new Keyframe(3.65F, KeyframeAnimations.degreeVec(0.0F, 120.0F, 0.0F), Interpolations.LINEAR))).addAnimation("arm2", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -45.0F), Interpolations.LINEAR), new Keyframe(0.1F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), Interpolations.LINEAR), new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -40.0F), Interpolations.LINEAR), new Keyframe(0.55F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -35.0F), Interpolations.LINEAR), new Keyframe(0.7F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 10.0F), Interpolations.LINEAR), new Keyframe(2.9F, KeyframeAnimations.degreeVec(-25.0F, 0.0F, 10.0F), Interpolations.LINEAR), new Keyframe(3.05F, KeyframeAnimations.degreeVec(-45.0F, 0.0F, 15.0F), Interpolations.LINEAR), new Keyframe(3.6F, KeyframeAnimations.degreeVec(-160.0F, -10.0F, 45.0F), Interpolations.LINEAR))).addAnimation("glove2", new AnimationChannel(Targets.ROTATION, new Keyframe(0.6F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.75F, KeyframeAnimations.degreeVec(-35.0F, 80.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.8F, KeyframeAnimations.degreeVec(-45.0F, 90.0F, 0.0F), Interpolations.LINEAR))).addAnimation("eyebrow1", new AnimationChannel(Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR))).addAnimation("eyebrow1", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), Interpolations.LINEAR))).addAnimation("eyebrow2", new AnimationChannel(Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR), new Keyframe(0.7F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR), new Keyframe(0.9F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), Interpolations.LINEAR), new Keyframe(2.75F, KeyframeAnimations.posVec(0.0F, 0.25F, 0.0F), Interpolations.LINEAR), new Keyframe(3.3F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), Interpolations.LINEAR))).addAnimation("eyebrow2", new AnimationChannel(Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(0.05F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR), new Keyframe(0.7F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR), new Keyframe(0.9F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.LINEAR), new Keyframe(2.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 15.0F), Interpolations.LINEAR), new Keyframe(3.3F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F), Interpolations.LINEAR))).addAnimation("leg2", new AnimationChannel(Targets.POSITION, new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.35F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -18.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.55F, KeyframeAnimations.posVec(0.0F, -18.5F, -1.0F), Interpolations.LINEAR), new Keyframe(1.65F, KeyframeAnimations.posVec(0.0F, -18.0F, -2.0F), Interpolations.LINEAR))).addAnimation("leg2", new AnimationChannel(Targets.ROTATION, new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.35F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR))).addAnimation("leg1", new AnimationChannel(Targets.POSITION, new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.35F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, -18.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.55F, KeyframeAnimations.posVec(0.0F, -18.5F, -1.0F), Interpolations.LINEAR), new Keyframe(1.65F, KeyframeAnimations.posVec(0.0F, -18.0F, -2.0F), Interpolations.LINEAR))).addAnimation("leg1", new AnimationChannel(Targets.ROTATION, new Keyframe(1.2F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.35F, KeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), Interpolations.LINEAR), new Keyframe(1.5F, KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F), Interpolations.LINEAR))).build();
}
