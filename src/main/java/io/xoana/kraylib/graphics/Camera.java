package io.xoana.kraylib.graphics;


import com.sun.jna.Structure;
import io.xoana.kraylib.math.Vector3;

import java.util.Arrays;
import java.util.List;

public class Camera extends Structure implements Structure.ByReference, Structure.ByValue {
	public static final int CAMERA_PERSPECTIVE = 0;
	public static final int CAMERA_ORTHOGRAPHIC = 1;

	public Vector3.ByValue position = new Vector3();
	public Vector3.ByValue target = new Vector3();
	public Vector3.ByValue up = new Vector3();
	public float fovy = 0f;
	public int type = 0;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("position", "target", "up", "fovy", "type");
	}
}
