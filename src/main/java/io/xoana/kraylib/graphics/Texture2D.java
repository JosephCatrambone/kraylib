package io.xoana.kraylib.graphics;


import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Texture2D extends Structure implements Structure.ByReference, Structure.ByValue {
	public int id;
	public int width;  // Image base width
	public int height;  // Image base height
	public int mipmaps = 1;  // Mipmap levels, 1 by default
	public int format;  // Data format (PixelFormat type)

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "width", "height", "mipmaps", "format");
	}
}
