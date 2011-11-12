package com.hack.balls.model;
/**
 * Encapsulation of a ball object; balls are meant to be displayed since they have x,y coordinates and a radius.
 * @author Sharad Vikram
 *
 */
public abstract class Ball {
	private int x, y;
	private int dx, dy;
	private int radius;

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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "{(" + getX() + "," + getY() + "), [" + getRadius() + "]}";
	}
}
