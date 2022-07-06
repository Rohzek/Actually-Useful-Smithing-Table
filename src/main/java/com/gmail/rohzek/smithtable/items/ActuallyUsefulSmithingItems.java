package com.gmail.rohzek.smithtable.items;

import com.gmail.rohzek.smithtable.lib.DeferredRegistration;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;

public class ActuallyUsefulSmithingItems 
{
	//minecraft:obsidian
	//actuallyusefulsmithingtable
	public static final RegistryObject<Item> AXE_COPPER = DeferredRegistration.ITEMS.register("copper_axe", () -> new SmithingItemAxe(ItemTier.IRON, 1, -2.8f));
	public static final RegistryObject<Item> PICKAXE_COPPER = DeferredRegistration.ITEMS.register("copper_pickaxe", () -> new SmithingItemPickaxe(ItemTier.IRON, 1, -2.8f));
	public static final RegistryObject<Item> HOE_COPPER = DeferredRegistration.ITEMS.register("copper_hoe", () -> new SmithingItemHoe(ItemTier.IRON, 1, -2.8f));
	public static final RegistryObject<Item> SHOVEL_COPPER = DeferredRegistration.ITEMS.register("copper_shovel", () -> new SmithingItemShovel(ItemTier.IRON, 1, -2.8f));
	public static final RegistryObject<Item> SWORD_COPPER = DeferredRegistration.ITEMS.register("copper_sword", () -> new SmithingItemSword(ItemTier.IRON, 3, -2.4f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_axe", () -> new SmithingItemObsidianAxe(ItemTier.WOOD, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_axe", () -> new SmithingItemObsidianAxe(ItemTier.STONE, 7f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_axe", () -> new SmithingItemObsidianAxe(ItemTier.GOLD, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_axe", () -> new SmithingItemObsidianAxe(ItemTier.IRON, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_axe", () -> new SmithingItemObsidianAxe(ItemTier.IRON, 6f, -3.2f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_axe", () -> new SmithingItemObsidianAxe(ItemTier.DIAMOND, 5f, -3.0f));
	public static final RegistryObject<Item> OBSIDIANIZED_AXE_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_axe", () -> new SmithingItemObsidianAxe(ItemTier.NETHERITE, 5f, -3.0f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.WOOD, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.STONE, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.GOLD, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.IRON, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.IRON, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.DIAMOND, 1, -2.8f));
	public static final RegistryObject<Item> OBSIDIANIZED_PICKAXE_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_pickaxe", () -> new SmithingItemObsidianPickaxe(ItemTier.NETHERITE, 1, -2.8f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_hoe", () -> new SmithingItemObsidianHoe(ItemTier.WOOD, 0, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_hoe", () -> new SmithingItemObsidianHoe(ItemTier.STONE, -1, -2f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_hoe", () -> new SmithingItemObsidianHoe(ItemTier.GOLD, 0, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_hoe", () -> new SmithingItemObsidianHoe(ItemTier.IRON, -2, -1f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_hoe", () -> new SmithingItemObsidianHoe(ItemTier.IRON, -2, -1f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_hoe", () -> new SmithingItemObsidianHoe(ItemTier.DIAMOND, -3, 0f));
	public static final RegistryObject<Item> OBSIDIANIZED_HOE_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_hoe", () -> new SmithingItemObsidianHoe(ItemTier.NETHERITE, -4, -2.8f));
	
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_WOOD = DeferredRegistration.ITEMS.register("obsidian_plated_wooden_shovel", () -> new SmithingItemObsidianShovel(ItemTier.WOOD, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_STONE = DeferredRegistration.ITEMS.register("obsidian_plated_stone_shovel", () -> new SmithingItemObsidianShovel(ItemTier.STONE, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_GOLD = DeferredRegistration.ITEMS.register("obsidian_plated_golden_shovel", () -> new SmithingItemObsidianShovel(ItemTier.GOLD, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_COPPER = DeferredRegistration.ITEMS.register("obsidian_plated_copper_shovel", () -> new SmithingItemObsidianShovel(ItemTier.IRON, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_IRON = DeferredRegistration.ITEMS.register("obsidian_plated_iron_shovel", () -> new SmithingItemObsidianShovel(ItemTier.IRON, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_DIAMOND = DeferredRegistration.ITEMS.register("obsidian_plated_diamond_shovel", () -> new SmithingItemObsidianShovel(ItemTier.DIAMOND, 1.5f, -3f));
	public static final RegistryObject<Item> OBSIDIANIZED_SHOVEL_NETHERITE = DeferredRegistration.ITEMS.register("obsidian_plated_netherite_shovel", () -> new SmithingItemObsidianShovel(ItemTier.NETHERITE, 1.5f, -3f));
	
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_WOOD = DeferredRegistration.ITEMS.register("quartz_sharpened_wooden_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.WOOD, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_STONE = DeferredRegistration.ITEMS.register("quartz_sharpened_stone_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.STONE, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_GOLD = DeferredRegistration.ITEMS.register("quartz_sharpened_golden_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.GOLD, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_COPPER = DeferredRegistration.ITEMS.register("quartz_sharpened_copper_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.IRON, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_IRON = DeferredRegistration.ITEMS.register("quartz_sharpened_iron_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.IRON, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_DIAMOND = DeferredRegistration.ITEMS.register("quartz_sharpened_diamond_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.DIAMOND, 3, -2.4f));
	public static final RegistryObject<Item> QUARTZIFIED_SWORD_NETHERITE = DeferredRegistration.ITEMS.register("quartz_sharpened_netherite_sword", () -> new SmithingItemQuartzifiedSword(ItemTier.NETHERITE, 3, -2.4f));
	
	public static void register() {}
}
