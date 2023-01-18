package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;

public class SmithingItemObsidianShovel extends SmithingItemShovel
{
	public SmithingItemObsidianShovel(Tier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public int getMaxDamage(ItemStack stack) 
	{
		if(stack.getItem() == AUSItems.OBSIDIANIZED_SHOVEL_NETHERITE.get()) 
		{
			return Items.NETHERITE_SHOVEL.getMaxDamage(new ItemStack(Items.NETHERITE_SHOVEL)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_SHOVEL_DIAMOND.get()) 
		{
			return Items.DIAMOND_SHOVEL.getMaxDamage(new ItemStack(Items.DIAMOND_SHOVEL)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_SHOVEL_GOLD.get()) 
		{
			return Items.GOLDEN_SHOVEL.getMaxDamage(new ItemStack(Items.GOLDEN_SHOVEL)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_SHOVEL_STONE.get()) 
		{
			return Items.STONE_SHOVEL.getMaxDamage(new ItemStack(Items.STONE_SHOVEL)) + 500;
		}
		
		else if(stack.getItem() == AUSItems.OBSIDIANIZED_SHOVEL_WOOD.get()) 
		{
			return Items.WOODEN_SHOVEL.getMaxDamage(new ItemStack(Items.WOODEN_SHOVEL)) + 500;
		}
		
		else 
		{
			return Items.IRON_SHOVEL.getMaxDamage(new ItemStack(Items.IRON_SHOVEL)) + 500;
		}
	}
}