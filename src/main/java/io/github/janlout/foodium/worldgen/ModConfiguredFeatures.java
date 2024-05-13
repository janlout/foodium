package io.github.janlout.foodium.worldgen;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BACONIUM_ORE_KEY = registerKey("baconium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHICKENITE_ORE_KEY = registerKey("chickenite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DECAYRON_ORE_KEY = registerKey("decayron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MUTTONIUM_ORE_KEY = registerKey("muttonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PARAFISH_ORE_KEY = registerKey("parafish_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RABBIDDIUM_ORE_KEY = registerKey("rabbiddium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STEAKITE_ORE_KEY = registerKey("steakite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FOODIUM_ORE_KEY = registerKey("foodium_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context){
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);

        register(context, OVERWORLD_BACONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.BACONIUM_ORE.get().defaultBlockState(),5));
        register(context, OVERWORLD_CHICKENITE_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.CHICKENITE_ORE.get().defaultBlockState(),5));
        register(context, OVERWORLD_DECAYRON_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.DECAYRON_ORE.get().defaultBlockState(),5));
        register(context, OVERWORLD_MUTTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.MUTTONIUM_ORE.get().defaultBlockState(),5));
        register(context, OVERWORLD_PARAFISH_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.PARAFISH_ORE.get().defaultBlockState(),5));
        register(context, OVERWORLD_RABBIDDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.RABBIDDIUM_ORE.get().defaultBlockState(),5));
        register(context, OVERWORLD_STEAKITE_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.STEAKITE_ORE.get().defaultBlockState(),5));

        register(context, OVERWORLD_FOODIUM_ORE_KEY, Feature.ORE, new OreConfiguration(stoneReplaceables, ModBlocks.FOODIUM_ORE.get().defaultBlockState(),3));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(FoodiumMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
