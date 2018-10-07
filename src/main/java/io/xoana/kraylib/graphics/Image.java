package io.xoana.kraylib.graphics;


import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Image extends Structure implements Structure.ByReference, Structure.ByValue {
	public byte[] data;  // Image raw data // TODO: If this is buggy, make it Pointer.
	public int width;  // Image base width
	public int height;  // Image base height
	public int mipmaps = 1;  // Mipmap levels, 1 by default
	public int format;  // Data format (PixelFormat type)

	//public class ByReference extends Color implements Structure.ByReference {}
	//public class ByValue extends Color implements Structure.ByValue {}

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("data", "width", "height", "mipmaps", "format");
	}
}
