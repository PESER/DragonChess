package com.flowrstuff.graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Dimension extends JPanel implements Runnable{
	private int width, height, gridSizeX, gridSizeY;
	private Color c1, c2;
	private Graphics g;
	private BufferStrategy bs;
	private Canvas canvas;
	
	
	public Dimension(int width, int height, int gridSizeX, int gridSizeY, Color c1, Color c2){
		this.width = width;
		this.gridSizeX = gridSizeX;
		this.gridSizeY = gridSizeY;
		this.height = height;
		
		//The two colours of the Dimension grid
		this.c1 = c1;
		this.c2 = c2;
		
	}
	
	public void DrawDimension(){
		setSize(width, height);
		canvas = new Canvas();
		this.add(canvas);
		
		canvas.createBufferStrategy(2);
		
		while(true){
			Update();
			Render();
		}
	}
	public void Update(){

	}
	
	public void Render(){
		if(bs == null){
			bs = canvas.getBufferStrategy();
			g = bs.getDrawGraphics();
		}
		
		
		
		DrawGrid();
		
		
	}

	@Override
	public void run() {
		DrawDimension();
	}
	
	private void DrawGrid(){
		int gridDimensionX = width * gridSizeX;
		int gridDimensionY = height * gridSizeY;
		for(int x = 0; x < gridSizeX; x++){
			for(int y = 0; y < gridSizeY; y++){
				g.setColor(c1);
				g.fillRect(x * , y, x, y);
			}
		}
	}
	
}
