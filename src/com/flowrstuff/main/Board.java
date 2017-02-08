package com.flowrstuff.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.flowrstuff.settings.Display;

public class Board implements Runnable{
	public Graphics g;
	public BufferStrategy bs;
	public Board(){
		
	}
	
	//Setting up the main display of the ingame board window
	public void BoardSetup(){
		CreateWindow();
		CreateGraphics();
		
	}
	
	private void CreateWindow(){
		JFrame boardWindow = new JFrame("DragonChess");
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
	
	private void CreateGraphics(){
		
		
		
		while(true){
			
		}
	}
	
	private void Update(){
		
	}
	private void Render(){
		
	}
	
	@Override
	public void run() {
		BoardSetup();
		
	}
}
