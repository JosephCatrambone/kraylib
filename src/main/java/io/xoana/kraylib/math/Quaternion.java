package io.xoana.kraylib.math;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// TODO: This should be an alias for Vector4
public class Quaternion extends Struct {
	public Quaternion(Runtime runtime) {
		super(runtime);
	}

	public final Float x = new Struct.Float();
	public final Float y = new Struct.Float();
	public final Float z = new Struct.Float();
	public final Float w = new Struct.Float();
}
