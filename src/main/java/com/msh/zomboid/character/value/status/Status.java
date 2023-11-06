package com.msh.zomboid.character.value.status;

public class Status {

	private final StatusName name;

	private final StatusValue value;

	public Status(StatusName name, StatusValue value) {
		this.name = name;
		this.value = value;
	}

	public Status adjust(int value) {
		return new Status(name, this.value.add(value));
	}

	public boolean is(StatusName statusName) {
		return this.name == statusName;
	}

	public boolean isNot(StatusName statusName) {
		return !is(statusName);
	}

	@Override
	public String toString() {
		return "Status{" +
				"name=" + name +
				", value=" + value +
				'}';
	}
}
