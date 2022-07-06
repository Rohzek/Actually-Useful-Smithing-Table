package com.gmail.rohzek.smithtable.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class SmithingItemObsidianAxe extends SmithingItemAxe
{
	public SmithingItemObsidianAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public int getMaxDamage(ItemStack stack) 
	{
		if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_NETHERITE.get()) 
		{
			return Items.NETHERITE_AXE.getMaxDamage(new ItemStack(Items.NETHERITE_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_DIAMOND.get()) 
		{
			return Items.DIAMOND_AXE.getMaxDamage(new ItemStack(Items.DIAMOND_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_GOLD.get()) 
		{
			return Items.GOLDEN_AXE.getMaxDamage(new ItemStack(Items.GOLDEN_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_STONE.get()) 
		{
			return Items.STONE_AXE.getMaxDamage(new ItemStack(Items.STONE_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_WOOD.get()) 
		{
			return Items.WOODEN_AXE.getMaxDamage(new ItemStack(Items.WOODEN_AXE)) + 500;
		}
		
		else 
		{
			return Items.IRON_AXE.getMaxDamage(new ItemStack(Items.IRON_AXE)) + 500;
		}
	}
}
