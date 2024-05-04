package io.github.janlout.foodium.item;

import io.github.janlout.foodium.FoodiumMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodiumMod.MODID);

    public static final RegistryObject<Item> FOODIUM_SHARD = ITEMS.register("foodium_shard", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BACONIUM = ITEMS.register("raw_baconium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHICKENITE = ITEMS.register("raw_chickenite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_DECAYRON = ITEMS.register("raw_decayron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MUTTONIUM = ITEMS.register("raw_muttonium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PARAFISH = ITEMS.register("raw_parafish", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RABBIDDIUM = ITEMS.register("raw_rabbiddium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STEAKITE = ITEMS.register("raw_steakite", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
