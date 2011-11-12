package com.hack.balls.swing;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.hack.balls.engine.PhysicsEngine;
import com.hack.balls.model.Ball;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

	public static final String REPAINT_COMMAND = "REPAINT";
	public static final String START_COMMAND = "START";
	public static final int MILLIS_PER_FRAME = 10;
	public static final String IMAGE_NAME = "media/nyan.jpg";
	public static final String AUDIO_NAME = "media/nyan.wav";

	private JLabel scoreLabel;
	private JButton startButton;
	private PhysicsEngine physicsEngine;
	private Timer timer;
	private BufferedImage bgImage;

	public synchronized void playSound(final String url) {
		try {
			// Open an audio input stream.
			File file = new File(url);
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(file);
			// Get a sound clip resource.
			Clip clip = AudioSystem.getClip();
			// Open audio clip and load samples from the audio input stream.
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}

	public GamePanel(MainFrame mainFrame) {

		try {
			bgImage = ImageIO.read(new File(IMAGE_NAME));
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Failed to read " + IMAGE_NAME);
		}

		setFocusable(true);
		addKeyListener(this);

		timer = new Timer(MILLIS_PER_FRAME, this);
		timer.setActionCommand(REPAINT_COMMAND);

		startButton = new JButton("Begin!");
		startButton.addKeyListener(this);
		startButton.addActionListener(this);
		startButton.setActionCommand(START_COMMAND);
		scoreLabel = new JLabel();

		add(scoreLabel);
		add(startButton);
	}

	public void startGame() {

		physicsEngine = new PhysicsEngine(MainFrame.X_SIZE, MainFrame.Y_SIZE);
		Thread physicsThread = new Thread(physicsEngine);
		physicsThread.start();

		timer.start();
		playSound(AUDIO_NAME);

	}

	@Override
	public void paintComponent(Graphics g) {

		if (bgImage != null) {
			g.drawImage(bgImage, 0, 0, this.getWidth(), this.getHeight(), this);
		}

		// g.setColor(getBackground());
		// g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(getForeground());

		if (physicsEngine != null) {
			scoreLabel.setText("Score: " + physicsEngine.getScore());
			List<Ball> balls = physicsEngine.getBalls();
			for (int i = 0; i < balls.size(); i++) {
				Ball ball = balls.get(i);
				g.fillOval(ball.getX() - ball.getRadius(),
						ball.getY() - ball.getRadius(), ball.getRadius() * 2,
						ball.getRadius() * 2);
			}

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
		// do nothing
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// do nothing
	}

	public void actionPerformed(ActionEvent evt) {
		if (REPAINT_COMMAND.equals(evt.getActionCommand())) {
			repaint();
		} else if (START_COMMAND.equals(evt.getActionCommand())) {
			startGame();
		}
	}

}
