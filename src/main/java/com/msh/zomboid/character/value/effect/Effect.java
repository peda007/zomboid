package com.msh.zomboid.character.value.effect;

import com.msh.zomboid.character.value.status.Status;

public interface Effect {

	Status adjust(Status status);
}
