package com.gmail.rohzek.smithtable.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.ForgeRegistries;

public class SmithingItemObsidianAxe extends SmithingItemAxe
{
	public SmithingItemObsidianAxe(Tier tier, float attackDamageIn, float attackSpeedIn) 
	{
		super(tier, attackDamageIn, attackSpeedIn);
	}
	
	@Override
	public int getMaxDamage(ItemStack stack) 
	{
		if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_NETHERITE.get()) 
		{
			Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", "netherite_axe"));
			return item.getMaxDamage(new ItemStack(item)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_DIAMOND.get()) 
		{
			return Items.DIAMOND_AXE.getMaxDamage(new ItemStack(Items.DIAMOND_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_GOLD.get()) 
		{
			return Items.GOLDEN_AXE.getMaxDamage(new ItemStack(Items.GOLDEN_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_STONE.get()) 
		{
			return Items.STONE_AXE.getMaxDamage(new ItemStack(Items.STONE_AXE)) + 500;
		}
		
		else if(stack.getItem() == ActuallyUsefulSmithingItems.OBSIDIANIZED_AXE_WOOD.get()) 
		{
			return Items.WOODEN_AXE.getMaxDamage(new ItemStack(Items.WOODEN_AXE)) + 500;
		}
		
		else 
		{
			return Items.IRON_AXE.getMaxDamage(new ItemStack(Items.IRON_AXE)) + 500;
		}
	}
}
