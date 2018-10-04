package io.xoana.kraylib.graphics;

import io.xoana.kraylib.math.Rectangle;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public class CharInfo extends Struct {
	public CharInfo(Runtime runtime) {
		super(runtime);
	}

	public final Signed32 value = new Signed32();  // Character value (Unicode)
	public final StructRef<Rectangle> rec = new StructRef<Rectangle>(Rectangle.class);   // Character rectangle in sprite font
	public final Signed32 offsetX = new Signed32();  // Character offset X when drawing
	public final Signed32 offsetY = new Signed32();  // Character offset Y when drawing
	public final Signed32 advanceX = new Signed32();  // Character advance position X
	//unsigned char *data;
	public final Pointer data = new Pointer();
	// Pointer ptr = ((DelegatingMemoryIO) Struct.getMemory(array[0])).getDelegatedMemoryIO();
	// Struct.arrayOf(runtime, some class? but what of native?, size);

}
