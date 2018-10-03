package io.xoana.kraylib.math;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Vector4 extends Struct {
	protected Vector4(Runtime runtime) {
		super(runtime);
	}

	public final Float x = new Float();
	public final Float y = new Float();
	public final Float z = new Float();
	public final Float w = new Float();
}
