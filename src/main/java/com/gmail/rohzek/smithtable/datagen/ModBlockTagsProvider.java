package com.gmail.rohzek.smithtable.datagen;

import com.gmail.rohzek.smithtable.lib.Reference;

import net.minecraft.core.HolderLookup;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class ModBlockTagsProvider extends BlockTagsProvider 
{
	public ModBlockTagsProvider(GatherDataEvent event) 
	{
        super(event.getGenerator().getPackOutput(), event.getLookupProvider(), Reference.MODID, event.getExistingFileHelper());
    }
	
	@Override
    protected void addTags(HolderLookup.Provider provider) {}
}
