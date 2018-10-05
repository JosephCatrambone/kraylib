/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public final class TexmapIndex {
  public final static TexmapIndex MAP_ALBEDO = new TexmapIndex("MAP_ALBEDO", RaylibJNI.MAP_ALBEDO_get());
  public final static TexmapIndex MAP_METALNESS = new TexmapIndex("MAP_METALNESS", RaylibJNI.MAP_METALNESS_get());
  public final static TexmapIndex MAP_NORMAL = new TexmapIndex("MAP_NORMAL", RaylibJNI.MAP_NORMAL_get());
  public final static TexmapIndex MAP_ROUGHNESS = new TexmapIndex("MAP_ROUGHNESS", RaylibJNI.MAP_ROUGHNESS_get());
  public final static TexmapIndex MAP_OCCLUSION = new TexmapIndex("MAP_OCCLUSION");
  public final static TexmapIndex MAP_EMISSION = new TexmapIndex("MAP_EMISSION");
  public final static TexmapIndex MAP_HEIGHT = new TexmapIndex("MAP_HEIGHT");
  public final static TexmapIndex MAP_CUBEMAP = new TexmapIndex("MAP_CUBEMAP");
  public final static TexmapIndex MAP_IRRADIANCE = new TexmapIndex("MAP_IRRADIANCE");
  public final static TexmapIndex MAP_PREFILTER = new TexmapIndex("MAP_PREFILTER");
  public final static TexmapIndex MAP_BRDF = new TexmapIndex("MAP_BRDF");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TexmapIndex swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TexmapIndex.class + " with value " + swigValue);
  }

  private TexmapIndex(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TexmapIndex(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TexmapIndex(String swigName, TexmapIndex swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TexmapIndex[] swigValues = { MAP_ALBEDO, MAP_METALNESS, MAP_NORMAL, MAP_ROUGHNESS, MAP_OCCLUSION, MAP_EMISSION, MAP_HEIGHT, MAP_CUBEMAP, MAP_IRRADIANCE, MAP_PREFILTER, MAP_BRDF };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
