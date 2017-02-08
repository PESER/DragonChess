package com.flowrstuff.graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.flowrstuff.game.Game;
import com.flowrstuff.settings.Display;

public class Engine implements Runnable{
	public Graphics g;
	public BufferStrategy bs;
	public Canvas canvas;
	public Game game;


	public Engine(){
		
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
	

	private void Initialise(){
		//The size of the panel and the canvas is defined by the constant axis


		canvas = new Canvas();
		
		boardWindow.add(canvas);
		//A buffer strategy of 2 frames should be more than enough for a simple chess game
		canvas.createBufferStrategy(2);
		bs = canvas.getBufferStrategy();
		g = bs.getDrawGraphics();
		game = new Game(g);

		game.Start();
		while(true){
			Update();
			Render();
		}
	}
	
	private void Update(){
		game.Update();
	}
	private void Render(){
		
		game.Render();

		
		bs.show();
		g.dispose();
	}
	
	@Override
	public void run() {
		BoardSetup();
		
	}

	public Graphics getG() {
		return g;
	}

	public void setG(Graphics g) {
		this.g = g;
	}

	public BufferStrategy getBs() {
		return bs;
	}

	public void setBs(BufferStrategy bs) {
		this.bs = bs;
	}

	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public JFrame getBoardWindow() {
		return boardWindow;
	}

	public void setBoardWindow(JFrame boardWindow) {
		this.boardWindow = boardWindow;
	}
}
