package com.gmail.rohzek.smithtable.recipe;

import org.jetbrains.annotations.Nullable;

import com.gmail.rohzek.smithtable.lib.ConfigurationManager;
import com.gmail.rohzek.smithtable.lib.Reference;
import com.google.gson.JsonObject;

import net.minecraft.core.RegistryAccess;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.SmithingTrimRecipe;
import net.minecraft.world.level.Level;

public class SmithingTableRecipe extends SmithingTrimRecipe
{
	final Ingredient template;
	final Ingredient input;
	final Ingredient upgrader;
	final ItemStack output;
	final String difficulty;
	
	public SmithingTableRecipe(ResourceLocation location, Ingredient template, Ingredient input, Ingredient upgrader, ItemStack output, String difficulty) 
	{
		super(location, template, input, upgrader);
		
		this.template = template;
		this.input = input;
		this.upgrader = upgrader;
		this.output = output;
		this.difficulty = difficulty;
	}
	
	@Override
	public boolean matches(Container container, Level world) 
	{
		String gameDiff = ConfigurationManager.GENERAL.difficulty.get().toLowerCase(), 
			   itemDiff = difficulty.toLowerCase();
			
			// Block recipes if they aren't for the selected difficulty, 'upgrade' type recipes are always allowed
			if(gameDiff.equals("hard") && itemDiff.equals("easy")) 
			{
				return false;
			}
			
			if(gameDiff.equals("easy") && itemDiff.equals("hard")) 
			{
				return false;
			}
			
			if(gameDiff.equals("normal") && !ConfigurationManager.GENERAL.repairOnNormal.get() && itemDiff.equals("hard")) 
			{
				return false;
			}
			
			return super.matches(container, world);
	}
	
	@Override
	public ItemStack assemble(Container container, RegistryAccess regAccess) 
	{
		ItemStack itemstack = this.output;
		//ItemStack template = container.getItem(0);
		ItemStack input = container.getItem(1);
		CompoundTag compoundtag = input.getTag();
		
	      if (compoundtag != null) 
	      {
	         itemstack.setTag(compoundtag.copy());
	      }
	      
	      // If on easy mode, or normal with 'repairing blocks' enabled and a block is provided, we should fully repair tools
	      if(!ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("hard"))
	      {
	    	  if(ConfigurationManager.GENERAL.difficulty.get().toLowerCase().contains("easy")) 
	    	  {
	    		  itemstack.setDamageValue(0);
	    	  }
	    	  
	    	  else if(ConfigurationManager.GENERAL.repairOnNormal.get() && upgrader.getItems()[0].getDisplayName().toString().toLowerCase().contains("block"))
	    	  {
	    		  itemstack.setDamageValue(0);
	    	  }
	    	  
	    	  else 
		      {  
		    	  itemstack.setDamageValue(getNewHealth(itemstack.getMaxDamage(), getPercentage(input.getDamageValue(), input.getMaxDamage())));
		      }
	      }
	      
	      // Otherwise, we should set a repair value on the new one equal to the amount of damage on the old. E.G. 50% of damage on old = 50% damage on new
	      // This will fix Issue #6 while also balancing out the mod a little bit
	      else 
	      {
	    	  if(ConfigurationManager.GENERAL.repairOnHard.get()) 
	    	  {
	    		  itemstack.setDamageValue(0);
	    	  }
	    	  else 
	    	  {
	    		  itemstack.setDamageValue(getNewHealth(itemstack.getMaxDamage(), getPercentage(input.getDamageValue(), input.getMaxDamage())));
	    	  }
	      }

	      return itemstack;
	}
	
	@Override
	public ItemStack getResultItem(RegistryAccess access) 
	{
		return this.output;
	}
	
	/**
	 * @param x: The current amount of damage on current tool
	 * @param y: The current max damage of the current tool
	 * @return Percentage left of current tools HP
	 * 
	 * Example: x = 249, y = 250 (Iron Sword)
	 * This means there's 249 hit points left of 250
	 * x / y = (249 / 250) which is 0.996
	 * (0.996 * 100) = 99.6% HP left
	 */
	float getPercentage(int x, int y)
	{
		return (((float) x / (float) y) * (float) 100);
	}
	
	/**
	 * 
	 * @param x Total of new tools HP
	 * @param z The percentage of HP the old tool had left
	 * @return The total amount of damage the new tool should be set to, shortened to an int because setDamageValue accepts an int
	 * 
	 * Example: x = 32 (Gold Sword) y = 45.2 (percentage of HP left on Iron Sword)
	 * 32 * (45.2 / 100) = 14.464 so 14.5 is roughly about 45.2% of 32
	 * 32 - 14.646 = 17.354 or just 17, so we should apply 17 points of damage to have 14 (45%) HP points left
	 */
	int getNewHealth(int x, float z) 
	{
		return (int) (x * (z / 100));
	}
	
	@Override
	public RecipeType<?> getType() 
	{
		return Type.SMITHING;
	}
	
	public static class Type implements RecipeType<SmithingTableRecipe>
	{
		private Type() {}
		public static final Type INSTANCE = new Type();
		public static final String ID = "smithing_table";
	}
	
	public static class Serializer implements RecipeSerializer<SmithingTableRecipe>
	{
		public static final Serializer INSTANCE = new Serializer();
		public static final ResourceLocation ID = new ResourceLocation(Reference.MODID, "smithing_table");
		
		@Override
		public SmithingTableRecipe fromJson(ResourceLocation location, JsonObject json) 
		{
			Ingredient template = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "template"));
			Ingredient ingredient = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "base"));
	        Ingredient ingredient1 = Ingredient.fromJson(GsonHelper.getAsJsonObject(json, "addition"));
	        ItemStack itemstack = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "result"));
	        String difficulty = GsonHelper.getAsString(json, "difficulty");
	        
	        return new SmithingTableRecipe(location, template, ingredient, ingredient1, itemstack, difficulty);
		}

		@Override
		public @Nullable SmithingTableRecipe fromNetwork(ResourceLocation location, FriendlyByteBuf bytebuf) 
		{
			Ingredient template = Ingredient.fromNetwork(bytebuf);
			Ingredient ingredient = Ingredient.fromNetwork(bytebuf);
	        Ingredient ingredient1 = Ingredient.fromNetwork(bytebuf);
	        ItemStack itemstack = bytebuf.readItem();
	        String difficulty = bytebuf.readUtf();
	        
	        return new SmithingTableRecipe(location, template, ingredient, ingredient1, itemstack, difficulty);
		}

		@Override
		public void toNetwork(FriendlyByteBuf bytebuf, SmithingTableRecipe recipe) 
		{
			recipe.template.toNetwork(bytebuf);
			recipe.input.toNetwork(bytebuf);
			recipe.upgrader.toNetwork(bytebuf);
			bytebuf.writeItem(recipe.output);
	        bytebuf.writeUtf(recipe.difficulty);
		}
		
	}
}