package io.xoana.kraylib.graphics;

import io.xoana.kraylib.RaylibLoader;
import io.xoana.kraylib.math.Vector2;
import io.xoana.kraylib.math.Vector3;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Camera2D extends Struct {
	public Camera2D(Runtime runtime) {
		super(runtime);
	}


	public final StructRef<Vector2> offset = new StructRef<Vector2>(Vector2.class);
	public final StructRef<Vector2> target = new StructRef<Vector2>(Vector2.class); // Camera target it looks-at
	public final Float rotation = new Float(); // Camera field-of-view apperture in Y (degrees) in perspective, used as near plane width in orthographic
	public final Float zoom = new Float(); // Camera type, defines projection type: CAMERA_PERSPECTIVE or CAMERA_ORTHOGRAPHIC
}
