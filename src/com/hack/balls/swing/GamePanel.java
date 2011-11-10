package com.hack.balls.swing;

import java.awt.Graphics;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hack.balls.engine.PhysicsEngine;
import com.hack.balls.model.Ball;

public class GamePanel extends JPanel {

	private JLabel scoreLabel;
	private PhysicsEngine physicsEngine;

	public GamePanel(MainFrame mainFrame) {

		scoreLabel = new JLabel("Score: 2");
		add(scoreLabel);
		physicsEngine = new PhysicsEngine(MainFrame.X_SIZE, MainFrame.Y_SIZE);

		Thread physicsThread = new Thread(physicsEngine);
		physicsThread.start();

		Runnable gameRun = new Runnable() {
			public void run() {
				while (true) {
					repaint();
				}
			}
		};
		Thread gameThread = new Thread(gameRun);
		gameThread.start();

	}

	public void paint(Graphics g) {
		List<Ball> balls = physicsEngine.getBalls();
		g.drawRect(0, 0, MainFrame.X_SIZE, MainFrame.Y_SIZE);
		for (int i = 0; i < balls.size(); i++) {
			Ball ball = balls.get(i);
			g.drawOval(ball.getX(), ball.getY(), ball.getRadius() * 2,
					ball.getRadius() * 2);
		}

	}

}
