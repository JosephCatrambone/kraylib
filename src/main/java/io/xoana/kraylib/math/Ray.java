package io.xoana.kraylib.math;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Ray extends Struct {
	public Ray(Runtime runtime) {
		super(runtime);
	}

	public final StructRef<Vector3> position = new StructRef<Vector3>(Vector3.class);
	public final StructRef<Vector3> direction = new StructRef<Vector3>(Vector3.class);
}
