package io.xoana.kraylib;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = null;
		raylib = RaylibLoader.load();
		raylib.InitWindow(640, 480, "Success!");

		try {
			Thread.sleep(10000);
		} catch(InterruptedException ie) {

		}
	}
}
