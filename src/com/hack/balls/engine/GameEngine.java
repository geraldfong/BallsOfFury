package com.hack.balls.engine;

public class GameEngine {

	private static void runGame() {
		Runnable gameRun = new Runnable() {
			public void run() {
				
			}
		};
		Thread gameThread = new Thread(gameRun);
		gameThread.start();
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World  is Balls of Fury");
		System.out.println("blah blah");
		
		GameEngine.runGame();
	}
}
