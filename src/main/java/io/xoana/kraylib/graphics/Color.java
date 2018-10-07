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
}
