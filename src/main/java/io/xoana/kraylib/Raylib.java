package io.xoana.kraylib;

import jnr.ffi.LibraryLoader;

public interface Raylib {
	void InitWindow(int width, int height, String title);
	void CloseWindow();
	boolean IsWindowReady();
}