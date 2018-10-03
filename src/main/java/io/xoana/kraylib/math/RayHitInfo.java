package io.xoana.kraylib.math;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class RayHitInfo extends Struct {
	public RayHitInfo() {
		super(RaylibLoader.getRuntime());
	}

	public final Unsigned8 hit = new Unsigned8();
	public final Float distance = new Float();
	public final StructRef<Vector3> position = new StructRef<Vector3>(Vector3.class);
	public final StructRef<Vector3> normal = new StructRef<Vector3>(Vector3.class);
}
