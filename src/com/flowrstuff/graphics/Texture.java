package com.flowrstuff.graphics;

import java.awt.Graphics;
import java.awt.Image;

import com.flowrstuff.settings.Display;

public abstract class Texture {
	private int Ux, Uy, height, width;
	private float scale = Display.height / 720;
	private int x, y;
	private Image Utexture;
	private Image texture;
	private Graphics g;
	public Texture(int Ux, int Uy, int width, int height, Image Utexture, Graphics g){
		this.Ux = Ux;
		this.Uy = Uy;
		this.Utexture = Utexture;
		this.g = g;
		this.height = height;
		this.width = width;
		Normalize();
	}
	
	public void Normalize(){
		texture = Utexture.getScaledInstance((int)(Utexture.getWidth(null) / scale), (int)(Utexture.getHeight(null) / scale), Image.SCALE_DEFAULT);
		y = (int) (Uy * scale);
		x = (int) (Ux * scale);
	}
	
	public void Render(){
		g.drawImage(texture, x, y, width, height,  null);
	}
}
