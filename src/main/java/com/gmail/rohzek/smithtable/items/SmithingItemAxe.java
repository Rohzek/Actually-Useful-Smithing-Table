package com.gmail.rohzek.smithtable.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SmithingItemAxe extends AxeItem
{

	public SmithingItemAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().tab(ItemGroup.TAB_TOOLS));
	}
	
	
}
