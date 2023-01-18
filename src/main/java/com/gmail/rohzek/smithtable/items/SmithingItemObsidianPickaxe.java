package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;

public class SmithingItemObsidianPickaxe extends SmithingItemPickaxe
{
	public SmithingItemObsidianPickaxe(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public int getMaxDamage(ItemStack stack) 
	{
		if(stack.getItem() == AUSItems.OBSIDIANIZED_PICKAXE_NETHERITE.get()) 
		{
			return Items.NETHERITE_PICKAXE.getMaxDamage(new ItemStack(Items.NETHERITE_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_PICKAXE_DIAMOND.get()) 
		{
			return Items.DIAMOND_PICKAXE.getMaxDamage(new ItemStack(Items.DIAMOND_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_PICKAXE_GOLD.get()) 
		{
			return Items.GOLDEN_PICKAXE.getMaxDamage(new ItemStack(Items.GOLDEN_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_PICKAXE_STONE.get()) 
		{
			return Items.STONE_PICKAXE.getMaxDamage(new ItemStack(Items.STONE_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get()) 
		{
			return Items.WOODEN_PICKAXE.getMaxDamage(new ItemStack(Items.WOODEN_PICKAXE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_PICKAXE_WOOD.get()) 
		{
			return Items.IRON_PICKAXE.getMaxDamage(new ItemStack(Items.IRON_PICKAXE)) + 500;
		}
		
		else 
		{
			return Items.IRON_PICKAXE.getMaxDamage(new ItemStack(Items.IRON_PICKAXE)) + 500;
		}
	}
}