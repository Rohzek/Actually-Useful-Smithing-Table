package com.gmail.rohzek.smithtable.items;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;

public class SmithingItemQuartzifiedSword extends SmithingItemSword
{
	public SmithingItemQuartzifiedSword(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player player) 
	{
		super.onCraftedBy(itemstack, world, player);
		
		//int sharpnessLevel = itemstack.getEnchantmentLevel(Enchantments.SHARPNESS) + 1;
		
		// Should remove current sharpness level if it exists, and replace it with the stronger one.
		if(!itemstack.isEnchanted()) 
		{
			itemstack.enchant(Enchantments.SHARPNESS, 3);
		}
	}
}