package io.github.janlout.foodium.datagen;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FoodiumMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.FOODIUM_ORE);
        blockWithItem(ModBlocks.BACONIUM_ORE);
        blockWithItem(ModBlocks.CHICKENITE_ORE);
        blockWithItem(ModBlocks.DECAYRON_ORE);
        blockWithItem(ModBlocks.MUTTONIUM_ORE);
        blockWithItem(ModBlocks.PARAFISH_ORE);
        blockWithItem(ModBlocks.RABBIDDIUM_ORE);
        blockWithItem(ModBlocks.STEAKITE_ORE);
        blockWithItem(ModBlocks.BACONIUM_BLOCK);
        blockWithItem(ModBlocks.CHICKENITE_BLOCK);
        blockWithItem(ModBlocks.DECAYRON_BLOCK);
        blockWithItem(ModBlocks.MUTTONIUM_BLOCK);
        blockWithItem(ModBlocks.PARAFISH_BLOCK);
        blockWithItem(ModBlocks.RABBIDDIUM_BLOCK);
        blockWithItem(ModBlocks.STEAKITE_BLOCK);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
