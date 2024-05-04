package io.github.janlout.foodium.item;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodiumMod.MODID);

    public static final RegistryObject<CreativeModeTab> FOODIUM_TAB = CREATIVE_MODE_TABS.register(
            "foodium_tab",
            () -> CreativeModeTab.builder()
                    .icon( () -> new ItemStack(ModItems.FOODIUM_SHARD.get()))
                    .title(Component.translatable("creativetab.foodium_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        for (RegistryObject<Item> item : ModItems.ITEMS.getEntries()) {
                            output.accept(item.get());
                        }
                        for (RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries()) {
                            output.accept(block.get());
                        }
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
