package io.xoana.kraylib.graphics;

import io.xoana.kraylib.RaylibLoader;
import io.xoana.kraylib.math.Vector3;
import jnr.ffi.Struct;

public class Camera extends Struct {
	protected Camera() {
		super(RaylibLoader.getRuntime());
	}

	public final StructRef<Vector3> position = new StructRef<Vector3>(Vector3.class);
	public final StructRef<Vector3> target = new StructRef<Vector3>(Vector3.class); // Camera target it looks-at
	public final StructRef<Vector3> up = new StructRef<Vector3>(Vector3.class); // Camera up vector (rotation over its axis)
	public final Float fovy = new Float(); // Camera field-of-view apperture in Y (degrees) in perspective, used as near plane width in orthographic
	public final Signed32 type = new Signed32(); // Camera type, defines projection type: CAMERA_PERSPECTIVE or CAMERA_ORTHOGRAPHIC
}
