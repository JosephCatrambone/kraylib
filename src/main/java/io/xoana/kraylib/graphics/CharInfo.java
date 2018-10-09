package io.xoana.kraylib.graphics;


import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import io.xoana.kraylib.math.Rectangle;

import java.util.Arrays;
import java.util.List;

public class CharInfo extends Structure implements Structure.ByReference, Structure.ByValue {
	public int value = 0;  // Character value (Unicode)
	public Rectangle rec = new Rectangle();
	public int offsetX = 0;  // Character offset X when drawing
	public int offsetY = 0;  // Character offset Y when drawing
	public int advanceX = 0;  // Character advance position X
	// Does this have to be Pointer, or can it be byte[]?  I'm going to try byte[], but we might have bugs.
	public byte[] data = null; //unsigned char *data;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("value", "rec", "offsetX", "offsetY", "advanceX", "data");
	}
}
