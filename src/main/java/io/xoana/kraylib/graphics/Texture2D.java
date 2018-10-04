package io.xoana.kraylib.graphics;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Texture2D extends Struct {
	public Texture2D(Runtime runtime) {
		super(runtime);
	}

	public final Unsigned32 id = new Unsigned32(); // OpenGL texture id
	public final Signed32 width = new Signed32(); // Texture base width
	public final Signed32 height = new Signed32(); // Texture base height
	public final Signed32 mipmaps = new Signed32(); // Mipmap levels, 1 by default
	public final Signed32 format = new Signed32(); // Data format (PixelFormat type)
}
