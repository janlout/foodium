package io.github.janlout.foodium.datagen;

import io.github.janlout.foodium.FoodiumMod;
import io.github.janlout.foodium.block.ModBlocks;
import io.github.janlout.foodium.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> BACONIUM_SMELTABLES = List.of(ModItems.RAW_BACONIUM.get(), ModBlocks.BACONIUM_ORE.get());
    private static final List<ItemLike> CHICKENITE_SMELTABLES = List.of(ModItems.RAW_CHICKENITE.get(), ModBlocks.CHICKENITE_ORE.get());
    private static final List<ItemLike> DECAYRON_SMELTABLES = List.of(ModItems.RAW_DECAYRON.get(), ModBlocks.DECAYRON_ORE.get());
    private static final List<ItemLike> MUTTONIUM_SMELTABLES = List.of(ModItems.RAW_MUTTONIUM.get(), ModBlocks.MUTTONIUM_ORE.get());
    private static final List<ItemLike> PARAFISH_SMELTABLES = List.of(ModItems.RAW_PARAFISH.get(), ModBlocks.PARAFISH_ORE.get());
    private static final List<ItemLike> RABBIDDIUM_SMELTABLES = List.of(ModItems.RAW_RABBIDDIUM.get(), ModBlocks.RABBIDDIUM_ORE.get());
    private static final List<ItemLike> STEAKITE_SMELTABLES = List.of(ModItems.RAW_STEAKITE.get(), ModBlocks.STEAKITE_ORE.get());


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        oreBlasting(recipeOutput, BACONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.BACONIUM_INGOT.get(),0.25f, 100, "baconium");
        oreBlasting(recipeOutput, CHICKENITE_SMELTABLES, RecipeCategory.MISC, ModItems.CHICKENITE_INGOT.get(),0.25f, 100, "chickenite");
        oreBlasting(recipeOutput, DECAYRON_SMELTABLES, RecipeCategory.MISC, ModItems.DECAYRON_INGOT.get(),0.25f, 100, "decayron");
        oreBlasting(recipeOutput, MUTTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.MUTTONIUM_INGOT.get(),0.25f, 100, "muttonium");
        oreBlasting(recipeOutput, PARAFISH_SMELTABLES, RecipeCategory.MISC, ModItems.PARAFISH_INGOT.get(),0.25f, 100, "parafish");
        oreBlasting(recipeOutput, RABBIDDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RABBIDDIUM_INGOT.get(),0.25f, 100, "rabbiddium");
        oreBlasting(recipeOutput, STEAKITE_SMELTABLES, RecipeCategory.MISC, ModItems.STEAKITE_INGOT.get(),0.25f, 100, "steakite");

        oreSmelting(recipeOutput, BACONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.BACONIUM_INGOT.get(),0.25f, 100, "baconium");
        oreSmelting(recipeOutput, CHICKENITE_SMELTABLES, RecipeCategory.MISC, ModItems.CHICKENITE_INGOT.get(),0.25f, 100, "chickenite");
        oreSmelting(recipeOutput, DECAYRON_SMELTABLES, RecipeCategory.MISC, ModItems.DECAYRON_INGOT.get(),0.25f, 100, "decayron");
        oreSmelting(recipeOutput, MUTTONIUM_SMELTABLES, RecipeCategory.MISC, ModItems.MUTTONIUM_INGOT.get(),0.25f, 100, "muttonium");
        oreSmelting(recipeOutput, PARAFISH_SMELTABLES, RecipeCategory.MISC, ModItems.PARAFISH_INGOT.get(),0.25f, 100, "parafish");
        oreSmelting(recipeOutput, RABBIDDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.RABBIDDIUM_INGOT.get(),0.25f, 100, "rabbiddium");
        oreSmelting(recipeOutput, STEAKITE_SMELTABLES, RecipeCategory.MISC, ModItems.STEAKITE_INGOT.get(),0.25f, 100, "steakite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BACONIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.BACONIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.BACONIUM_INGOT.get()), has(ModItems.BACONIUM_INGOT.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BACONIUM_INGOT.get(), 9)
                .requires(ModBlocks.BACONIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BACONIUM_BLOCK.get()), has(ModBlocks.BACONIUM_BLOCK.get()))
                .save(recipeOutput);
    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, FoodiumMod.MODID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }
}