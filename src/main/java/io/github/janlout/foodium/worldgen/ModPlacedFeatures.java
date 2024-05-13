package io.github.janlout.foodium.worldgen;

import io.github.janlout.foodium.FoodiumMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> BACONIUM_ORE_PLACED_KEY = registerKey("baconium_ore_placed");
    public static final ResourceKey<PlacedFeature> CHICKENITE_ORE_PLACED_KEY = registerKey("chickenite_ore_placed");
    public static final ResourceKey<PlacedFeature> DECAYRON_ORE_PLACED_KEY = registerKey("decayron_ore_placed");
    public static final ResourceKey<PlacedFeature> MUTTONIUM_ORE_PLACED_KEY = registerKey("muttonium_ore_placed");
    public static final ResourceKey<PlacedFeature> PARAFISH_ORE_PLACED_KEY = registerKey("parafish_ore_placed");
    public static final ResourceKey<PlacedFeature> RABBIDDIUM_ORE_PLACED_KEY = registerKey("rabbiddium_ore_placed");
    public static final ResourceKey<PlacedFeature> STEAKITE_ORE_PLACED_KEY = registerKey("steakite_ore_placed");

    public static final ResourceKey<PlacedFeature> FOODIUM_ORE_PLACED_KEY = registerKey("foodium_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatureHolderGetter = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, BACONIUM_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_BACONIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
        register(context, CHICKENITE_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_CHICKENITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
        register(context, DECAYRON_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_DECAYRON_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
        register(context, MUTTONIUM_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_MUTTONIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
        register(context, PARAFISH_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_PARAFISH_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
        register(context, RABBIDDIUM_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_RABBIDDIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));
        register(context, STEAKITE_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_STEAKITE_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));

        register(context, FOODIUM_ORE_PLACED_KEY, configuredFeatureHolderGetter.getOrThrow(ModConfiguredFeatures.OVERWORLD_FOODIUM_ORE_KEY),
                ModOrePlacement.commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(60))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(FoodiumMod.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
