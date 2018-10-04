package io.xoana.kraylib;

import io.xoana.kraylib.graphics.*;
import jnr.ffi.Struct;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = RaylibLoader.load();
		raylib.InitWindow(640, 480, "Success!");

		int frame = 0;
		Color bg = new Color(0, 0, 0, 255);
		System.out.println(Struct.size(bg));

		while(!raylib.WindowShouldClose()) {
			raylib.BeginDrawing();
				raylib.ClearBackground(bg.toInt());
			raylib.EndDrawing();
			Thread.yield();
		}

		raylib.CloseWindow();
	}
}
