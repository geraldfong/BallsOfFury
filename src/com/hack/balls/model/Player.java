package com.hack.balls.model;

public class Player extends Ball {

	private int speed;
	
	public Player(int x, int y, int dx, int dy, int radius) {
		super(x, y, dx, dy, radius);
		speed = dx + dy;
	}
	
	public void moveLeft() {
		dx = -speed;
		dy = 0;
	}
	public void moveRight() {
		dx = speed;
		dy = 0;
	}
	
	public void moveUp() {
		dx = 0;
		dy = -speed;
	}
	
	public void moveDown() {
		dx = 0;
		dy = speed;
	}
	
	public void increaseSpeed() {
		speed++;
	}

}
