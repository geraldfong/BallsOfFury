package com.hack.balls.swing;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	public static final String TITLE = "Balls of Fury";
	
	public static final int X_SIZE = 500;
	public static final int Y_SIZE = 500;
	private GamePanel gamePanel;
	
	public MainFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(TITLE);
		setSize(X_SIZE, Y_SIZE);
		
		gamePanel = new GamePanel(this);
		add(gamePanel);
		
	}
	
}
