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
		this.r = (byte)(0xFF & r);
		this.g = (byte)(0xFF & g);
		this.b = (byte)(0xFF & b);
		this.a = (byte)(0xFF & a);
	}

	public Color() {
		r = 0;
		g = 0;
		b = 0;
		a = 0;
	}

	public int toInt() {
		return r << 24 | g << 16 | b << 8 | a;
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("r", "g", "b", "a");
	}
}
