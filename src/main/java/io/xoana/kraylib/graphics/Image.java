package io.xoana.kraylib.graphics;

import com.kenai.jffi.Closure;
import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

import java.nio.ByteBuffer;

public class Image extends Struct {
	public Image() {
		super(RaylibLoader.getRuntime());
	}

	// Does this need to be final?
	public ByteBuffer data = null; // Image raw data
	public final Signed32 width = new Signed32();              // Image base width
	public final Signed32 height = new Signed32();             // Image base height
	public final Signed32 mipmaps = new Signed32(); // Mipmap levels, 1 by default
	public final Signed32 format = new Signed32(); // Data format (PixelFormat type)
}
