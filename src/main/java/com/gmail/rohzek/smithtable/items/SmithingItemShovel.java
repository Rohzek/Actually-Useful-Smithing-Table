package com.gmail.rohzek.smithtable.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;

public class SmithingItemShovel extends ShovelItem
{
	public SmithingItemShovel(IItemTier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().tab(ItemGroup.TAB_TOOLS));
	}
}
