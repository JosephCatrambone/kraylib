package io.xoana.kraylib.math;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// TODO: This should be an alias for Vector4
public class Quaternion extends Struct {
	protected Quaternion() {
		super(RaylibLoader.getRuntime());
	}

	public final Float x = new Struct.Float();
	public final Float y = new Struct.Float();
	public final Float z = new Struct.Float();
	public final Float w = new Struct.Float();
}
