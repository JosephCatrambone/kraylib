package io.xoana.kraylib;

import io.xoana.kraylib.graphics.*;
import io.xoana.kraylib.math.Vector3;

public class Main {

	// Core Demos
	public static void demo_3d_mode() {
		Raylib raylib = Raylib.INSTANCE;
		int screenWidth = 800;
		int screenHeight = 450;

		raylib.InitWindow(screenWidth, screenHeight, "raylib [core] example - 3d mode");

		// Define the camera to look into our 3d world
		Camera camera = new Camera();
		camera.position = new Vector3(0.0f, 10.0f, 10.0f);  // Camera position
		camera.target = new Vector3(0.0f, 0.0f, 0.0f);      // Camera looking at point
		camera.up = new Vector3(0.0f, 1.0f, 0.0f);          // Camera up vector (rotation towards target)
		camera.fovy = 45.0f;                                // Camera field-of-view Y
		camera.type = Camera.CAMERA_PERSPECTIVE;                   // Camera mode type

		Vector3 cubePosition = new Vector3(0.0f, 0.0f, 0.0f);

		raylib.SetTargetFPS(60);   // Set our game to run at 60 frames-per-second
		//--------------------------------------------------------------------------------------

		final Color RAYWHITE = new Color(1f, 1f, 1f, 1f);
		final Color RED = new Color(1f, 0f, 0f, 1f);
		final Color MAROON = new Color(0.9f, 0f, 0.1f, 1f);
		final Color DARKGRAY = new Color(0.2f, 0.2f, 0.2f, 1f);

		// Main game loop
		while (!raylib.WindowShouldClose())    // Detect window close button or ESC key
		{
			// Update
			//----------------------------------------------------------------------------------
			// TODO: Update your variables here
			//----------------------------------------------------------------------------------

			// Draw
			//----------------------------------------------------------------------------------
			raylib.BeginDrawing();

			raylib.ClearBackground(RAYWHITE);

			raylib.BeginMode3D(camera);

			raylib.DrawCube(cubePosition, 2.0f, 2.0f, 2.0f, RED);
			raylib.DrawCubeWires(cubePosition, 2.0f, 2.0f, 2.0f, MAROON);

			raylib.DrawGrid(10, 1.0f);

			raylib.EndMode3D();

			raylib.DrawText("Welcome to the third dimension!", 10, 40, 20, DARKGRAY);

			raylib.DrawFPS(10, 10);

			raylib.EndDrawing();

			Thread.yield();
			//----------------------------------------------------------------------------------
		}

		// De-Initialization
		//--------------------------------------------------------------------------------------
		raylib.CloseWindow();        // Close window and OpenGL context
		//--------------------------------------------------------------------------------------
	}

	public static void main(String[] args) {
		demo_3d_mode();
	}
}
