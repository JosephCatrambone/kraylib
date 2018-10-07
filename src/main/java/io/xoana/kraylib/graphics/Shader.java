package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class Shader extends Structure implements Structure.ByReference, Structure.ByValue {
	int id;  // Shader program id
	// 32 ints in-place.
	int loc00; // Shader locations array
	int loc01;
	int loc02;
	int loc03;
	int loc04;
	int loc05;
	int loc06;
	int loc07;
	int loc08;
	int loc09;
	int loc10; // Shader locations array
	int loc11;
	int loc12;
	int loc13;
	int loc14;
	int loc15;
	int loc16;
	int loc17;
	int loc18;
	int loc19;
	int loc20; // Shader locations array
	int loc21;
	int loc22;
	int loc23;
	int loc24;
	int loc25;
	int loc26;
	int loc27;
	int loc28;
	int loc29;
	int loc30; // Shader locations array
	int loc31;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
			"id",
			"loc00",
			"loc01",
			"loc02",
			"loc03",
			"loc04",
			"loc05",
			"loc06",
			"loc07",
			"loc08",
			"loc09",
			"loc10",
			"loc11",
			"loc12",
			"loc13",
			"loc14",
			"loc15",
			"loc16",
			"loc17",
			"loc18",
			"loc19",
			"loc20",
			"loc21",
			"loc22",
			"loc23",
			"loc24",
			"loc25",
			"loc26",
			"loc27",
			"loc28",
			"loc29",
			"loc30",
			"loc31"
		);
	}
}
