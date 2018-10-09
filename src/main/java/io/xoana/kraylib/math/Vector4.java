package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Vector4 extends Structure {
	public float x;
	public float y;
	public float z;
	public float w;

	//public class ByReference extends Color implements Structure.ByReference {}
	//public class ByValue extends Color implements Structure.ByValue {}

	public Vector4(float x, float y, float z, float w) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.w = w;
	}

	public Vector4() {
		x = 0f;
		y = 0f;
		z = 0f;
		w = 0f;
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("x", "y", "z", "w");
	}
}
