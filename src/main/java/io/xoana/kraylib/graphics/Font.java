package io.xoana.kraylib.graphics;


import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Font extends Structure implements Structure.ByReference, Structure.ByValue {
	public Texture2D.ByValue texture = null;
	public int baseSize = 0;  // Base size (default chars height)
	public int charsCount = 0;  // Number of characters
	public Pointer chars = null;  // Characters info data

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("texture", "baseSize", "charsCount", "chars");
	}
}
