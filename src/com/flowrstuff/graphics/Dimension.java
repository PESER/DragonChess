package com.flowrstuff.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;



public class Dimension extends Texture{
	private int width, height, gridSizeX, gridSizeY;
	private Color c1, c2;
	private Graphics g;
	
	public Dimension(int x, int y, int width, int height, Image texture, Graphics g){
		super(x, y, width, height, texture, g);
		SetType(0);
		
		
	}
	
	public void SetType(int type){
		
	}

	public void Update(){

	}
	

	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getGridSizeX() {
		return gridSizeX;
	}


	public void setGridSizeX(int gridSizeX) {
		this.gridSizeX = gridSizeX;
	}


	public int getGridSizeY() {
		return gridSizeY;
	}


	public void setGridSizeY(int gridSizeY) {
		this.gridSizeY = gridSizeY;
	}


	public Color getC1() {
		return c1;
	}


	public void setC1(Color c1) {
		this.c1 = c1;
	}


	public Color getC2() {
		return c2;
	}


	public void setC2(Color c2) {
		this.c2 = c2;
	}


	public Graphics getG() {
		return g;
	}


	public void setG(Graphics g) {
		this.g = g;
	}
	
}
