/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public final class PixelFormat {
  public final static PixelFormat UNCOMPRESSED_GRAYSCALE = new PixelFormat("UNCOMPRESSED_GRAYSCALE", RaylibJNI.UNCOMPRESSED_GRAYSCALE_get());
  public final static PixelFormat UNCOMPRESSED_GRAY_ALPHA = new PixelFormat("UNCOMPRESSED_GRAY_ALPHA");
  public final static PixelFormat UNCOMPRESSED_R5G6B5 = new PixelFormat("UNCOMPRESSED_R5G6B5");
  public final static PixelFormat UNCOMPRESSED_R8G8B8 = new PixelFormat("UNCOMPRESSED_R8G8B8");
  public final static PixelFormat UNCOMPRESSED_R5G5B5A1 = new PixelFormat("UNCOMPRESSED_R5G5B5A1");
  public final static PixelFormat UNCOMPRESSED_R4G4B4A4 = new PixelFormat("UNCOMPRESSED_R4G4B4A4");
  public final static PixelFormat UNCOMPRESSED_R8G8B8A8 = new PixelFormat("UNCOMPRESSED_R8G8B8A8");
  public final static PixelFormat UNCOMPRESSED_R32 = new PixelFormat("UNCOMPRESSED_R32");
  public final static PixelFormat UNCOMPRESSED_R32G32B32 = new PixelFormat("UNCOMPRESSED_R32G32B32");
  public final static PixelFormat UNCOMPRESSED_R32G32B32A32 = new PixelFormat("UNCOMPRESSED_R32G32B32A32");
  public final static PixelFormat COMPRESSED_DXT1_RGB = new PixelFormat("COMPRESSED_DXT1_RGB");
  public final static PixelFormat COMPRESSED_DXT1_RGBA = new PixelFormat("COMPRESSED_DXT1_RGBA");
  public final static PixelFormat COMPRESSED_DXT3_RGBA = new PixelFormat("COMPRESSED_DXT3_RGBA");
  public final static PixelFormat COMPRESSED_DXT5_RGBA = new PixelFormat("COMPRESSED_DXT5_RGBA");
  public final static PixelFormat COMPRESSED_ETC1_RGB = new PixelFormat("COMPRESSED_ETC1_RGB");
  public final static PixelFormat COMPRESSED_ETC2_RGB = new PixelFormat("COMPRESSED_ETC2_RGB");
  public final static PixelFormat COMPRESSED_ETC2_EAC_RGBA = new PixelFormat("COMPRESSED_ETC2_EAC_RGBA");
  public final static PixelFormat COMPRESSED_PVRT_RGB = new PixelFormat("COMPRESSED_PVRT_RGB");
  public final static PixelFormat COMPRESSED_PVRT_RGBA = new PixelFormat("COMPRESSED_PVRT_RGBA");
  public final static PixelFormat COMPRESSED_ASTC_4x4_RGBA = new PixelFormat("COMPRESSED_ASTC_4x4_RGBA");
  public final static PixelFormat COMPRESSED_ASTC_8x8_RGBA = new PixelFormat("COMPRESSED_ASTC_8x8_RGBA");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static PixelFormat swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + PixelFormat.class + " with value " + swigValue);
  }

  private PixelFormat(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private PixelFormat(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private PixelFormat(String swigName, PixelFormat swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static PixelFormat[] swigValues = { UNCOMPRESSED_GRAYSCALE, UNCOMPRESSED_GRAY_ALPHA, UNCOMPRESSED_R5G6B5, UNCOMPRESSED_R8G8B8, UNCOMPRESSED_R5G5B5A1, UNCOMPRESSED_R4G4B4A4, UNCOMPRESSED_R8G8B8A8, UNCOMPRESSED_R32, UNCOMPRESSED_R32G32B32, UNCOMPRESSED_R32G32B32A32, COMPRESSED_DXT1_RGB, COMPRESSED_DXT1_RGBA, COMPRESSED_DXT3_RGBA, COMPRESSED_DXT5_RGBA, COMPRESSED_ETC1_RGB, COMPRESSED_ETC2_RGB, COMPRESSED_ETC2_EAC_RGBA, COMPRESSED_PVRT_RGB, COMPRESSED_PVRT_RGBA, COMPRESSED_ASTC_4x4_RGBA, COMPRESSED_ASTC_8x8_RGBA };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
