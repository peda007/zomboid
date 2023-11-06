package com.msh.zomboid.character.value.effect;

import com.msh.zomboid.character.value.status.Status;
import com.msh.zomboid.character.value.status.StatusName;

public class FatigueEffect implements Effect {

	private final int value;

	public FatigueEffect(int value) {
		this.value = value;
	}

	@Override
	public Status adjust(Status status) {
		if (status.isNot(StatusName.FATIGUE)) {
			return status;
		}
		return status.adjust(value);
	}
}
