package com.hack.balls.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel{
	
	JLabel titleLabel;
	JButton startButton;
   
	public StartPanel() {
		
		setLayout(new GridLayout(2, 1));
		addWidgets();
	}
	
	public void addWidgets() {
		titleLabel = new JLabel("Balls of Fury");
		startButton = new JButton("Start");
		
		add(titleLabel);
		add(startButton);
		
	}

}
