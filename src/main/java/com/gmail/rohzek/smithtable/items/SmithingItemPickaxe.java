package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class SmithingItemPickaxe extends PickaxeItem
{
	public SmithingItemPickaxe(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn, new Item.Properties());
	}
}