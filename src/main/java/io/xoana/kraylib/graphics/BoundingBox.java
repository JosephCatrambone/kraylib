package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;
import io.xoana.kraylib.math.Vector3;

import java.util.Arrays;
import java.util.List;

public class BoundingBox extends Structure {
	public Vector3 min = new Vector3();
	public Vector3 max = new Vector3();

	public BoundingBox() {}
	public BoundingBox(Vector3 min, Vector3 max) {
		this.min = min;
		this.max = max;
	}
	public BoundingBox(float xMin, float yMin, float zMin, float xMax, float yMax, float zMax) {
		this.min = new Vector3(xMin, yMin, zMin);
		this.max = new Vector3(xMax, yMax, zMax);
	}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("min", "max");
	}
}
