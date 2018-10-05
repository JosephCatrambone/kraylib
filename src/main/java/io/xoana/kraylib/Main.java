package io.xoana.kraylib;

public class Main {
	public static void main(String[] args) {
		RaylibLoader.load();
		Raylib.InitWindow(640, 480, "Success!");

		int frame = 0;
		Color bg = new Color();
		bg.setG((short)255);

		while(!Raylib.WindowShouldClose()) {
			Raylib.BeginDrawing();
				Raylib.ClearBackground(bg);
			Raylib.EndDrawing();
			Thread.yield();
		}

		Raylib.CloseWindow();
	}
}
