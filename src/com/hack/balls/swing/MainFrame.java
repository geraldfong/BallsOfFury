package com.hack.balls.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private String TITLE = "Balls of Fury";
	private JPanel startPanel;
	private JPanel gamePanel;
	
	public MainFrame() {
		
		setTitle(TITLE);
		setSize(500, 500);
		
		
		startPanel = new StartPanel();
		gamePanel = new GamePanel();
		
		add(startPanel);
		validate();
	}
	
	
	
	
	
	
	
	
	

}
