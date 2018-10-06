package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Rectangle extends Structure implements Structure.ByReference, Structure.ByValue {
	public float x;
	public float y;
	public float width;
	public float height;

	//public class ByReference extends Color implements Structure.ByReference {}
	//public class ByValue extends Color implements Structure.ByValue {}

	public Rectangle(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		x = 0f;
		y = 0f;
		width = 0f;
		height = 0f;
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("x", "y", "width", "height");
	}
}
