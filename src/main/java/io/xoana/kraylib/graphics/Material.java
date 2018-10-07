package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Material extends Structure implements Structure.ByReference, Structure.ByValue {
	Shader.ByValue shader;          // Material shader
	MaterialMap.ByValue map00; // Material maps.  Hacky.  Have 12 slots.
	MaterialMap.ByValue map01;
	MaterialMap.ByValue map02;
	MaterialMap.ByValue map03;
	MaterialMap.ByValue map04;
	MaterialMap.ByValue map05;
	MaterialMap.ByValue map06;
	MaterialMap.ByValue map07;
	MaterialMap.ByValue map08;
	MaterialMap.ByValue map09;
	MaterialMap.ByValue map10;
	MaterialMap.ByValue map11;
	float[] params;          // Material generic parameters (if required)

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"shader",
			"map00",
			"map01",
			"map02",
			"map03",
			"map04",
			"map05",
			"map06",
			"map07",
			"map08",
			"map09",
			"map10",
			"map11",
			"params"
		);
	}
}

