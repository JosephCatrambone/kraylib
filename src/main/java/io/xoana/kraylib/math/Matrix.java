package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Matrix extends Structure implements Structure.ByReference, Structure.ByValue {
	public float m0, m4, m8, m12;
	public float m1, m5, m9, m13;
	public float m2, m6, m10, m14;
	public float m3, m7, m11, m15;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
				"m0", "m4", "m8", "m12",
				"m1", "m5", "m9", "m13",
				"m2", "m6", "m10", "m14",
				"m3", "m7", "m11", "m15"
		);
	}
}
