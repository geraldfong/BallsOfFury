package com.hack.balls.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{

	public static final String TITLE = "Balls of Fury";
	
	public static final String START_GAME = "START";
	
	private StartPanel startPanel;
	private GamePanel gamePanel;
	
	public MainFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(TITLE);
		setSize(400, 400);
		
		startPanel = new StartPanel(this);
		add(startPanel);
		validate();
		
		gamePanel = new GamePanel(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if ( START_GAME.equals(ae.getActionCommand())) {
			remove(startPanel);
			add(gamePanel);
			validate();
		}
	}
	
}
