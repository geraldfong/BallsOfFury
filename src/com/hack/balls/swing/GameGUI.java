package com.hack.balls.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameGUI {

	private static final String TITLE = "Balls of Fury";
	private JFrame gameFrame;
	private JPanel startPanel;
	private JPanel playPanel;
	
	public void init() {
		gameFrame = new JFrame();
		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gameFrame.setTitle(TITLE);
		gameFrame.setSize(400, 400);
		
		startPanel = new JPanel();
		JLabel startLabel = new JLabel("Welcome to Balls of Fury");
		JButton startButton = new JButton("Begin!");
		startPanel.add(startLabel);
		startPanel.add(startButton);
		gameFrame.add(startPanel);
		
		playPanel = new JPanel();
	}
	
}
