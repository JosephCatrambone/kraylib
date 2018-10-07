package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class MaterialMap extends Structure implements Structure.ByReference, Structure.ByValue {
	Texture2D.ByValue texture;  // Material map texture
	Color.ByValue color;  // Material map color
	float value;  // Material map value

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"texture",
			"color",
			"value"
		);
	}
}

