package io.xoana.kraylib.graphics;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Color extends Struct {
	public Color(Runtime runtime) {
		super(runtime);
	}


	public final Float r = new Float();
	public final Float g = new Float();
	public final Float b = new Float();
	public final Float a = new Float();
}
