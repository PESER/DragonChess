package com.flowrstuff.graphics;

import java.awt.Color;
import java.awt.Graphics;


public class Dimension {
	private int width, height, gridSizeX, gridSizeY;
	private Color c1, c2;
	private Graphics g;
	
	
	public Dimension(int width, int height, int gridSizeX, int gridSizeY, Color c1, Color c2, Graphics g){
		this.width = width;
		this.gridSizeX = gridSizeX;
		this.gridSizeY = gridSizeY;
		this.height = height;
		this.g = g;
		
		//The two colours of the Dimension grid
		this.c1 = c1;
		this.c2 = c2;
		
		
	}
	

	public void Update(){

	}
	
	public void Render(){

		
		DrawGrid();

	}

	
	private void DrawGrid(){
		int gridDimensionX = width / gridSizeX;
		int gridDimensionY = height / gridSizeY;
		for(int x = 0; x < gridSizeX; x++){
			for(int y = 0; y < gridSizeY; y++){
				if(x % 2 == 0 && y % 2 == 0){
					g.setColor(c1);
				}else if(x % 2 == 1 && y % 2 == 1){
					g.setColor(c1);
				}else{
					g.setColor(c2);
				}
				g.fillRect(x * gridDimensionX, y * gridDimensionY, gridDimensionX, gridDimensionY);
			}
		}
	}
	
}
