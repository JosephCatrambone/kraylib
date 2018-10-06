package io.xoana.kraylib;

import io.xoana.kraylib.graphics.*;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = Raylib.INSTANCE;
		raylib.InitWindow(640, 480, "Success!");

		Color c = new Color(0, 255, 0, 255);

		while(!raylib.WindowShouldClose()) {
			raylib.BeginDrawing();
				raylib.ClearBackground(c);
			raylib.EndDrawing();
			Thread.yield();
		}

		raylib.CloseWindow();
	}
}
