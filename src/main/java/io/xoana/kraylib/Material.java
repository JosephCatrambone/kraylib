/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public class Material {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Material(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Material obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Material(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setShader(Shader value) {
    RaylibJNI.Material_shader_set(swigCPtr, this, Shader.getCPtr(value), value);
  }

  public Shader getShader() {
    long cPtr = RaylibJNI.Material_shader_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Shader(cPtr, false);
  }

  public void setMaps(MaterialMap value) {
    RaylibJNI.Material_maps_set(swigCPtr, this, MaterialMap.getCPtr(value), value);
  }

  public MaterialMap getMaps() {
    long cPtr = RaylibJNI.Material_maps_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MaterialMap(cPtr, false);
  }

  public void setParams(SWIGTYPE_p_float value) {
    RaylibJNI.Material_params_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getParams() {
    long cPtr = RaylibJNI.Material_params_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public Material() {
    this(RaylibJNI.new_Material(), true);
  }

}