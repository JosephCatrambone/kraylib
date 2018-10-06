package io.xoana.kraylib.graphics;


import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public class RenderTexture2D extends Structure implements Structure.ByReference, Structure.ByValue {
	public int id = 0;        // OpenGL Framebuffer Object (FBO) id
	public Texture2D.ByValue texture = null; // Color buffer attachment texture
	public Texture2D.ByValue depth = null; // Depth buffer attachment texture

	@Override
	protected List<String> getFieldOrder() {
		return Arrays.asList("id", "texture", "depth");
	}
}
