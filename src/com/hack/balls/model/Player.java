package com.hack.balls.model;

/**
 * The
 * 
 * @author Sharad Vikram, Gerald Fong
 * 
 */
public class Player extends Ball {

	private int speed;

	public Player(int x, int y, int dx, int dy, int radius) {
		super(x, y, dx, dy, radius);
		speed = dx + dy;
	}

	public void moveLeft() {
		setDx(-speed);
		setDy(0);
	}

	public void moveRight() {
		setDx(speed);
		setDy(0);
	}

	public void moveUp() {
		setDx(0);
		setDy(-speed);
	}

	public void moveDown() {
		setDx(0);
		setDy(speed);
	}

	public void increaseSpeed() {
		speed++;
	}

}
