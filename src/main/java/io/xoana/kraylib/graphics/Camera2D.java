package io.xoana.kraylib.graphics;


import com.sun.jna.Structure;
import io.xoana.kraylib.math.Vector2;

import java.util.Arrays;
import java.util.List;

public class Camera2D extends Structure implements Structure.ByReference, Structure.ByValue {

	public Vector2.ByValue offset = new Vector2();
	public Vector2.ByValue target = new Vector2();
	public float rotation;
	public float zoom;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("offset", "target", "rotation", "zoom");
	}
}
