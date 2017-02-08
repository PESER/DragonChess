package com.flowrstuff.game;

import java.awt.Graphics;

import com.flowrstuff.game.elements.Boards;


public class Game {


	Graphics g;
	Boards boards;
	public Game(Graphics g){
		Start();
		this.g = g;
	}
	
	public void Start(){
		boards = new Boards(g);

	}
	
	public void Update(){
		boards.Update();
	}
	
	public void Render(){
		boards.Render();


	}
	
}
