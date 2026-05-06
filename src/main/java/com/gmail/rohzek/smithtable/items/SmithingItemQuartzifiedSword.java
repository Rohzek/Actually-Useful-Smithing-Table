package com.gmail.rohzek.smithtable.items;

import com.gmail.rohzek.smithtable.lib.LogHelper;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;

public class SmithingItemQuartzifiedSword extends SmithingItemSword
{
	boolean check = false;
	
	public SmithingItemQuartzifiedSword(Tier tier, int attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public void onCraftedBy(ItemStack item, Level world, Player player) 
	{
		super.onCraftedBy(item, world, player);
		
		if(!world.isClientSide) 
		{
			HolderLookup<Enchantment> enchantmentHolderLookup = world.holderLookup(Registries.ENCHANTMENT);
			ItemEnchantments enchants = item.get(DataComponents.ENCHANTMENTS);
			
			if (enchants != null) 
			{
				enchants.entrySet().forEach(enchant -> 
				{
					Holder<Enchantment> enchantment = enchant.getKey();
					int level = enchant.getIntValue(), upgrade = 0;
					LogHelper.Debug("Found enchantment " + enchantment.getRegisteredName() + " with level of " + level);
					
					if(enchantment.is(Enchantments.SHARPNESS)) 
					{
						LogHelper.Debug("Found sharpness enchantment! Do logic");
						check = true;
						upgrade = level + 1;
						if(upgrade >= 6) 
						{
							upgrade = 5;
						}
						enchant.setValue(upgrade);
					}
				});
				
				if(!check) 
				{
					LogHelper.Debug("Sharpness not found, add it");
					item.enchant(enchantmentHolderLookup.get(Enchantments.SHARPNESS).get(), 1);
				}
			}
			else 
			{
				LogHelper.Debug("No enchantments found, we need to add sharpness");
				item.enchant(enchantmentHolderLookup.get(Enchantments.SHARPNESS).get(), 1);
			}
		}
	}
}