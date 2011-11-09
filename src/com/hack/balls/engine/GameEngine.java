package com.hack.balls.engine;

import javax.swing.JFrame;

import com.hack.balls.swing.MainFrame;

public class GameEngine {

	private static void runGame() {
		Runnable swingRun = new Runnable() {
			public void run() {
				MainFrame mainFrame = new MainFrame();
				mainFrame.setVisible(true);
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		};
		Thread swingThread = new Thread(swingRun);
		swingThread.start();
	}
	
	public static void main(String[] args) {
		
		GameEngine.runGame();
	}
}
