package com.gmail.rohzek.smithtable.items;


import com.gmail.rohzek.smithtable.lib.DeferredRegistration;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.RegistryObject;

public class AUSItems 
{
	//minecraft:obsidian
	//actuallyusefulsmithingtable
	public static final RegistryObject<Item> AXE_COPPER = DeferredRegistration.ITEMS.register("copper_axe", () -> new SmithingItemAxe(Tiers.IRON, 1, -2.8f));
	public static final RegistryObject<Item> PICKAXE_COPPER = DeferredRegistration.ITEMS.register("copper_pickaxe", () -> new SmithingItemPickaxe(Tiers.IRON, 1, -2.8f));
	public static final RegistryObject<Item> HOE_COPPER = DeferredRegistration.ITEMS.register("copper_hoe", () -> new SmithingItemHoe(Tiers.IRON, 1, -2.8f));
	public static final RegistryObject<Item> SHOVEL_COPPER = DeferredRegistration.ITEMS.register("copper_shovel", () -> new SmithingItemShovel(Tiers.IRON, 1, -2.8f));
	public static final RegistryObject<Item> SWORD_COPPER = DeferredRegistration.ITEMS.register("copper_sword", () -> new SmithingItemSword(Tiers.IRON, 3, -2.4f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_axe", () -> new SmithingItemObsidianAxe(Tiers.WOOD, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_axe", () -> new SmithingItemObsidianAxe(Tiers.STONE, 7f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_axe", () -> new SmithingItemObsidianAxe(Tiers.GOLD, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_axe", () -> new SmithingItemObsidianAxe(Tiers.IRON, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_axe", () -> new SmithingItemObsidianAxe(Tiers.IRON, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_axe", () -> new SmithingItemObsidianAxe(Tiers.DIAMOND, 5f, -3.0f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_axe", () -> new SmithingItemObsidianAxe(Tiers.NETHERITE, 5f, -3.0f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.WOOD, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.STONE, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.GOLD, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.IRON, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.IRON, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.DIAMOND, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_pickaxe", () -> new SmithingItemObsidianPickaxe(Tiers.NETHERITE, 1, -2.8f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_hoe", () -> new SmithingItemObsidianHoe(Tiers.WOOD, 0, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_hoe", () -> new SmithingItemObsidianHoe(Tiers.STONE, -1, -2f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_hoe", () -> new SmithingItemObsidianHoe(Tiers.GOLD, 0, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_hoe", () -> new SmithingItemObsidianHoe(Tiers.IRON, -2, -1f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_hoe", () -> new SmithingItemObsidianHoe(Tiers.IRON, -2, -1f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_hoe", () -> new SmithingItemObsidianHoe(Tiers.DIAMOND, -3, 0f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_hoe", () -> new SmithingItemObsidianHoe(Tiers.NETHERITE, -4, -2.8f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_shovel", () -> new SmithingItemObsidianShovel(Tiers.WOOD, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_shovel", () -> new SmithingItemObsidianShovel(Tiers.STONE, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_shovel", () -> new SmithingItemObsidianShovel(Tiers.GOLD, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_shovel", () -> new SmithingItemObsidianShovel(Tiers.IRON, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_shovel", () -> new SmithingItemObsidianShovel(Tiers.IRON, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_shovel", () -> new SmithingItemObsidianShovel(Tiers.DIAMOND, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_shovel", () -> new SmithingItemObsidianShovel(Tiers.NETHERITE, 1.5f, -3f));
	
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_WOOD = DeferredRegistration.ITEMS.register("quartz_sharpened_wooden_sword", () -> new SmithingItemQuartzifiedSword(Tiers.WOOD, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_STONE = DeferredRegistration.ITEMS.register("quartz_sharpened_stone_sword", () -> new SmithingItemQuartzifiedSword(Tiers.STONE, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_GOLD = DeferredRegistration.ITEMS.register("quartz_sharpened_golden_sword", () -> new SmithingItemQuartzifiedSword(Tiers.GOLD, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_COPPER = DeferredRegistration.ITEMS.register("quartz_sharpened_copper_sword", () -> new SmithingItemQuartzifiedSword(Tiers.IRON, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_IRON = DeferredRegistration.ITEMS.register("quartz_sharpened_iron_sword", () -> new SmithingItemQuartzifiedSword(Tiers.IRON, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_DIAMOND = DeferredRegistration.ITEMS.register("quartz_sharpened_diamond_sword", () -> new SmithingItemQuartzifiedSword(Tiers.DIAMOND, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_NETHERITE = DeferredRegistration.ITEMS.register("quartz_sharpened_netherite_sword", () -> new SmithingItemQuartzifiedSword(Tiers.NETHERITE, 3, -2.4f));
	
	public static final RegistryObject<Item> SMITHING_TEMPLATE = DeferredRegistration.ITEMS.register("smithing_template", () -> new SmithingTemplateUpgrades());
	
	
	public static void register() {}
}