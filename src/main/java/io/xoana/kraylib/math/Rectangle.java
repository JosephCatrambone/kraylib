package io.xoana.kraylib.math;

import io.xoana.kraylib.math.Vector3;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Rectangle extends Struct {
	public Rectangle(Runtime runtime) {
		super(runtime);
	}

	public final Float x = new Float();
	public final Float y = new Float();
	public final Float width = new Float();
	public final Float height = new Float();
}
