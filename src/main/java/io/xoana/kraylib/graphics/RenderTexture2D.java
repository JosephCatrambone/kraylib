package io.xoana.kraylib.graphics;

import io.xoana.kraylib.Raylib;
import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class RenderTexture2D extends Struct {
	public RenderTexture2D(Runtime runtime) {
		super(runtime);
	}

	public final Unsigned32 id = new Unsigned32();        // OpenGL Framebuffer Object (FBO) id
	public final StructRef<Texture2D> texture = new StructRef<Texture2D>(Texture2D.class); // Color buffer attachment texture
	public final StructRef<Texture2D> depth = new StructRef<Texture2D>(Texture2D.class); // Depth buffer attachment texture
}
