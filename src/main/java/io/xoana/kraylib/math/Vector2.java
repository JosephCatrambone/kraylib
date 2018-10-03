package io.xoana.kraylib.math;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Vector2 extends Struct {
	public Vector2(Runtime runtime) {
		super(runtime);
	}

	public final Float x = new Float();
	public final Float y = new Float();
}
