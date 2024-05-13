package io.github.janlout.foodium.item;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FoodiumMod.MODID);

    public static final RegistryObject<Item> FOODIUM_SHARD = ITEMS.register("foodium_shard", () -> new FuelItem(new Item.Properties(), 20000));

    public static final RegistryObject<Item> RAW_BACONIUM = ITEMS.register("raw_baconium", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BACONIUM)));
    public static final RegistryObject<Item> RAW_CHICKENITE = ITEMS.register("raw_chickenite", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_CHICKENITE)));
    public static final RegistryObject<Item> RAW_DECAYRON = ITEMS.register("raw_decayron", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_DECAYRON)));
    public static final RegistryObject<Item> RAW_MUTTONIUM = ITEMS.register("raw_muttonium", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_MUTTONIUM)));
    public static final RegistryObject<Item> RAW_PARAFISH = ITEMS.register("raw_parafish", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_PARAFISH)));
    public static final RegistryObject<Item> RAW_RABBIDDIUM = ITEMS.register("raw_rabbiddium", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_RABBIDDIUM)));
    public static final RegistryObject<Item> RAW_STEAKITE = ITEMS.register("raw_steakite", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_STEAKITE)));

    public static final RegistryObject<Item> BACONIUM_INGOT = ITEMS.register("baconium_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BACONIUM)));
    public static final RegistryObject<Item> CHICKENITE_INGOT = ITEMS.register("chickenite_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CHICKENITE)));
    public static final RegistryObject<Item> DECAYRON_INGOT = ITEMS.register("decayron_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_DECAYRON)));
    public static final RegistryObject<Item> MUTTONIUM_INGOT = ITEMS.register("muttonium_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_MUTTONIUM)));
    public static final RegistryObject<Item> PARAFISH_INGOT = ITEMS.register("parafish_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_PARAFISH)));
    public static final RegistryObject<Item> RABBIDDIUM_INGOT = ITEMS.register("rabbiddium_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_RABBIDDIUM)));
    public static final RegistryObject<Item> STEAKITE_INGOT = ITEMS.register("steakite_ingot", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_STEAKITE)));

    public static final RegistryObject<Item> BACONIUM_NUGGET = ITEMS.register("baconium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHICKENITE_NUGGET = ITEMS.register("chickenite_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DECAYRON_NUGGET = ITEMS.register("decayron_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MUTTONIUM_NUGGET = ITEMS.register("muttonium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PARAFISH_NUGGET = ITEMS.register("parafish_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RABBIDDIUM_NUGGET = ITEMS.register("rabbiddium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEAKITE_NUGGET = ITEMS.register("steakite_nugget", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FULLFILLING_FOODIUM_PIE = ITEMS.register("fullfilling_foodium_pie", () -> new Item(new Item.Properties().food(ModFoodProperties.FOODIUM_PIE)));
    public static final RegistryObject<Item> HEAVYWEIGHT_MEAL = ITEMS.register("heavyweight_meal", () -> new Item(new Item.Properties().food(ModFoodProperties.HEAVYWEIGHT_MEAL)));
    public static final RegistryObject<Item> LIGHTWEIGHT_MEAL = ITEMS.register("lightweight_meal", () -> new Item(new Item.Properties().food(ModFoodProperties.LIGHTWEIGHT_MEAL)));
    public static final RegistryObject<Item> PARAFISH_MEAL = ITEMS.register("parafish_meal", () -> new Item(new Item.Properties().food(ModFoodProperties.PARAFISH_MEAL)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
