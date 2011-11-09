package com.hack.balls.model;

public class Ball implements Renderable {
	int x, y;
	int dx, dy;
	int radius;

	/**
	 * Default constructor for Ball. Initializes x,y,dx,dy with 0; radius
	 * initialized with 1
	 */
	public Ball() {
		this(0, 0);
	}

	/**
	 * Secondary constructor; velocity initialized with (0,0); radius = 1
	 * 
	 * @param x
	 *            x-coordinate of the ball
	 * @param y
	 *            y-coordinate of the ball
	 */
	public Ball(int x, int y) {
		this(x, y, 0, 0);
	}

	public Ball(int x, int y, int dx, int dy) {
		this(x, y, dx, dy, 1);
	}

	public Ball(int x, int y, int dx, int dy, int radius) {
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
		this.radius = radius;
	}

	@Override
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}
}