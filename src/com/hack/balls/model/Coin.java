package com.hack.balls.model;

/**
 * A subclass of Ball. Coins have value
 * 
 * @author Sharad Vikram
 * 
 */
public class Coin extends Ball {
	private int value;

	public Coin() {
		this(0, 0, 0);
	}

	public Coin(int x, int y, int value) {
		this(x, y, 0, 1);
	}

	/**
	 * Instantiates a Coin with a given position, value, and radius
	 * 
	 * @param x
	 * @param y
	 * @param value
	 * @param radius
	 */
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

	public String toString() {
		return "{" + super.toString() + ", {" + value + "}}";
	}
}
