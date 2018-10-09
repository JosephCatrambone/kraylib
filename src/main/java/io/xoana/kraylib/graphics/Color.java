package io.xoana.kraylib.graphics;


import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Color extends Structure implements Structure.ByReference, Structure.ByValue {
	public byte r;
	public byte g;
	public byte b;
	public byte a;

	//public class ByReference extends Color implements Structure.ByReference {}
	//public class ByValue extends Color implements Structure.ByValue {}

	public Color(int r, int g, int b, int a) {
		// TODO: Assert if any are outside the range of 0-255.
		set(r, g, b, a);
	}

	public Color(float r, float g, float b, float a) {
		set((int)(255*r), (int)(255*g), (int)(255*b), (int)(255*a));
	}

	// Default init is zero.
	public Color() {}

	public void set(int r, int g, int b, int a) {
		if(r != -1) { this.r = (byte)(r&0xFF); }
		if(g != -1) { this.g = (byte)(g&0xFF); }
		if(b != -1) { this.b = (byte)(b&0xFF); }
		if(a != -1) { this.a = (byte)(a&0xFF); }
	}

	public int toInt() {
		return r << 24 | g << 16 | b << 8 | a;
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("r", "g", "b", "a");
	}

	// Enormous color list:
	public static final Color LIGHTGRAY  = new Color(200, 200, 200, 255);   // Light Gray
	public static final Color GRAY       = new Color(130, 130, 130, 255);   // Gray
	public static final Color DARKGRAY   = new Color(80, 80, 80, 255);      // Dark Gray
	public static final Color YELLOW     = new Color(253, 249, 0, 255);     // Yellow
	public static final Color GOLD       = new Color(255, 203, 0, 255);     // Gold
	public static final Color ORANGE     = new Color(255, 161, 0, 255);     // Orange
	public static final Color PINK       = new Color(255, 109, 194, 255);   // Pink
	public static final Color RED        = new Color(230, 41, 55, 255);     // Red
	public static final Color MAROON     = new Color(190, 33, 55, 255);     // Maroon
	public static final Color GREEN      = new Color(0, 228, 48, 255);      // Green
	public static final Color LIME       = new Color(0, 158, 47, 255);      // Lime
	public static final Color DARKGREEN  = new Color(0, 117, 44, 255);      // Dark Green
	public static final Color SKYBLUE    = new Color(102, 191, 255, 255);   // Sky Blue
	public static final Color BLUE       = new Color(0, 121, 241, 255);     // Blue
	public static final Color DARKBLUE   = new Color(0, 82, 172, 255);      // Dark Blue
	public static final Color PURPLE     = new Color(200, 122, 255, 255);   // Purple
	public static final Color VIOLET     = new Color(135, 60, 190, 255);    // Violet
	public static final Color DARKPURPLE = new Color(112, 31, 126, 255);    // Dark Purple
	public static final Color BEIGE      = new Color(211, 176, 131, 255);   // Beige
	public static final Color BROWN      = new Color(127, 106, 79, 255);    // Brown
	public static final Color DARKBROWN  = new Color(76, 63, 47, 255);      // Dark Brown

	public static final Color WHITE      = new Color(255, 255, 255, 255);   // White
	public static final Color BLACK      = new Color(0, 0, 0, 255);         // Black
	public static final Color BLANK      = new Color(0, 0, 0, 0);           // Blank (Transparent)
	public static final Color MAGENTA    = new Color(255, 0, 255, 255);     // Magenta
	public static final Color RAYWHITE   = new Color(245, 245, 245, 255);   // My own White (raylib logo)
}
