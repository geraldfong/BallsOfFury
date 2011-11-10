package com.hack.balls.swing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel{
	
	
	JLabel titleLabel;
	JButton startButton;
   
	public StartPanel(MainFrame mainFrame) {
		
		
		titleLabel = new JLabel("Welcome to Balls of Fury");
		startButton = new JButton("Begin!");
		add(titleLabel);
		add(startButton);
		
		startButton.addActionListener(mainFrame);
		startButton.setActionCommand(MainFrame.START_GAME);
		
		
		
	}
	

}
