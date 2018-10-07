package io.xoana.kraylib;

import io.xoana.kraylib.graphics.*;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = Raylib.INSTANCE;
		raylib.InitWindow(640, 480, "Success!");

		Color c = new Color(255, 255, 255, 255);

		while(!raylib.WindowShouldClose()) {
			raylib.BeginDrawing();
				raylib.ClearBackground(c);
				raylib.DrawText("This was profoundly difficult.", 100, 100, 32, new Color(0, 0, 0, 255));
			raylib.EndDrawing();
			Thread.yield();
		}

		raylib.CloseWindow();
	}
}
