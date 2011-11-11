package com.hack.balls.swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartPanel extends JPanel implements KeyListener{
	
	
	JLabel titleLabel;
	JButton startButton;
   
	public StartPanel(MainFrame mainFrame) {
		
		//this.setFocusable(true);
		//this.addKeyListener(this);
		titleLabel = new JLabel("Welcome to Balls of Fury");
		startButton = new JButton("Begin!");
		add(titleLabel);
		add(startButton);
		startButton.setActionCommand(MainFrame.START_GAME);
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Boo");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Boo");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Boo");
		
	}
	
	
	

}
