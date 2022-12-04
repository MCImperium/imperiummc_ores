package org.imperiummc.ores.imperiummcores;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.imperiummc.ores.imperiummcores.mixin.OrePlacementsAccessor;

public class NewOrePlacements {
    public static void init() {
        ORE_QUARTZ_OVERWORLD = PlacementUtils.register("ore_quartz_overworld", NewOreFeatures.ORE_QUARTZ_OVERWORLD, OrePlacementsAccessor.common(15, HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(56))));
    }
    public static Holder<PlacedFeature> ORE_QUARTZ_OVERWORLD;

}
