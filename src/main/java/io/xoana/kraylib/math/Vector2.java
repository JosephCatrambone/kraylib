package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Vector2 extends Structure {
	public float x;
	public float y;

	//public class ByReference extends Color implements Structure.ByReference {}
	//public class ByValue extends Color implements Structure.ByValue {}

	public Vector2(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Vector2() {
		x = 0f;
		y = 0f;
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("x", "y");
	}
}
