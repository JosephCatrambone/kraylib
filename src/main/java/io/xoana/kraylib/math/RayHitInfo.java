package io.xoana.kraylib.math;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class RayHitInfo extends Structure implements Structure.ByReference, Structure.ByValue {
	public boolean hit;
	public float distance;
	public Vector3.ByValue position;
	public Vector3.ByValue normal;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("hit", "distance", "position", "normal");
	}
}
