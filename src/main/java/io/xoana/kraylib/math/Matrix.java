package io.xoana.kraylib.math;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Matrix extends Struct {
	public Matrix(Runtime runtime) {
		super(runtime);
	}

	// Matrix type (OpenGL style 4x4 - right handed, column major)
	//float m0, m4, m8, m12;
	//float m1, m5, m9, m13;
	//float m2, m6, m10, m14;
	//float m3, m7, m11, m15;

	public final Float m0 = new Float();
	public final Float m4 = new Float();
	public final Float m8 = new Float();
	public final Float m12 = new Float();

	public final Float m1 = new Float();
	public final Float m5 = new Float();
	public final Float m9 = new Float();
	public final Float m13 = new Float();

	public final Float m2 = new Float();
	public final Float m6 = new Float();
	public final Float m10 = new Float();
	public final Float m14 = new Float();

	public final Float m3 = new Float();
	public final Float m7 = new Float();
	public final Float m11 = new Float();
	public final Float m15 = new Float();
}
