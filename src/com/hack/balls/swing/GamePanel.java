package com.hack.balls.swing;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.hack.balls.engine.PhysicsEngine;
import com.hack.balls.model.Ball;

public class GamePanel extends SimpleAnimation2 implements KeyListener {

	private JLabel scoreLabel;
	private JButton startButton;
	private PhysicsEngine physicsEngine;

	public GamePanel(MainFrame mainFrame) {

		setFocusable(true);
		addKeyListener(this);
		setMillisecondsPerFrame(20);


		startButton = new JButton("Begin!");
		startButton.addKeyListener(this);
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				startGame();
			}
		});
		scoreLabel = new JLabel();

		add(scoreLabel);
		add(startButton);

		start();
	}

	public void startGame() {

		System.out.println("Start gsdfame");
		physicsEngine = new PhysicsEngine(MainFrame.X_SIZE, MainFrame.Y_SIZE);
		Thread physicsThread = new Thread(physicsEngine);
		physicsThread.start();


		setFocusable(true);

	}

	public void drawFrame(Graphics g) {

		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(getForeground());

		if (physicsEngine != null) {
			List<Ball> balls = physicsEngine.getBalls();
			for (int i = 0; i < balls.size(); i++) {
				Ball ball = balls.get(i);
				g.fillOval(ball.getX() - ball.getRadius(),
						ball.getY() - ball.getRadius(), ball.getRadius() * 2,
						ball.getRadius() * 2);

			}
			scoreLabel.setText("Score: " + physicsEngine.getScore());

		}

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			physicsEngine.getPlayer().moveUp();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			physicsEngine.getPlayer().moveDown();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			physicsEngine.getPlayer().moveLeft();
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			physicsEngine.getPlayer().moveRight();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Boo");

	}

	@Override
	public void keyTyped(KeyEvent e) {
		e.getKeyCode();
	}

}
