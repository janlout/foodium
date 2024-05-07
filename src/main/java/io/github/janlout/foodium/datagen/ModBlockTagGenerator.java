package io.github.janlout.foodium.datagen;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FoodiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        //Tags
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BACONIUM_ORE.get(),
                        ModBlocks.CHICKENITE_ORE.get(),
                        ModBlocks.DECAYRON_ORE.get(),
                        ModBlocks.FOODIUM_ORE.get(),
                        ModBlocks.MUTTONIUM_ORE.get(),
                        ModBlocks.PARAFISH_ORE.get(),
                        ModBlocks.RABBIDDIUM_ORE.get(),
                        ModBlocks.STEAKITE_ORE.get(),
                        ModBlocks.BACONIUM_BLOCK.get(),
                        ModBlocks.CHICKENITE_BLOCK.get(),
                        ModBlocks.DECAYRON_BLOCK.get(),
                        ModBlocks.MUTTONIUM_BLOCK.get(),
                        ModBlocks.PARAFISH_BLOCK.get(),
                        ModBlocks.RABBIDDIUM_BLOCK.get(),
                        ModBlocks.STEAKITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BACONIUM_ORE.get(),
                        ModBlocks.CHICKENITE_ORE.get(),
                        ModBlocks.DECAYRON_ORE.get(),
                        ModBlocks.FOODIUM_ORE.get(),
                        ModBlocks.MUTTONIUM_ORE.get(),
                        ModBlocks.PARAFISH_ORE.get(),
                        ModBlocks.RABBIDDIUM_ORE.get(),
                        ModBlocks.STEAKITE_ORE.get(),
                        ModBlocks.BACONIUM_BLOCK.get(),
                        ModBlocks.CHICKENITE_BLOCK.get(),
                        ModBlocks.DECAYRON_BLOCK.get(),
                        ModBlocks.MUTTONIUM_BLOCK.get(),
                        ModBlocks.PARAFISH_BLOCK.get(),
                        ModBlocks.RABBIDDIUM_BLOCK.get(),
                        ModBlocks.STEAKITE_BLOCK.get());
    }
}
