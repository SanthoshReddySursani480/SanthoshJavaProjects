package Santhosh;

import java.awt.Color;

import javax.swing.JFrame;

public class SnakeGame extends JFrame  {
	
	SnakeGame()

	{  
		
		GamePanel gamePanel= new GamePanel();
		this.add(gamePanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Snake Game");
		
		this.setResizable(false);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
