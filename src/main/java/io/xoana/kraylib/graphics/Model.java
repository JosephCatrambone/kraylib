package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;
import io.xoana.kraylib.math.Matrix;

import java.util.Arrays;
import java.util.List;

public class Model extends Structure implements Structure.ByReference, Structure.ByValue {
	Mesh.ByValue mesh;              // Vertex data buffers (RAM and VRAM)
	Matrix.ByValue transform;       // Local transform matrix
	Material.ByValue material;      // Shader and textures data

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
				"mesh",
				"transform",
				"material"
		);
	}
}

