package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class SmithingItemHoe extends HoeItem
{
	public SmithingItemHoe(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, new Item.Properties().attributes(HoeItem.createAttributes(tier, attackDamageIn, attackSpeedIn)));
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