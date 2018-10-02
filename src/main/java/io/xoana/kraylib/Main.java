package io.xoana.kraylib;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = null;
		try {
			raylib = RaylibLoader.load();
		} catch(IOException ioe) {
			System.err.println("Failed to read from location.");
		}
		raylib.InitWindow(640, 480, "Success!");

		try {
			Thread.sleep(10000);
		} catch(InterruptedException ie) {

		}
	}
}
