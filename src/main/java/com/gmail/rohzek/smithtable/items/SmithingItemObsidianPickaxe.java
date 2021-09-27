package com.gmail.rohzek.smithtable.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.ForgeRegistries;

public class SmithingItemObsidianPickaxe extends SmithingItemPickaxe
{
	public SmithingItemObsidianPickaxe(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public int getMaxDamage(ItemStack stack) 
	{
		if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_PICKAXE_NETHERITE.get()) 
		{
			Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "netherite_pickaxe"));
			return item.getMaxDamage(new ItemStack(item)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_PICKAXE_DIAMOND.get()) 
		{
			return Items.DIAMOND_PICKAXE.getMaxDamage(new ItemStack(Items.DIAMOND_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_PICKAXE_GOLD.get()) 
		{
			return Items.GOLDEN_PICKAXE.getMaxDamage(new ItemStack(Items.GOLDEN_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_PICKAXE_STONE.get()) 
		{
			return Items.STONE_PICKAXE.getMaxDamage(new ItemStack(Items.STONE_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_PICKAXE_WOOD.get()) 
		{
			return Items.WOODEN_PICKAXE.getMaxDamage(new ItemStack(Items.WOODEN_PICKAXE)) + 500;
		}
		
		else 
		{
			return Items.IRON_PICKAXE.getMaxDamage(new ItemStack(Items.IRON_PICKAXE)) + 500;
		}
	}
}
