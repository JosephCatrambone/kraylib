package io.xoana.kraylib.graphics;

import io.xoana.kraylib.RaylibLoader;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.types.u_int32_t;

import java.nio.ByteOrder;

public class Color extends Struct {
	public final Unsigned8 r = new Unsigned8();
	public final Unsigned8 g = new Unsigned8();
	public final Unsigned8 b = new Unsigned8();
	public final Unsigned8 a = new Unsigned8();

	/*
	@ToNativeConverter.ToNative(nativeType = u_int32_t.class)
	public static int toNative(Color c, ToNativeContext context) {
		if(context.getRuntime().byteOrder() == ByteOrder.LITTLE_ENDIAN) {
			return (0xFF & c.r.get()) << 24 | (0xFF & c.g.get()) << 16 | (0xFF & c.b.get()) << 8 | (0xFF & c.a.get());
		} else {
			return (0xFF & c.a.get()) << 24 | (0xFF & c.b.get()) << 16 | (0xFF & c.g.get()) << 8 | (0xFF & c.r.get());
		}
	}

	@FromNativeConverter.FromNative(nativeType = jnr.ffi.types.u_int32_t.class)
	public static Color fromNative(@jnr.ffi.types.u_int32_t int value, FromNativeContext context) {
		return new Color((value & 0xFF000000) >> 24, (value & 0x00FF0000) >> 16, (value & 0x0000FF00) >> 8, (value & 0x000000FF));
	}
	*/

	public Color(Runtime runtime) {
		super(runtime, new Alignment(0));
	}
	public Color(int r, int g, int b, int a) {
		super(RaylibLoader.getRuntime(), new Alignment(0));
		this.r.set(r);
		this.g.set(g);
		this.b.set(b);
		this.a.set(a);
	}

	public Color(float r, float g, float b, float a) {
		super(RaylibLoader.getRuntime(), new Alignment(0));
		this.r.set(r*255);
		this.g.set(g*255);
		this.b.set(b*255);
		this.a.set(a*255);
	}

	public int toInt() {
		return (0xFF & r.get()) << 24 | (0xFF & g.get()) << 16 | (0xFF & b.get()) << 8 | (0xFF & a.get());
	}
}
