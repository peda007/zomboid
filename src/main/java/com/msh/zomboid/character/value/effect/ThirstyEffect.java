package com.msh.zomboid.character.value.effect;

import com.msh.zomboid.character.value.status.Status;
import com.msh.zomboid.character.value.status.StatusName;

public class ThirstyEffect implements Effect {

	public ThirstyEffect(int value) {
		this.value = value;
	}

	private final int value;

	@Override
	public Status adjust(Status status) {
		if (status.isNot(StatusName.THIRST)) {
			return status;
		}
		return status.adjust(value);
	}
}
