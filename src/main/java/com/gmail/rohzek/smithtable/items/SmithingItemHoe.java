package com.gmail.rohzek.smithtable.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SmithingItemHoe extends HoeItem
{
	public SmithingItemHoe(IItemTier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().tab(ItemGroup.TAB_TOOLS));
	}
}
