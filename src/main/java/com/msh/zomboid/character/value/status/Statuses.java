package com.msh.zomboid.character.value.status;

import com.msh.zomboid.character.value.effect.Effect;

import java.util.Arrays;
import java.util.List;

public class Statuses {

	private List<Status> statuses;

	public Statuses(Status ...statuses) {
		this.statuses = Arrays.stream(statuses)
				.toList();
	}

	public void affects(Effect effect) {
		this.statuses = this.statuses.stream()
				.map(effect::adjust)
				.toList();
	}

	@Override
	public String toString() {
		return "Statuses{" +
				"statuses=" + statuses +
				'}';
	}
}
