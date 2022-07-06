package com.gmail.rohzek.smithtable.items;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SmithingItemQuartzifiedSword extends SmithingItemSword
{
	public SmithingItemQuartzifiedSword(IItemTier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public void onCraftedBy(ItemStack itemstack, World world, PlayerEntity player) 
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
