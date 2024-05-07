package io.github.janlout.foodium.datagen.loot;

import io.github.janlout.foodium.block.ModBlocks;
import io.github.janlout.foodium.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(ModBlocks.FOODIUM_ORE.get(), block -> createFoodiumLikeOreDrops(ModBlocks.FOODIUM_ORE.get(), ModItems.FOODIUM_SHARD.get()));
        this.add(ModBlocks.BACONIUM_ORE.get(), block -> createOreLikeDrop(ModBlocks.BACONIUM_ORE.get(), ModItems.RAW_BACONIUM.get()));
        this.add(ModBlocks.CHICKENITE_ORE.get(), block -> createOreLikeDrop(ModBlocks.CHICKENITE_ORE.get(), ModItems.RAW_CHICKENITE.get()));
        this.add(ModBlocks.DECAYRON_ORE.get(), block -> createOreLikeDrop(ModBlocks.DECAYRON_ORE.get(), ModItems.RAW_DECAYRON.get()));
        this.add(ModBlocks.MUTTONIUM_ORE.get(), block -> createOreLikeDrop(ModBlocks.MUTTONIUM_ORE.get(), ModItems.RAW_MUTTONIUM.get()));
        this.add(ModBlocks.PARAFISH_ORE.get(), block -> createOreLikeDrop(ModBlocks.PARAFISH_ORE.get(), ModItems.RAW_PARAFISH.get()));
        this.add(ModBlocks.RABBIDDIUM_ORE.get(), block -> createOreLikeDrop(ModBlocks.RABBIDDIUM_ORE.get(), ModItems.RAW_RABBIDDIUM.get()));
        this.add(ModBlocks.STEAKITE_ORE.get(), block -> createOreLikeDrop(ModBlocks.STEAKITE_ORE.get(), ModItems.RAW_STEAKITE.get()));

        this.dropSelf(ModBlocks.BACONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CHICKENITE_BLOCK.get());
        this.dropSelf(ModBlocks.DECAYRON_BLOCK.get());
        this.dropSelf(ModBlocks.MUTTONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.PARAFISH_BLOCK.get());
        this.dropSelf(ModBlocks.RABBIDDIUM_BLOCK.get());
        this.dropSelf(ModBlocks.STEAKITE_BLOCK.get());


    }

    protected LootTable.Builder createFoodiumLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createOreLikeDrop(Block pBlock, Item pItem) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(pItem)
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
