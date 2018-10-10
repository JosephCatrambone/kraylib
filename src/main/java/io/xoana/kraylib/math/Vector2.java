package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Vector2 extends Structure {
	public float x;
	public float y;

	public class ByReference extends Vector2 implements Structure.ByReference {}
	public class ByValue extends Vector2 implements Structure.ByValue {
		public ByValue(){};
		public ByValue(float x, float y) { super(x, y); }
	}

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
