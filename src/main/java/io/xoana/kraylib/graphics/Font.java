package io.xoana.kraylib.graphics;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class Font extends Struct {
	public Font(Runtime runtime) {
		super(runtime);
	}

	public final StructRef<Texture2D> texture = new StructRef<>(Texture2D.class);  // Font texture
	public final Signed32 baseSize = new Signed32();  // Base size (default chars height)
	public final Signed32 charsCount = new Signed32();  // Number of characters
	// CharInfo*
	public final Pointer chars = new Pointer();  // Characters info data
}
