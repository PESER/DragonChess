package com.flowrstuff.settings;

public class Display {
	public static int width = 1280;
	public static int height = 720;
	private final int MAX_WIDTH = 1920;
	private final int MAX_HEIGHT = 1080;
	private final int MIN_WIDTH = 1280;
	private final int MIN_HEIGHT = 720;

	public static boolean fullScreen = false;

	
	
	public static int getWidth() {
		return width;
	}

	public static void setWidth(int width) {
		Display.width = width;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		
		Display.height = height;
	}

	public static boolean isFullScreen() {
		return fullScreen;
	}

	public static void setFullScreen(boolean fullScreen) {
		Display.fullScreen = fullScreen;
	}

	public int getMAX_WIDTH() {
		return MAX_WIDTH;
	}

	public int getMAX_HEIGHT() {
		return MAX_HEIGHT;
	}

	public int getMIN_WIDTH() {
		return MIN_WIDTH;
	}

	public int getMIN_HEIGHT() {
		return MIN_HEIGHT;
	}
}
