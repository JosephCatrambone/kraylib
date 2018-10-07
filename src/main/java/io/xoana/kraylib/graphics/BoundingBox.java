package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;
import io.xoana.kraylib.math.Vector3;

import java.util.Arrays;
import java.util.List;

public class BoundingBox extends Structure implements Structure.ByReference, Structure.ByValue {
	Vector3.ByValue min = new Vector3();
	Vector3.ByValue max = new Vector3();

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("min", "max");
	}
}
