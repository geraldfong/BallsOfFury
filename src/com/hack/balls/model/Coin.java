package com.hack.balls.model;

public class Coin extends Ball {
	private int value;

	public Coin() {
		this(0, 0, 0);
	}

	public Coin(int x, int y, int value) {
		this(x, y, 0, 1);
	}

	public Coin(int x, int y, int value, int radius) {
		super(x, y, 0, 0, radius);
		this.setValue(value);
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

}
