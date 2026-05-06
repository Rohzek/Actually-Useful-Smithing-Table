package com.gmail.rohzek.smithtable.datagen;

import java.util.List;

import com.gmail.rohzek.smithtable.items.AUSItems;
import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class ModItemTagsProvider extends ItemTagsProvider
{
	List<TagKey<Item>> TOOL_LIST = List.of(ItemTags.DURABILITY_ENCHANTABLE, ItemTags.VANISHING_ENCHANTABLE, ItemTags.MINING_LOOT_ENCHANTABLE, ItemTags.MINING_ENCHANTABLE);
	List<TagKey<Item>> SWORD_LIST = List.of(ItemTags.DURABILITY_ENCHANTABLE, ItemTags.VANISHING_ENCHANTABLE, ItemTags.SWORDS, ItemTags.SWORD_ENCHANTABLE, ItemTags.FIRE_ASPECT_ENCHANTABLE, ItemTags.SHARP_WEAPON_ENCHANTABLE, ItemTags.WEAPON_ENCHANTABLE);
	List<TagKey<Item>> ARMOR_LIST = List.of(ItemTags.DURABILITY_ENCHANTABLE, ItemTags.VANISHING_ENCHANTABLE, ItemTags.EQUIPPABLE_ENCHANTABLE, ItemTags.TRIMMABLE_ARMOR, ItemTags.ARMOR_ENCHANTABLE);
	List<TagKey<Item>> HELMET_LIST = List.of(ItemTags.HEAD_ARMOR, ItemTags.HEAD_ARMOR_ENCHANTABLE);
	List<TagKey<Item>> CHESTPLATE_LIST = List.of(ItemTags.CHEST_ARMOR, ItemTags.CHEST_ARMOR_ENCHANTABLE);
	List<TagKey<Item>> LEGGINGS_LIST = List.of(ItemTags.LEG_ARMOR, ItemTags.LEG_ARMOR_ENCHANTABLE);
	List<TagKey<Item>> BOOT_LIST = List.of(ItemTags.FOOT_ARMOR, ItemTags.FOOT_ARMOR_ENCHANTABLE);
	
	public ModItemTagsProvider(GatherDataEvent event, ModBlockTagsProvider blocks) 
	{
		super(event.getGenerator().getPackOutput(), event.getLookupProvider(), blocks.contentsGetter(), Reference.MODID, event.getExistingFileHelper());
    }
	
	@Override
    protected void addTags(HolderLookup.Provider provider) 
	{	
		// Base Copper Items
		add(AUSItems.AXE_COPPER.get(), ItemTags.AXES);
		add(AUSItems.AXE_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.PICKAXE_COPPER.get(), ItemTags.PICKAXES);
		add(AUSItems.PICKAXE_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.HOE_COPPER.get(), ItemTags.HOES);
		add(AUSItems.HOE_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.SHOVEL_COPPER.get(), ItemTags.SHOVELS);
		add(AUSItems.SHOVEL_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.SWORD_COPPER.get(), SWORD_LIST);
		
		// Upgraded Wood
		add(AUSItems.OBSIDIANIZED_AXE_WOOD.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_WOOD.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_HOE_WOOD.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_WOOD.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_SHOVEL_WOOD.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_WOOD.get(), TOOL_LIST);
		
		add(AUSItems.QUARTZIFIED_SWORD_WOOD.get(), SWORD_LIST);
		
		// Upgraded Stone
		add(AUSItems.OBSIDIANIZED_AXE_STONE.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_STONE.get(), TOOL_LIST);
				
		add(AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_STONE.get(), TOOL_LIST);
				
		add(AUSItems.OBSIDIANIZED_HOE_STONE.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_STONE.get(), TOOL_LIST);
				
		add(AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_STONE.get(), TOOL_LIST);
				
		add(AUSItems.QUARTZIFIED_SWORD_STONE.get(), SWORD_LIST);
		
		// Upgraded Copper
		add(AUSItems.OBSIDIANIZED_AXE_COPPER.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_HOE_COPPER.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_COPPER.get(), TOOL_LIST);
		
		add(AUSItems.QUARTZIFIED_SWORD_COPPER.get(), SWORD_LIST);
		
		// Upgraded Iron
		add(AUSItems.OBSIDIANIZED_AXE_IRON.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_IRON.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_IRON.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_HOE_IRON.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_IRON.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_IRON.get(), TOOL_LIST);
		
		add(AUSItems.QUARTZIFIED_SWORD_IRON.get(), SWORD_LIST);
		
		// Upgraded Gold
		add(AUSItems.OBSIDIANIZED_AXE_GOLD.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_GOLD.get(), ItemTags.PIGLIN_LOVED);
		add(AUSItems.OBSIDIANIZED_AXE_GOLD.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), ItemTags.PIGLIN_LOVED);
		add(AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_HOE_GOLD.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_GOLD.get(), ItemTags.PIGLIN_LOVED);
		add(AUSItems.OBSIDIANIZED_HOE_GOLD.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), ItemTags.PIGLIN_LOVED);
		add(AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get(), TOOL_LIST);
		
		add(AUSItems.QUARTZIFIED_SWORD_GOLD.get(), ItemTags.PIGLIN_LOVED);
		add(AUSItems.QUARTZIFIED_SWORD_GOLD.get(), SWORD_LIST);
		
		// Upgraded Diamond
		add(AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_DIAMOND.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_DIAMOND.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get(), TOOL_LIST);
		
		add(AUSItems.QUARTZIFIED_SWORD_DIAMOND.get(), SWORD_LIST);
		
		// Upgraded Netherite
		add(AUSItems.OBSIDIANIZED_AXE_NETHERITE.get(), ItemTags.AXES);
		add(AUSItems.OBSIDIANIZED_AXE_NETHERITE.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_PICKAXE_NETHERITE.get(), ItemTags.PICKAXES);
		add(AUSItems.OBSIDIANIZED_PICKAXE_NETHERITE.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_HOE_NETHERITE.get(), ItemTags.HOES);
		add(AUSItems.OBSIDIANIZED_HOE_NETHERITE.get(), TOOL_LIST);
		
		add(AUSItems.OBSIDIANIZED_SHOVEL_NETHERITE.get(), ItemTags.SHOVELS);
		add(AUSItems.OBSIDIANIZED_SHOVEL_NETHERITE.get(), TOOL_LIST);
		
		add(AUSItems.QUARTZIFIED_SWORD_NETHERITE.get(), SWORD_LIST);
	}
	
	private void add(Item item, TagKey<Item> tagkey) 
	{
		tag(tagkey).add(item);
	}
	
	private void add (Item item, List<TagKey<Item>> list)
	{
		list.forEach(tag -> add(item, tag));
	}
}
