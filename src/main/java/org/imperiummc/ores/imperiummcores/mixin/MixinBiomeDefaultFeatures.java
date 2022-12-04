package org.imperiummc.ores.imperiummcores.mixin;

import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.imperiummc.ores.imperiummcores.NewOrePlacements;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BiomeDefaultFeatures.class)
public class MixinBiomeDefaultFeatures {
    @Inject(method = "addDefaultOres(Lnet/minecraft/world/level/biome/BiomeGenerationSettings$Builder;Z)V", at = @At("HEAD"))
    private static void addDefaultOres(BiomeGenerationSettings.Builder p_194723_, boolean p_194724_, CallbackInfo ci) {
        p_194723_.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, NewOrePlacements.ORE_QUARTZ_OVERWORLD);
    }
}
