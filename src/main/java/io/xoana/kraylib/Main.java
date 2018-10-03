package io.xoana.kraylib;

import io.xoana.kraylib.graphics.Color;
import io.xoana.kraylib.math.Rectangle;
import io.xoana.kraylib.math.Vector2;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Raylib raylib = RaylibLoader.load();
		raylib.InitWindow(640, 480, "Success!");

		Rectangle rekt = new Rectangle(RaylibLoader.getRuntime());
		rekt.x.set(10);
		rekt.y.set(10);
		rekt.width.set(50);
		rekt.height.set(30);

		Vector2 v = new Vector2(RaylibLoader.getRuntime());
		v.x.set(20f);
		v.y.set(20f);

		Color bg = new Color(RaylibLoader.getRuntime());
		bg.r.set(1f);
		bg.g.set(1f);
		bg.b.set(1f);
		bg.a.set(1f);

		Color c = new Color(RaylibLoader.getRuntime());
		c.r.set(0f);
		c.g.set(0f);
		c.b.set(1f);
		c.a.set(1f);

		while(!raylib.WindowShouldClose()) {
			raylib.BeginDrawing();
				raylib.ClearBackground(bg);
				raylib.DrawRectanglePro(rekt, v, 10f, c);
			raylib.EndDrawing();
			Thread.yield();
		}

		raylib.CloseWindow();
	}
}
