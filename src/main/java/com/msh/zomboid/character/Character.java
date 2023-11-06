package com.msh.zomboid.character;

import com.msh.zomboid.character.value.item.DrinkableItem;
import com.msh.zomboid.character.value.stat.Drinkable;
import com.msh.zomboid.character.value.status.Status;
import com.msh.zomboid.character.value.status.StatusName;
import com.msh.zomboid.character.value.status.StatusValue;
import com.msh.zomboid.character.value.status.Statuses;

public class Character implements Drinkable {

	private final Statuses statuses = new Statuses(
			new Status(StatusName.THIRST, new StatusValue(50)),
			new Status(StatusName.HUNGER, new StatusValue(50)),
			new Status(StatusName.FATIGUE, new StatusValue(50))
	);

	@Override
	public void drink(DrinkableItem drinkableItem) {
		drinkableItem.createEffects()
				.forEach(statuses::affects);
	}

	public void printStatuses() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Character{" +
				"statuses=" + statuses +
				'}';
	}
}
