package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;

public class SmithingItemObsidianHoe extends SmithingItemHoe
{
	public SmithingItemObsidianHoe(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public int getMaxDamage(ItemStack stack) 
	{
		if(stack.getItem() == AUSItems.OBSIDIANIZED_HOE_NETHERITE.get()) 
		{
			return Items.NETHERITE_HOE.getMaxDamage(new ItemStack(Items.NETHERITE_HOE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_HOE_DIAMOND.get()) 
		{
			return Items.DIAMOND_HOE.getMaxDamage(new ItemStack(Items.DIAMOND_HOE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_HOE_GOLD.get()) 
		{
			return Items.GOLDEN_HOE.getMaxDamage(new ItemStack(Items.GOLDEN_HOE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_HOE_STONE.get()) 
		{
			return Items.STONE_HOE.getMaxDamage(new ItemStack(Items.STONE_HOE)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_HOE_WOOD.get()) 
		{
			return Items.WOODEN_HOE.getMaxDamage(new ItemStack(Items.WOODEN_HOE)) + 500;
		}
		
		else 
		{
			return Items.IRON_HOE.getMaxDamage(new ItemStack(Items.IRON_HOE)) + 500;
		}
	}
}