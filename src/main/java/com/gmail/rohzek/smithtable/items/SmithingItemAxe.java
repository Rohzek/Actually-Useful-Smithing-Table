package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

public class SmithingItemAxe extends AxeItem
{

	public SmithingItemAxe(Tier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, new Item.Properties().attributes(AxeItem.createAttributes(tier, attackDamageIn, attackSpeedIn)));
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