package com.msh.zomboid.character.value.item;

import com.msh.zomboid.character.value.effect.Effect;
import com.msh.zomboid.character.value.effect.FatigueEffect;
import com.msh.zomboid.character.value.effect.ThirstyEffect;

import java.util.List;

public class EnergyDrink extends DrinkableItem {

	@Override
	public List<Effect> createEffects() {
		return List.of(
				new ThirstyEffect(-10),
				new FatigueEffect(-30)
		);
	}
}
