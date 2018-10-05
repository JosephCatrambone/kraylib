/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public class VrDeviceInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected VrDeviceInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VrDeviceInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_VrDeviceInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHResolution(int value) {
    RaylibJNI.VrDeviceInfo_hResolution_set(swigCPtr, this, value);
  }

  public int getHResolution() {
    return RaylibJNI.VrDeviceInfo_hResolution_get(swigCPtr, this);
  }

  public void setVResolution(int value) {
    RaylibJNI.VrDeviceInfo_vResolution_set(swigCPtr, this, value);
  }

  public int getVResolution() {
    return RaylibJNI.VrDeviceInfo_vResolution_get(swigCPtr, this);
  }

  public void setHScreenSize(float value) {
    RaylibJNI.VrDeviceInfo_hScreenSize_set(swigCPtr, this, value);
  }

  public float getHScreenSize() {
    return RaylibJNI.VrDeviceInfo_hScreenSize_get(swigCPtr, this);
  }

  public void setVScreenSize(float value) {
    RaylibJNI.VrDeviceInfo_vScreenSize_set(swigCPtr, this, value);
  }

  public float getVScreenSize() {
    return RaylibJNI.VrDeviceInfo_vScreenSize_get(swigCPtr, this);
  }

  public void setVScreenCenter(float value) {
    RaylibJNI.VrDeviceInfo_vScreenCenter_set(swigCPtr, this, value);
  }

  public float getVScreenCenter() {
    return RaylibJNI.VrDeviceInfo_vScreenCenter_get(swigCPtr, this);
  }

  public void setEyeToScreenDistance(float value) {
    RaylibJNI.VrDeviceInfo_eyeToScreenDistance_set(swigCPtr, this, value);
  }

  public float getEyeToScreenDistance() {
    return RaylibJNI.VrDeviceInfo_eyeToScreenDistance_get(swigCPtr, this);
  }

  public void setLensSeparationDistance(float value) {
    RaylibJNI.VrDeviceInfo_lensSeparationDistance_set(swigCPtr, this, value);
  }

  public float getLensSeparationDistance() {
    return RaylibJNI.VrDeviceInfo_lensSeparationDistance_get(swigCPtr, this);
  }

  public void setInterpupillaryDistance(float value) {
    RaylibJNI.VrDeviceInfo_interpupillaryDistance_set(swigCPtr, this, value);
  }

  public float getInterpupillaryDistance() {
    return RaylibJNI.VrDeviceInfo_interpupillaryDistance_get(swigCPtr, this);
  }

  public void setLensDistortionValues(SWIGTYPE_p_float value) {
    RaylibJNI.VrDeviceInfo_lensDistortionValues_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getLensDistortionValues() {
    long cPtr = RaylibJNI.VrDeviceInfo_lensDistortionValues_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void setChromaAbCorrection(SWIGTYPE_p_float value) {
    RaylibJNI.VrDeviceInfo_chromaAbCorrection_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
  }

  public SWIGTYPE_p_float getChromaAbCorrection() {
    long cPtr = RaylibJNI.VrDeviceInfo_chromaAbCorrection_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public VrDeviceInfo() {
    this(RaylibJNI.new_VrDeviceInfo(), true);
  }

}
