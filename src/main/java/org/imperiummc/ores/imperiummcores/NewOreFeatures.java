package org.imperiummc.ores.imperiummcores;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import org.imperiummc.ores.imperiummcores.mixin.OreFeaturesAccessor;

public class NewOreFeatures {
    public static void init() {
        ORE_QUARTZ_OVERWORLD = FeatureUtils.register("ore_quartz_overworld", Feature.ORE, new OreConfiguration(OreFeaturesAccessor.getSTONE_ORE_REPLACEABLES(), Blocks.NETHER_QUARTZ_ORE.defaultBlockState(), 14));
    }
    public static Holder<ConfiguredFeature<OreConfiguration, ?>> ORE_QUARTZ_OVERWORLD;

}
