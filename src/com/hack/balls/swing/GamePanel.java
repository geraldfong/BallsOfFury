package com.hack.balls.swing;

import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hack.balls.engine.PhysicsEngine;

public class GamePanel extends JPanel{

	private JLabel scoreLabel;
	private PhysicsEngine physicsEngine;
	
	public GamePanel(MainFrame mainFrame) {
		
		scoreLabel = new JLabel("Score: 2");
		add(scoreLabel);
		
		physicsEngine = new PhysicsEngine(MainFrame.X_SIZE, MainFrame.Y_SIZE);
		
		Thread gameThread = new Thread(physicsEngine);
		gameThread.start();
		
	}
	
	public void paint(Graphics g) {
		
	}
	
	
	
	
}
