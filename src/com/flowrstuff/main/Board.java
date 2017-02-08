package com.flowrstuff.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferStrategy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.flowrstuff.graphics.Dimension;
import com.flowrstuff.settings.Display;

public class Board implements Runnable{
	public Graphics g;
	public BufferStrategy bs;
	public Canvas c;
	public Board(){
		
	}
	
	//Setting up the main display of the ingame board window
	public void BoardSetup(){
		CreateWindow();
		Initialise();
		
	}
	
	JFrame boardWindow;
	private void CreateWindow(){
		boardWindow = new JFrame("DragonChess");
		boardWindow.setSize(Display.width, Display.height);
		
		
		if(Display.fullScreen){
			
			//The window will be maximised on both width and height if it's set to fullscreen
			boardWindow.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			boardWindow.setUndecorated(true);
		}
		
		//The application will close when the window is closed
		boardWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//The window will start in the middle of the screen
		boardWindow.setLocationRelativeTo(null);
		
		//The application is then toggled visible
		boardWindow.setVisible(true);
		
		//The window must not be resizable due to graphical implications
		boardWindow.setResizable(false);

		
	}
	
	Thread board1Thread;
	Dimension board1;
	private void Initialise(){
		//Creating a canvas that a single Dimension will be drawn on
		JPanel panel = new JPanel();
		panel.setSize(800, 600);
		c = new Canvas();
		panel.add(c);
		//boardWindow.add(panel);
		
		
		boardWindow.setLayout(new GridBagLayout());
		GridBagConstraints co = new GridBagConstraints();
		boardWindow.add(new JButton("hello"));
		boardWindow.add(new JButton("hello"));
		boardWindow.add(new JButton("hello"));
		boardWindow.add(new JButton("hello"));
		boardWindow.add(panel);
		//A buffer strategy of 2 frames should be more than enough for a simple chess game
		c.createBufferStrategy(2);
		bs = c.getBufferStrategy();
		g = bs.getDrawGraphics();
		board1 = new Dimension(480, 360, 12, 8, Color.blue, Color.gray, g);

		while(true){
			Update();
			Render();
		}
	}
	
	private void Update(){
		
	}
	private void Render(){

		board1.Render();
		bs.show();
		g.dispose();
	}
	
	@Override
	public void run() {
		BoardSetup();
		
	}
}
