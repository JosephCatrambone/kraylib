package io.xoana.kraylib.graphics;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Color extends Struct {
	public Color(Runtime runtime) {
		super(runtime);
	}
	public Color(int r, int g, int b, int a) {
		super(RaylibLoader.getRuntime());
		this.r.set(r);
		this.g.set(g);
		this.b.set(b);
		this.a.set(a);
	}

	public Color(float r, float g, float b, float a) {
		super(RaylibLoader.getRuntime());
		this.r.set(r*255);
		this.g.set(g*255);
		this.b.set(b*255);
		this.a.set(a*255);
	}

	public final Unsigned8 r = new Unsigned8();
	public final Unsigned8 g = new Unsigned8();
	public final Unsigned8 b = new Unsigned8();
	public final Unsigned8 a = new Unsigned8();
}
