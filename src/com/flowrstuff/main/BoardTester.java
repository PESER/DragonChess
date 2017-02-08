package com.flowrstuff.main;

import com.flowrstuff.graphics.Engine;

public class BoardTester {
	public static void main(String[] args){
		Engine board = new Engine();
		Thread thread = new Thread(board);
		thread.start();
	}
}
