package io.github.janlout.foodium.datagen;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FoodiumMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.FOODIUM_SHARD);

        simpleItem(ModItems.RAW_BACONIUM);
        simpleItem(ModItems.RAW_CHICKENITE);
        simpleItem(ModItems.RAW_DECAYRON);
        simpleItem(ModItems.RAW_MUTTONIUM);
        simpleItem(ModItems.RAW_PARAFISH);
        simpleItem(ModItems.RAW_RABBIDDIUM);
        simpleItem(ModItems.RAW_STEAKITE);

        simpleItem(ModItems.BACONIUM_INGOT);
        simpleItem(ModItems.CHICKENITE_INGOT);
        simpleItem(ModItems.DECAYRON_INGOT);
        simpleItem(ModItems.MUTTONIUM_INGOT);
        simpleItem(ModItems.PARAFISH_INGOT);
        simpleItem(ModItems.RABBIDDIUM_INGOT);
        simpleItem(ModItems.STEAKITE_INGOT);

        simpleItem(ModItems.BACONIUM_NUGGET);
        simpleItem(ModItems.CHICKENITE_NUGGET);
        simpleItem(ModItems.DECAYRON_NUGGET);
        simpleItem(ModItems.MUTTONIUM_NUGGET);
        simpleItem(ModItems.PARAFISH_NUGGET);
        simpleItem(ModItems.RABBIDDIUM_NUGGET);
        simpleItem(ModItems.STEAKITE_NUGGET);

        simpleItem(ModItems.FULLFILLING_FOODIUM_PIE);
        simpleItem(ModItems.HEAVYWEIGHT_MEAL);
        simpleItem(ModItems.LIGHTWEIGHT_MEAL);
        simpleItem(ModItems.PARAFISH_MEAL);


    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FoodiumMod.MODID,"item/" + item.getId().getPath()));
    }
}
