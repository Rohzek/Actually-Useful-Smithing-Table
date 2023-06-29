package com.gmail.rohzek.smithtable.items;

import java.util.List;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

public class SmithingTemplateUpgrades extends SmithingTemplateItem
{
	private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
	private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;
	private static final Component UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.tool_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
	private static final Component UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.tool_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
	private static final Component UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.tool_upgrade.base_slot_description")));
	private static final Component UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", new ResourceLocation("smithing_template.tool_upgrade.additions_slot_description")));

	private static final Component UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", new ResourceLocation("tool_upgrade"))).withStyle(TITLE_FORMAT);
	
	private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
	private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
	private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
	private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
	private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
	private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
	private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
	private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
	private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");
	private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");
	   
	public SmithingTemplateUpgrades() 
	{
		super(UPGRADE_APPLIES_TO, UPGRADE_INGREDIENTS, UPGRADE, UPGRADE_BASE_SLOT_DESCRIPTION, 
			  UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createUpgradeIconList(), createUpgradeMaterialList());
	}
	
	public SmithingTemplateUpgrades(Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, 
			                        Component additionSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons) 
	{
		super(appliesTo, ingredients, upgradeDescription, baseSlotDescription, additionSlotDescription, baseSlotEmptyIcons, additionalSlotEmptyIcons);
	}
	
	private static List<ResourceLocation> createUpgradeIconList() 
	{
	      return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, 
	    		         EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
	}

	private static List<ResourceLocation> createUpgradeMaterialList() 
	{
		return List.of(EMPTY_SLOT_INGOT);
	}
}
