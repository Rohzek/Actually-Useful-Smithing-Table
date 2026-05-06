package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SmithingItemSword extends SwordItem
{

	public SmithingItemSword(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, attackDamageIn, attackSpeedIn)));
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book) 
	{
		return true;
	}
	
	@Override
	public boolean isEnchantable(ItemStack stack) 
	{
		return true;
	}
}