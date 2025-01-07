package com.gmail.rohzek.smithtable.datagen;

import com.gmail.rohzek.smithtable.armor.AUSArmors;
import com.gmail.rohzek.smithtable.items.AUSItems;
import com.gmail.rohzek.smithtable.lib.ConfigCondition;
import com.gmail.rohzek.smithtable.lib.Reference;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.common.conditions.NotCondition;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		super(packOutput, lookupProvider);
	}

	@Override
	protected void buildRecipes(RecipeOutput recipeOutput) {
		axes(recipeOutput);
		pickaxes(recipeOutput);
		shovels(recipeOutput);
		hoes(recipeOutput);
		swords(recipeOutput);
		bootsUpgrades(recipeOutput);
		chestplateUpgrades(recipeOutput);
		helmetUpgrades(recipeOutput);
		leggingsUpgrades(recipeOutput);
		horseArmors(recipeOutput);
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, AUSItems.SMITHING_TEMPLATE)
				.define('s', Tags.Items.STONES)
				.define('r', Items.REDSTONE)
				.pattern("sss")
				.pattern("srs")
				.pattern("sss")
				.unlockedBy("has_redstone", has(Items.REDSTONE))
				.save(recipeOutput);
	}

	private static void axes(RecipeOutput recipeOutput) {
		axe(recipeOutput, Tags.Items.INGOTS_COPPER, AUSItems.AXE_COPPER);
		materialUpgrade(recipeOutput, AUSItems.AXE_COPPER.get(), Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_COPPER.get(), null);
		materialUpgrade(recipeOutput, AUSItems.AXE_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, Items.IRON_AXE, false);
		materialUpgrade(recipeOutput, AUSItems.AXE_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, Items.IRON_AXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_IRON.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_IRON.get(), true);
		materialUpgrade(recipeOutput, Items.DIAMOND_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), false);
		materialUpgrade(recipeOutput, Items.DIAMOND_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_NETHERITE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_NETHERITE.get(), true);
		materialUpgrade(recipeOutput, Items.GOLDEN_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_GOLD.get(), null);
		materialUpgrade(recipeOutput, Items.GOLDEN_AXE, Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, Items.DIAMOND_AXE, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_AXE, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, Items.DIAMOND_AXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_GOLD.get(), Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), null);
		materialUpgrade(recipeOutput, Items.IRON_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_IRON.get(), null);
		materialUpgrade(recipeOutput, Items.IRON_AXE, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, Items.GOLDEN_AXE, false);
		materialUpgrade(recipeOutput, Items.IRON_AXE, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, Items.GOLDEN_AXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_IRON.get(), Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_GOLD.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_IRON.get(), Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_GOLD.get(), true);
		materialUpgrade(recipeOutput, Items.NETHERITE_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_NETHERITE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_STONE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_AXE, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.AXE_COPPER.get(), false);
		materialUpgrade(recipeOutput, Items.STONE_AXE, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.AXE_COPPER.get(), true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_STONE.get(), Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_COPPER.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_STONE.get(), Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_COPPER.get(), true);
		materialUpgrade(recipeOutput, Items.WOODEN_AXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_WOOD.get(), null);
		materialUpgrade(recipeOutput, Items.WOODEN_AXE, Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, Items.STONE_AXE, false);
		materialUpgrade(recipeOutput, Items.WOODEN_AXE, Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, Items.STONE_AXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_WOOD.get(), Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_STONE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_AXE_WOOD.get(), Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_AXE_STONE.get(), true);
	}

	private static void pickaxes(RecipeOutput recipeOutput) {
		pickaxe(recipeOutput, Tags.Items.INGOTS_COPPER, AUSItems.PICKAXE_COPPER);
		materialUpgrade(recipeOutput, AUSItems.PICKAXE_COPPER.get(), Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), null);
		materialUpgrade(recipeOutput, AUSItems.PICKAXE_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, Items.IRON_PICKAXE, false);
		materialUpgrade(recipeOutput, AUSItems.PICKAXE_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, Items.IRON_PICKAXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), true);
		materialUpgrade(recipeOutput, Items.DIAMOND_PICKAXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), null);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_NETHERITE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_NETHERITE.get(), true);
		materialUpgrade(recipeOutput, Items.GOLDEN_PICKAXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), null);
		materialUpgrade(recipeOutput, Items.GOLDEN_PICKAXE, Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, Items.DIAMOND_PICKAXE, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_PICKAXE, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, Items.DIAMOND_PICKAXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), true);
		materialUpgrade(recipeOutput, Items.IRON_PICKAXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), null);
		materialUpgrade(recipeOutput, Items.IRON_PICKAXE, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, Items.GOLDEN_PICKAXE, false);
		materialUpgrade(recipeOutput, Items.IRON_PICKAXE, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, Items.GOLDEN_PICKAXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), true);
		materialUpgrade(recipeOutput, Items.NETHERITE_PICKAXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_NETHERITE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_PICKAXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_PICKAXE, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.PICKAXE_COPPER.get(), false);
		materialUpgrade(recipeOutput, Items.STONE_PICKAXE, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.PICKAXE_COPPER.get(), true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), true);
		materialUpgrade(recipeOutput, Items.WOODEN_PICKAXE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get(), null);
		materialUpgrade(recipeOutput, Items.WOODEN_PICKAXE, Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, Items.STONE_PICKAXE, false);
		materialUpgrade(recipeOutput, Items.WOODEN_PICKAXE, Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, Items.STONE_PICKAXE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get(), Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get(), Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), true);
	}

	private static void shovels(RecipeOutput recipeOutput) {
		shovel(recipeOutput, Tags.Items.INGOTS_COPPER, AUSItems.SHOVEL_COPPER);
		materialUpgrade(recipeOutput, AUSItems.SHOVEL_COPPER.get(), Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), null);
		materialUpgrade(recipeOutput, AUSItems.SHOVEL_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, Items.IRON_SHOVEL, false);
		materialUpgrade(recipeOutput, AUSItems.SHOVEL_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, Items.IRON_SHOVEL, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), true);
		materialUpgrade(recipeOutput, Items.DIAMOND_SHOVEL, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), null);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_NETHERITE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_NETHERITE.get(), true);
		materialUpgrade(recipeOutput, Items.GOLDEN_SHOVEL, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), null);
		materialUpgrade(recipeOutput, Items.GOLDEN_SHOVEL, Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, Items.DIAMOND_SHOVEL, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_SHOVEL, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, Items.DIAMOND_SHOVEL, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), true);
		materialUpgrade(recipeOutput, Items.IRON_SHOVEL, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), null);
		materialUpgrade(recipeOutput, Items.IRON_SHOVEL, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, Items.GOLDEN_SHOVEL, false);
		materialUpgrade(recipeOutput, Items.IRON_SHOVEL, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, Items.GOLDEN_SHOVEL, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), true);
		materialUpgrade(recipeOutput, Items.NETHERITE_SHOVEL, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_NETHERITE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_SHOVEL, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_SHOVEL, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.SHOVEL_COPPER.get(), false);
		materialUpgrade(recipeOutput, Items.STONE_SHOVEL, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.SHOVEL_COPPER.get(), true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), true);
		materialUpgrade(recipeOutput, Items.WOODEN_SHOVEL, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_WOOD.get(), null);
		materialUpgrade(recipeOutput, Items.WOODEN_SHOVEL, Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, Items.STONE_SHOVEL, false);
		materialUpgrade(recipeOutput, Items.WOODEN_SHOVEL, Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, Items.STONE_SHOVEL, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_WOOD.get(), Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_SHOVEL_WOOD.get(), Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), true);
	}

	private static void hoes(RecipeOutput recipeOutput) {
		hoe(recipeOutput, Tags.Items.INGOTS_COPPER, AUSItems.HOE_COPPER);
		materialUpgrade(recipeOutput, AUSItems.HOE_COPPER.get(), Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_COPPER.get(), null);
		materialUpgrade(recipeOutput, AUSItems.HOE_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, Items.IRON_HOE, false);
		materialUpgrade(recipeOutput, AUSItems.HOE_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, Items.IRON_HOE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_IRON.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_IRON.get(), true);
		materialUpgrade(recipeOutput, Items.DIAMOND_HOE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), null);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_NETHERITE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_NETHERITE.get(), true);
		materialUpgrade(recipeOutput, Items.GOLDEN_HOE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_GOLD.get(), null);
		materialUpgrade(recipeOutput, Items.GOLDEN_HOE, Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, Items.DIAMOND_HOE, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_HOE, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, Items.DIAMOND_HOE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_GOLD.get(), Ingredient.of(Items.DIAMOND), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_GOLD.get(), Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), true);
		materialUpgrade(recipeOutput, Items.IRON_HOE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_IRON.get(), null);
		materialUpgrade(recipeOutput, Items.IRON_HOE, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, Items.GOLDEN_HOE, false);
		materialUpgrade(recipeOutput, Items.IRON_HOE, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, Items.GOLDEN_HOE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_IRON.get(), Ingredient.of(Items.GOLD_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_GOLD.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_IRON.get(), Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_GOLD.get(), true);
		materialUpgrade(recipeOutput, Items.NETHERITE_HOE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_NETHERITE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_HOE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_STONE.get(), null);
		materialUpgrade(recipeOutput, Items.STONE_HOE, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.HOE_COPPER.get(), false);
		materialUpgrade(recipeOutput, Items.STONE_HOE, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.HOE_COPPER.get(), true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_STONE.get(), Ingredient.of(Items.COPPER_INGOT), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_COPPER.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_STONE.get(), Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_COPPER.get(), true);
		materialUpgrade(recipeOutput, Items.WOODEN_HOE, Ingredient.of(Items.OBSIDIAN), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_WOOD.get(), null);
		materialUpgrade(recipeOutput, Items.WOODEN_HOE, Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, Items.STONE_HOE, false);
		materialUpgrade(recipeOutput, Items.WOODEN_HOE, Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, Items.STONE_HOE, true);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_WOOD.get(), Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_STONE.get(), false);
		materialUpgrade(recipeOutput, AUSItems.OBSIDIANIZED_HOE_WOOD.get(), Ingredient.of(Tags.Items.STONES), RecipeCategory.TOOLS, AUSItems.OBSIDIANIZED_HOE_STONE.get(), true);
	}

	private static void swords(RecipeOutput recipeOutput) {
		sword(recipeOutput, Tags.Items.INGOTS_COPPER, AUSItems.SWORD_COPPER);
		materialUpgrade(recipeOutput, AUSItems.SWORD_COPPER.get(), Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_COPPER.get(), false);
		materialUpgrade(recipeOutput, AUSItems.SWORD_COPPER.get(), Ingredient.of(Items.QUARTZ_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_COPPER.get(), true);
		materialUpgrade(recipeOutput, AUSItems.SWORD_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, Items.IRON_SWORD, false);
		materialUpgrade(recipeOutput, AUSItems.SWORD_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, Items.IRON_SWORD, true);
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_COPPER.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_IRON.get(), false, "2");
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_COPPER.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_IRON.get(), true, "2");
		materialUpgrade(recipeOutput, Items.DIAMOND_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), false);
		materialUpgrade(recipeOutput, Items.DIAMOND_SWORD, Ingredient.of(Items.QUARTZ_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), true);
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_NETHERITE.get(), false, "2");
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), Ingredient.of(Items.NETHERITE_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_NETHERITE.get(), true, "2");
		materialUpgrade(recipeOutput, Items.GOLDEN_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_GOLD.get(), false);
		materialUpgrade(recipeOutput, Items.GOLDEN_SWORD, Ingredient.of(Items.QUARTZ_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_GOLD.get(), true);
		materialUpgrade(recipeOutput, Items.GOLDEN_SWORD, Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, Items.DIAMOND_SWORD, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_SWORD, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, Items.DIAMOND_SWORD, true);
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_GOLD.get(), Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), false, "2");
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_GOLD.get(), Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), true, "2");
		materialUpgrade(recipeOutput, Items.IRON_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_IRON.get(), false);
		materialUpgrade(recipeOutput, Items.IRON_SWORD, Ingredient.of(Items.QUARTZ_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_IRON.get(), true);
		materialUpgrade(recipeOutput, Items.IRON_SWORD, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, Items.GOLDEN_SWORD, false);
		materialUpgrade(recipeOutput, Items.IRON_SWORD, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, Items.GOLDEN_SWORD, true);
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_IRON.get(), Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_GOLD.get(), false, "2");
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_IRON.get(), Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_GOLD.get(), true, "2");
		materialUpgrade(recipeOutput, Items.NETHERITE_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_NETHERITE.get(), false);
		materialUpgrade(recipeOutput, Items.NETHERITE_SWORD, Ingredient.of(Items.QUARTZ_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_NETHERITE.get(), true);
		materialUpgrade(recipeOutput, Items.STONE_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_STONE.get(), false);
		materialUpgrade(recipeOutput, Items.STONE_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_STONE.get(), true);
		materialUpgrade(recipeOutput, Items.STONE_SWORD, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSItems.SWORD_COPPER.get(), false);
		materialUpgrade(recipeOutput, Items.STONE_SWORD, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSItems.SWORD_COPPER.get(), true);
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_STONE.get(), Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_COPPER.get(), false, "2");
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_STONE.get(), Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_COPPER.get(), true, "2");
		materialUpgrade(recipeOutput, Items.WOODEN_SWORD, Ingredient.of(Items.QUARTZ), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_WOOD.get(), false);
		materialUpgrade(recipeOutput, Items.WOODEN_SWORD, Ingredient.of(Items.QUARTZ_BLOCK), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_WOOD.get(), true);
		materialUpgrade(recipeOutput, Items.WOODEN_SWORD, Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.COMBAT, Items.STONE_SWORD, false);
		materialUpgrade(recipeOutput, Items.WOODEN_SWORD, Ingredient.of(Tags.Items.STONES), RecipeCategory.COMBAT, Items.STONE_SWORD, true);
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_WOOD.get(), Ingredient.of(Tags.Items.COBBLESTONES), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_STONE.get(), false, "2");
		materialUpgrade(recipeOutput, AUSItems.QUARTZIFIED_SWORD_WOOD.get(), Ingredient.of(Tags.Items.STONES), RecipeCategory.COMBAT, AUSItems.QUARTZIFIED_SWORD_STONE.get(), true, "2");
	}

	private static void bootsUpgrades(RecipeOutput recipeOutput) {
		boots(recipeOutput, Tags.Items.INGOTS_COPPER, AUSArmors.COPPER_BOOTS.get());
		materialUpgrade(recipeOutput, Items.CHAINMAIL_BOOTS, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSArmors.COPPER_BOOTS.get(), false);
		materialUpgrade(recipeOutput, Items.CHAINMAIL_BOOTS, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSArmors.COPPER_BOOTS.get(), true);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_BOOTS.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, Items.IRON_BOOTS, false);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_BOOTS.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, Items.IRON_BOOTS, true);
		materialUpgrade(recipeOutput, Items.GOLDEN_BOOTS, Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, Items.DIAMOND_BOOTS, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_BOOTS, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, Items.DIAMOND_BOOTS, true);
		materialUpgrade(recipeOutput, Items.IRON_BOOTS, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, Items.GOLDEN_BOOTS, false);
		materialUpgrade(recipeOutput, Items.IRON_BOOTS, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, Items.GOLDEN_BOOTS, true);
		materialUpgrade(recipeOutput, Items.LEATHER_BOOTS, Ingredient.of(Items.IRON_NUGGET), RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS, false);
		materialUpgrade(recipeOutput, Items.LEATHER_BOOTS, Ingredient.of(Items.CHAIN), RecipeCategory.COMBAT, Items.CHAINMAIL_BOOTS, true);
	}

	private static void chestplateUpgrades(RecipeOutput recipeOutput) {
		chestplate(recipeOutput, Tags.Items.INGOTS_COPPER, AUSArmors.COPPER_CHESTPLATE.get());
		materialUpgrade(recipeOutput, Items.CHAINMAIL_CHESTPLATE, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSArmors.COPPER_CHESTPLATE.get(), false);
		materialUpgrade(recipeOutput, Items.CHAINMAIL_CHESTPLATE, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSArmors.COPPER_CHESTPLATE.get(), true);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_CHESTPLATE.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, Items.IRON_CHESTPLATE, false);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_CHESTPLATE.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, Items.IRON_CHESTPLATE, true);
		materialUpgrade(recipeOutput, Items.GOLDEN_CHESTPLATE, Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, Items.DIAMOND_CHESTPLATE, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_CHESTPLATE, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, Items.DIAMOND_CHESTPLATE, true);
		materialUpgrade(recipeOutput, Items.IRON_CHESTPLATE, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, Items.GOLDEN_CHESTPLATE, false);
		materialUpgrade(recipeOutput, Items.IRON_CHESTPLATE, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, Items.GOLDEN_CHESTPLATE, true);
		materialUpgrade(recipeOutput, Items.LEATHER_CHESTPLATE, Ingredient.of(Items.IRON_NUGGET), RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE, false);
		materialUpgrade(recipeOutput, Items.LEATHER_CHESTPLATE, Ingredient.of(Items.CHAIN), RecipeCategory.COMBAT, Items.CHAINMAIL_CHESTPLATE, true);
	}

	private static void helmetUpgrades(RecipeOutput recipeOutput) {
		helmet(recipeOutput, Tags.Items.INGOTS_COPPER, AUSArmors.COPPER_HELMET.get());
		materialUpgrade(recipeOutput, Items.CHAINMAIL_HELMET, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSArmors.COPPER_HELMET.get(), false);
		materialUpgrade(recipeOutput, Items.CHAINMAIL_HELMET, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSArmors.COPPER_HELMET.get(), true);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_HELMET.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, Items.IRON_HELMET, false);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_HELMET.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, Items.IRON_HELMET, true);
		materialUpgrade(recipeOutput, Items.GOLDEN_HELMET, Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, Items.DIAMOND_HELMET, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_HELMET, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, Items.DIAMOND_HELMET, true);
		materialUpgrade(recipeOutput, Items.IRON_HELMET, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, Items.GOLDEN_HELMET, false);
		materialUpgrade(recipeOutput, Items.IRON_HELMET, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, Items.GOLDEN_HELMET, true);
		materialUpgrade(recipeOutput, Items.LEATHER_HELMET, Ingredient.of(Items.IRON_NUGGET), RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET, false);
		materialUpgrade(recipeOutput, Items.LEATHER_HELMET, Ingredient.of(Items.CHAIN), RecipeCategory.COMBAT, Items.CHAINMAIL_HELMET, true);
	}

	private static void leggingsUpgrades(RecipeOutput recipeOutput) {
		leggings(recipeOutput, Tags.Items.INGOTS_COPPER, AUSArmors.COPPER_LEGGINGS.get());
		materialUpgrade(recipeOutput, Items.CHAINMAIL_LEGGINGS, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSArmors.COPPER_LEGGINGS.get(), false);
		materialUpgrade(recipeOutput, Items.CHAINMAIL_LEGGINGS, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSArmors.COPPER_LEGGINGS.get(), true);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_LEGGINGS.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, Items.IRON_LEGGINGS, false);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_LEGGINGS.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, Items.IRON_LEGGINGS, true);
		materialUpgrade(recipeOutput, Items.GOLDEN_LEGGINGS, Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, Items.DIAMOND_LEGGINGS, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_LEGGINGS, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, Items.DIAMOND_LEGGINGS, true);
		materialUpgrade(recipeOutput, Items.IRON_LEGGINGS, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, Items.GOLDEN_LEGGINGS, false);
		materialUpgrade(recipeOutput, Items.IRON_LEGGINGS, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, Items.GOLDEN_LEGGINGS, true);
		materialUpgrade(recipeOutput, Items.LEATHER_LEGGINGS, Ingredient.of(Items.IRON_NUGGET), RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS, false);
		materialUpgrade(recipeOutput, Items.LEATHER_LEGGINGS, Ingredient.of(Items.CHAIN), RecipeCategory.COMBAT, Items.CHAINMAIL_LEGGINGS, true);
	}

	private static void horseArmors(RecipeOutput recipeOutput) {
		materialUpgrade(recipeOutput, Items.LEATHER_HORSE_ARMOR, Ingredient.of(Items.COPPER_INGOT), RecipeCategory.COMBAT, AUSArmors.COPPER_HORSE_ARMOR.get(), false);
		materialUpgrade(recipeOutput, Items.LEATHER_HORSE_ARMOR, Ingredient.of(Items.COPPER_BLOCK), RecipeCategory.COMBAT, AUSArmors.COPPER_HORSE_ARMOR.get(), true);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_HORSE_ARMOR.get(), Ingredient.of(Items.IRON_INGOT), RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR, false);
		materialUpgrade(recipeOutput, AUSArmors.COPPER_HORSE_ARMOR.get(), Ingredient.of(Items.IRON_BLOCK), RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR, true);
		materialUpgrade(recipeOutput, Items.IRON_HORSE_ARMOR, Ingredient.of(Items.GOLD_INGOT), RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR, false);
		materialUpgrade(recipeOutput, Items.IRON_HORSE_ARMOR, Ingredient.of(Items.GOLD_BLOCK), RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR, true);
		materialUpgrade(recipeOutput, Items.GOLDEN_HORSE_ARMOR, Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR, false);
		materialUpgrade(recipeOutput, Items.GOLDEN_HORSE_ARMOR, Ingredient.of(Items.DIAMOND_BLOCK), RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR, true);
		materialUpgradeVanillaStyle(recipeOutput, Items.DIAMOND_HORSE_ARMOR, Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, AUSArmors.NETHERITE_HORSE_ARMOR.get(), false);
		materialUpgradeVanillaStyle(recipeOutput, Items.DIAMOND_HORSE_ARMOR, Ingredient.of(Items.NETHERITE_INGOT), RecipeCategory.COMBAT, AUSArmors.NETHERITE_HORSE_ARMOR.get(), true);
	}

	protected static void boots(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
				.define('X', material)
				.pattern("X X")
				.pattern("X X")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void chestplate(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
				.define('X', material)
				.pattern("X X")
				.pattern("XXX")
				.pattern("XXX")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void helmet(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
				.define('X', material)
				.pattern("XXX")
				.pattern("X X")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void leggings(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
				.define('X', material)
				.pattern("XXX")
				.pattern("X X")
				.pattern("X X")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void axe(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
				.define('#', Tags.Items.RODS_WOODEN)
				.define('X', material)
				.pattern("XX")
				.pattern("X#")
				.pattern(" #")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void pickaxe(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
				.define('#', Tags.Items.RODS_WOODEN)
				.define('X', material)
				.pattern("XXX")
				.pattern(" # ")
				.pattern(" # ")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void shovel(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
				.define('#', Tags.Items.RODS_WOODEN)
				.define('X', material)
				.pattern("X")
				.pattern("#")
				.pattern("#")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void hoe(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
				.define('#', Tags.Items.RODS_WOODEN)
				.define('X', material)
				.pattern("XX")
				.pattern(" #")
				.pattern(" #")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void sword(RecipeOutput recipeOutput, TagKey<Item> material, ItemLike result) {
		ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
				.define('#', Tags.Items.RODS_WOODEN)
				.define('X', material)
				.pattern("X")
				.pattern("X")
				.pattern("#")
				.unlockedBy("has_material", has(material))
				.save(recipeOutput);
	}

	protected static void materialUpgrade(RecipeOutput recipeOutput, Item baseItem, Ingredient upgradeItem, RecipeCategory category, Item resultItem, Boolean isHard) {
		materialUpgrade(recipeOutput, baseItem, upgradeItem, category, resultItem, isHard, null);
	}

	protected static void materialUpgrade(RecipeOutput recipeOutput, Item baseItem, Ingredient upgradeItem, RecipeCategory category, Item resultItem, Boolean isHard, String suffix) {
		AUSUpgradeRecipeBuilder builder = AUSUpgradeRecipeBuilder.smithing(
						Ingredient.of(AUSItems.SMITHING_TEMPLATE), Ingredient.of(baseItem), upgradeItem, category, resultItem
				)
				.unlocks("has_upgrade_item", has(upgradeItem.getItems()[0].getItem()));
				if (isHard != null) builder.addCondition(isHard ? new ConfigCondition() : new NotCondition(new ConfigCondition()));
				builder.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Reference.MODID, "upgrade/" + (isHard == null ? "" : (isHard ? "hard/" : "easy/")) + getItemName(resultItem) + (suffix != null ? suffix : "")));
	}
	
	protected static void materialUpgradeVanillaStyle(RecipeOutput recipeOutput, Item baseItem, Ingredient upgradeItem, RecipeCategory category, Item resultItem, Boolean isHard) {
		materialUpgradeVanillaStyle(recipeOutput, baseItem, upgradeItem, category, resultItem, isHard, null);
	}
	
	protected static void materialUpgradeVanillaStyle(RecipeOutput recipeOutput, Item baseItem, Ingredient upgradeItem, RecipeCategory category, Item resultItem, Boolean isHard, String suffix) {
		AUSUpgradeRecipeBuilder builder = AUSUpgradeRecipeBuilder.smithing(
						Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(baseItem), upgradeItem, category, resultItem
				)
				.unlocks("has_upgrade_item", has(upgradeItem.getItems()[0].getItem()));
				if (isHard != null) builder.addCondition(isHard ? new ConfigCondition() : new NotCondition(new ConfigCondition()));
				builder.save(recipeOutput, ResourceLocation.fromNamespaceAndPath(Reference.MODID, "upgrade/" + (isHard == null ? "" : (isHard ? "hard/" : "easy/")) + getItemName(resultItem) + (suffix != null ? suffix : "")));
	}
}
