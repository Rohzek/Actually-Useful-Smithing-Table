package com.gmail.rohzek.smithtable.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class SmithingItemSword extends SwordItem
{

	public SmithingItemSword(IItemTier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().tab(ItemGroup.TAB_COMBAT));
	}

}
