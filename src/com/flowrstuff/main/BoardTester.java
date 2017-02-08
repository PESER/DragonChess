package com.flowrstuff.main;

public class BoardTester {
	public static void main(String[] args){
		Board board = new Board();
		Thread thread = new Thread(board);
		thread.start();
	}
}
