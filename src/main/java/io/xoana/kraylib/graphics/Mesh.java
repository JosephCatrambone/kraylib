package io.xoana.kraylib.graphics;

import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

public class Mesh extends Structure implements Structure.ByReference, Structure.ByValue {

	int vertexCount;        // Number of vertices stored in arrays
	int triangleCount;      // Number of triangles stored (indexed or not)

	// TODO: If you're getting bugs with this object, looks at these notes.
	// I wasn't sure whether or not to make these pointer objects NIO buffers or Pointer types.
	// These were all pointers.  They may need to go back to that.
	// If the parameter is to be used by the native function outside the scope of the function call,
	// you must use Memory or an NIO direct Buffer.
	// The memory provided by a Java primitive array will only be valid for use by the native code
	// for the duration of the function call.
	float[] vertices;        // Vertex position (XYZ - 3 components per vertex) (shader-location = 0)
	float[] texcoords;       // Vertex texture coordinates (UV - 2 components per vertex) (shader-location = 1)
	float[] texcoords2;      // Vertex second texture coordinates (useful for lightmaps) (shader-location = 5)
	float[] normals;         // Vertex normals (XYZ - 3 components per vertex) (shader-location = 2)
	float[] tangents;        // Vertex tangents (XYZW - 4 components per vertex) (shader-location = 4)
	byte[] colors;  // Vertex colors (RGBA - 4 components per vertex) (shader-location = 3)
	short[] indices;// Vertex indices (in case vertex data comes indexed)

	int vaoId;     // OpenGL Vertex Array Object id
	int vboIdType0;  // OpenGL Vertex Buffer Objects id (7 types of vertex data)
	int vboIdType1;
	int vboIdType2;
	int vboIdType3;
	int vboIdType4;
	int vboIdType5;
	int vboIdType6;

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList(
				"vertexCount",
				"triangleCount",
				"vertices",
				"texcoords",
				"texcoords2",
				"normals",
				"tangents",
				"colors",
				"indices",
				"vaoId",
				"vboId"
		);
	}
}

