package com.gmail.rohzek.smithtable.items;

import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;

public class SmithingHorseArmor extends HorseArmorItem
{
	private String tier;
	
	public SmithingHorseArmor(int protection, String tier) 
	{
		super(protection, tier, (new Item.Properties()).stacksTo(1).tab(CreativeModeTab.TAB_MISC));
		
		this.tier = tier;
	}
	
	@Override
	public ResourceLocation getTexture() 
	{
		return new ResourceLocation(Reference.RESOURCEID + "textures/entity/horse/armor/horse_armor_" + this.tier + ".png");
	}
}
