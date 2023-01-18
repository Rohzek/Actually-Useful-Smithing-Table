package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class SmithingItemHoe extends HoeItem
{
	public SmithingItemHoe(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties());
	}
}