package com.gmail.rohzek.smithtable.datagen;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SmithingTransformRecipe;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AUSUpgradeRecipeBuilder {
	/*
	private final RecipeCategory category;
	private final Ingredient template;
	private final Ingredient base;
	private final Ingredient addition;
	private final Item result;
	private final String difficulty;
	private Map<String, Criterion<?>> criteria = new LinkedHashMap<>();

	public AUSUpgradeRecipeBuilder(Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result, String difficulty) {
		this.category = category;
		this.template = template;
		this.base = base;
		this.addition = addition;
		this.result = result;
		this.difficulty = difficulty;
	}

	public static AUSUpgradeRecipeBuilder upgrade(
			Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result, String difficulty
	) {
		return new AUSUpgradeRecipeBuilder(template, base, addition, category, result, difficulty);
	}

	public AUSUpgradeRecipeBuilder unlocks(String key, Criterion<?> criterion) {
		this.criteria.put(key, criterion);
		return this;
	}

	public void save(RecipeOutput recipeOutput, String recipeId) {
		this.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Reference.MODID, recipeId));
	}

	public void save(RecipeOutput recipeOutput, ResourceLocation recipeId) {
		this.ensureValid(recipeId);
		Advancement.Builder advancementBuilder = recipeOutput.advancement()
				.addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId))
				.rewards(AdvancementRewards.Builder.recipe(recipeId))
				.requirements(AdvancementRequirements.Strategy.OR);
		this.criteria.forEach(advancementBuilder::addCriterion);
		SmithingTableRecipe smithingTableRecipe = new SmithingTableRecipe(this.template, this.base, this.addition, new ItemStack(this.result), this.difficulty);
		recipeOutput.accept(recipeId, smithingTableRecipe, advancementBuilder.build(recipeId.withPrefix("recipes/" + this.category.getFolderName() + "/")));
	}

	private void ensureValid(ResourceLocation location) {
		if (this.criteria.isEmpty()) {
			throw new IllegalStateException("No way of obtaining recipe " + location);
		}
	}
	 */

	private final Ingredient template;
	private final Ingredient base;
	private final Ingredient addition;
	private final RecipeCategory category;
	private final Item result;
	private final Map<String, Criterion<?>> criteria = new LinkedHashMap<>();
	protected final List<ICondition> conditions = new ArrayList<>();

	public AUSUpgradeRecipeBuilder(Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result) {
		this.category = category;
		this.template = template;
		this.base = base;
		this.addition = addition;
		this.result = result;
	}

	public static AUSUpgradeRecipeBuilder smithing(
			Ingredient template, Ingredient base, Ingredient addition, RecipeCategory category, Item result
	) {
		return new AUSUpgradeRecipeBuilder(template, base, addition, category, result);
	}

	public AUSUpgradeRecipeBuilder unlocks(String key, Criterion<?> criterion) {
		this.criteria.put(key, criterion);
		return this;
	}

	public AUSUpgradeRecipeBuilder addCondition(@Nullable ICondition condition) {
		if (condition != null) {
			this.conditions.add(condition);
		}
		return this;
	}

	public void save(RecipeOutput recipeOutput, String recipeId) {
		this.save(recipeOutput, ResourceLocation.parse(recipeId));
	}

	public void save(RecipeOutput recipeOutput, ResourceLocation recipeId) {
		this.ensureValid(recipeId);
		ICondition[] finalConditions = new ICondition[this.conditions.size()];
		finalConditions = this.conditions.toArray(finalConditions);
		RecipeOutput conditionalRecipeOutput = !this.conditions.isEmpty() ? recipeOutput.withConditions(finalConditions) : recipeOutput;
		Advancement.Builder advancement$builder = conditionalRecipeOutput.advancement()
				.addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId))
				.rewards(AdvancementRewards.Builder.recipe(recipeId))
				.requirements(AdvancementRequirements.Strategy.OR);
		this.criteria.forEach(advancement$builder::addCriterion);
		SmithingTransformRecipe smithingtransformrecipe = new SmithingTransformRecipe(this.template, this.base, this.addition, new ItemStack(this.result));
		conditionalRecipeOutput.accept(recipeId, smithingtransformrecipe, advancement$builder.build(recipeId.withPrefix("recipes/" + this.category.getFolderName() + "/")));
	}

	private void ensureValid(ResourceLocation location) {
		if (this.criteria.isEmpty()) {
			throw new IllegalStateException("No way of obtaining recipe " + location);
		}
	}
}
