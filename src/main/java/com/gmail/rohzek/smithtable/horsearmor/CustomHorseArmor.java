package com.gmail.rohzek.smithtable.horsearmor;

import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;

public class CustomHorseArmor extends HorseArmorItem
{
	private String texture; 
	
	public CustomHorseArmor(int protection, String texture) 
	{
		super(protection, texture, new Item.Properties());
		this.texture = texture;
	}
	
	@Override
	public ResourceLocation getTexture() 
	{
	      return new ResourceLocation(Reference.MODID, "textures/entity/horse/armor/horse_armor_" + this.texture + ".png");
	}
}
