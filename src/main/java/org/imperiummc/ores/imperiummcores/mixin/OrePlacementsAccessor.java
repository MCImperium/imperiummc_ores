package org.imperiummc.ores.imperiummcores.mixin;

import net.minecraft.data.worldgen.placement.OrePlacements;
import net.minecraft.world.level.levelgen.placement.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.List;

@Mixin(OrePlacements.class)
public interface OrePlacementsAccessor {

    @Invoker("orePlacement")
    static List<PlacementModifier> core(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return null;
    }

    @Invoker("commonOrePlacement")
    static List<PlacementModifier> common(int p_195344_, PlacementModifier p_195345_) {
        return null;
    }

    @Invoker("rareOrePlacement")
    static List<PlacementModifier> rare(int p_195350_, PlacementModifier p_195351_) {
        return null;
    }
}
