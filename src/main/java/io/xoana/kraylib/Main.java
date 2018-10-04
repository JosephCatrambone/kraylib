package io.xoana.kraylib;

import io.xoana.kraylib.graphics.*;
import io.xoana.kraylib.math.*;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = RaylibLoader.load();
		raylib.InitWindow(640, 480, "Success!");

		int frame = 0;
		Color bg = new Color(0, 0, 0, 255);

		while(!raylib.WindowShouldClose()) {
			raylib.BeginDrawing();
				raylib.ClearBackground(bg);
			raylib.EndDrawing();

			frame++;
			if(frame % 100 == 0) {
				Vector4 normColor = raylib.ColorNormalize(bg);
				System.out.println(normColor.x + ", " + normColor.y + ", " + normColor.z + ", " + normColor.w);

			}
			Thread.yield();
		}

		raylib.CloseWindow();
	}
}
