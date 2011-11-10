package com.hack.balls.swing;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

	JLabel score;
	
	public GamePanel(MainFrame mainFrame) {
		
		score = new JLabel("Score: 2");
		
		
		add(score);
	}
	
	
}
