package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Quaternion extends Structure implements Structure.ByReference, Structure.ByValue {
	public float x;
	public float y;
	public float z;
	public float w;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("x", "y", "z", "w");
	}
}
