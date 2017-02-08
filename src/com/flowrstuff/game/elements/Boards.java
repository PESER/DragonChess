package com.flowrstuff.game.elements;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.flowrstuff.game.pieces.Piece;
import com.flowrstuff.game.pieces.Warrior;
import com.flowrstuff.graphics.Dimension;

public class Boards {
	private ArrayList<Piece> piecesRed = new ArrayList<Piece>();
	private ArrayList<Piece> piecesGold = new ArrayList<Piece>();
	private Dimension main;
	private Dimension top;
	private Dimension bot;
	private Graphics g;
	private Image mainDimension;
	private Image skyDimension;
	private Image underDimension;

	
	public Boards(Graphics g){
		this.g = g;
		Start();
	}
	public void SetPieces(){
		Piece warrior = new Warrior();
		piecesRed.add(warrior);
		piecesGold.add(warrior);
	}
	public void Start(){
		
		File groundFile = new File("src/chess1.png");
		File skyFile = new File("src/chess2.png");
		File underFile = new File("src/chess3.png");

		try {
			mainDimension = ImageIO.read(groundFile);
			skyDimension = ImageIO.read(skyFile);
			underDimension = ImageIO.read(underFile);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		main = new Dimension(460, 20, 800, 600, mainDimension, g);
		top = new Dimension(70, 60, 300, 225, skyDimension, g);
		bot = new Dimension(70, 360, 300, 225, underDimension, g);

		SetPieces();

	}
	
	public void Update(){
		
	}
	
	public void Render(){
		main.Render();
		top.Render();
		bot.Render();

	}
}
