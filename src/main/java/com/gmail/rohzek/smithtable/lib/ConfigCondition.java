package com.gmail.rohzek.smithtable.lib;

import com.mojang.serialization.MapCodec;
import net.neoforged.neoforge.common.conditions.ICondition;

public class ConfigCondition implements ICondition {
	public static final ConfigCondition INSTANCE = new ConfigCondition();
	public static final MapCodec<ConfigCondition> CODEC = MapCodec.unit(INSTANCE).stable();

	public ConfigCondition() {}

	@Override
	public boolean test(IContext context) {
		return ConfigurationManager.GENERAL.difficulty.get().equals("hard");
	}

	@Override
	public MapCodec<? extends ICondition> codec() {
		return CODEC;
	}
}
