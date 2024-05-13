package io.github.janlout.foodium.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties RAW_BACONIUM = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_BACONIUM = new FoodProperties.Builder().nutrition(8).saturationMod(0.8F).build();

    public static final FoodProperties RAW_CHICKENITE = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_CHICKENITE = new FoodProperties.Builder().nutrition(6).saturationMod(0.6F).build();

    public static final FoodProperties RAW_DECAYRON = new FoodProperties.Builder().nutrition(2).saturationMod(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300), 1.0F)
            .alwaysEat()
            .build();
    public static final FoodProperties COOKED_DECAYRON = new FoodProperties.Builder().nutrition(4).saturationMod(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300), 0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 150), 0.5F)
            .alwaysEat()
            .build();

    public static final FoodProperties RAW_MUTTONIUM = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_MUTTONIUM = new FoodProperties.Builder().nutrition(6).saturationMod(0.8F).build();

    public static final FoodProperties RAW_PARAFISH = new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties COOKED_PARAFISH = new FoodProperties.Builder().nutrition(5).saturationMod(0.7F).build();

    public static final FoodProperties RAW_RABBIDDIUM = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_RABBIDDIUM = new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build();

    public static final FoodProperties RAW_STEAKITE = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties COOKED_STEAKITE = new FoodProperties.Builder().nutrition(8).saturationMod(0.8F).build();

    public static final FoodProperties PARAFISH_MEAL = new FoodProperties.Builder().nutrition(9).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 600), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1.0F)
            .fast()
            .build();

    public static final FoodProperties LIGHTWEIGHT_MEAL = new FoodProperties.Builder().nutrition(8).saturationMod(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 600), 1.0F)
            .fast()
            .build();

    public static final FoodProperties HEAVYWEIGHT_MEAL = new FoodProperties.Builder().nutrition(12).saturationMod(0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600), 1.0F)
            .fast()
            .build();

    public static final FoodProperties FOODIUM_PIE = new FoodProperties.Builder().nutrition(20).saturationMod(1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 600), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 600), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 600), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 600), 1.0F)
            .fast()
            .build();


}
