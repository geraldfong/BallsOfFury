package com.hack.balls.engine;

import com.hack.balls.swing.GameGUI;

public class GameEngine {

	private static void runGame() {
		Runnable swingRun = new Runnable() {
			public void run() {
				GameGUI gameGUI = new GameGUI();
				gameGUI.init();
			}
		};
		Thread swingThread = new Thread(swingRun);
		swingThread.start();
	}
	
	public static void main(String[] args) {
		
		GameEngine.runGame();
	}
}
