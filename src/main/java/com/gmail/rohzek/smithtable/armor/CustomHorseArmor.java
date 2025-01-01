package com.gmail.rohzek.smithtable.armor;

import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.AnimalArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class CustomHorseArmor extends AnimalArmorItem
{
	private String texture; 
	
	public CustomHorseArmor(Holder<ArmorMaterial> material, String texture)
	{
		super(material, BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1));
		this.texture = texture;
	}
	
	@Override
	public ResourceLocation getTexture() 
	{
	      return ResourceLocation.fromNamespaceAndPath(Reference.MODID, "textures/entity/horse/armor/horse_armor_" + this.texture + ".png");
	}
}
