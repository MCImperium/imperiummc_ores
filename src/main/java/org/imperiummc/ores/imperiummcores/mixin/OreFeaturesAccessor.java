package org.imperiummc.ores.imperiummcores.mixin;

import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(OreFeatures.class)
public interface OreFeaturesAccessor {

    @Accessor("STONE_ORE_REPLACEABLES")
    static RuleTest getSTONE_ORE_REPLACEABLES() {
        return null;
    }
}
