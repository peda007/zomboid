package com.msh.zomboid.character.value.status;

public class StatusValue {

	private final int value;

	public StatusValue(int value) {
		if (value < 0 || value > 100) {
			throw new RuntimeException("올바르지 않은 상태값입니다.");
		}
		this.value = value;
	}

	public StatusValue add(int value) {
		return new StatusValue(this.value + value);
	}

	public StatusValue subtract(int value) {
		return new StatusValue(this.value - value);
	}

	@Override
	public String toString() {
		return "StatusValue{" +
				"value=" + value +
				'}';
	}
}
