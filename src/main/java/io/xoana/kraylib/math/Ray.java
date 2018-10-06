package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Ray extends Structure implements Structure.ByReference, Structure.ByValue {
	public Vector3.ByValue position = new Vector3();
	public Vector3.ByValue direction = new Vector3();

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("position", "direction");
	}
}
