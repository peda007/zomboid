package com.msh.zomboid;

import com.msh.zomboid.character.Character;
import com.msh.zomboid.character.value.item.EnergyDrink;
import com.msh.zomboid.character.value.item.Water;

public class ZomboidApplication {

	public static void main(String[] args) {
		Character player = new Character();
		player.drink(new Water());
		player.drink(new EnergyDrink());
		player.printStatuses();
	}
}
