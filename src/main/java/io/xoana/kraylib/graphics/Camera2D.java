package io.xoana.kraylib.graphics;


import com.sun.jna.Structure;
import io.xoana.kraylib.math.Vector2;

import java.util.Arrays;
import java.util.List;

public class Camera2D extends Structure {

	public Vector2 offset = new Vector2();
	public Vector2 target = new Vector2();
	public float rotation;
	public float zoom;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("offset", "target", "rotation", "zoom");
	}
}
