package com.hack.balls.swing;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JLabel;

import com.hack.balls.engine.PhysicsEngine;
import com.hack.balls.model.Ball;

public class GamePanel extends SimpleAnimation2 implements KeyListener{

	private JLabel scoreLabel;
	private PhysicsEngine physicsEngine;

	public GamePanel(MainFrame mainFrame) {

		
		scoreLabel = new JLabel("Score: 2");
		add(scoreLabel);
		physicsEngine = new PhysicsEngine(MainFrame.X_SIZE, MainFrame.Y_SIZE);

		
		addKeyListener(this);
		
		
	}
	
	public void startGame() {

		Thread physicsThread = new Thread(physicsEngine);
		physicsThread.start();
		start();
		
	}
	
	public void drawFrame( Graphics g) {
		//System.out.println("In paint");
        g.setColor( getBackground() );
        g.fillRect( 0, 0, getWidth(), getHeight() );

        g.setColor( getForeground() );

        /*
		List<Ball> balls = physicsEngine.getBalls();
		System.out.println(balls);
		for (int i = 0; i < balls.size(); i++) {
			Ball ball = balls.get(i);
//			System.out.println(ball.getRadius());
//			System.out.println(ball.getX());
			g.drawOval(ball.getX(), ball.getY(), ball.getRadius() * 2,
					ball.getRadius() * 2);
		}*/
		
		/*
        g.setColor( getBackground() );
        g.fillRect( 0, 0, getWidth(), getHeight() );
        g.setColor( getForeground() );
        g.drawString( "Frame Number " + getFrameNumber(), 10, 15 );
        g.drawString( "Elapsed Time " + getElapsedTime() / 1000 + " seconds",
            10,
            30 );*/

	}

	public void keyPressed(KeyEvent event) {
		System.out.println(event.getID());
		
	}

	public void keyReleased(KeyEvent arg0) {
		System.out.println("Action");
		
	}

	public void keyTyped(KeyEvent arg0) {
		System.out.println("keyTyped");
		
	}
	

}
