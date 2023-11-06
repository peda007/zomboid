package com.msh.zomboid.character.value.status;

public enum StatusName {

	THIRST("갈증"),
	FATIGUE("피곤"),
	HUNGER("배고픔"),

	;

	StatusName(String description) {
		this.description = description;
	}

	private final String description;
}
