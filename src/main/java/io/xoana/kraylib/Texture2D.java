/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public class Texture2D {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Texture2D(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Texture2D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Texture2D(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(long value) {
    RaylibJNI.Texture2D_id_set(swigCPtr, this, value);
  }

  public long getId() {
    return RaylibJNI.Texture2D_id_get(swigCPtr, this);
  }

  public void setWidth(int value) {
    RaylibJNI.Texture2D_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return RaylibJNI.Texture2D_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    RaylibJNI.Texture2D_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return RaylibJNI.Texture2D_height_get(swigCPtr, this);
  }

  public void setMipmaps(int value) {
    RaylibJNI.Texture2D_mipmaps_set(swigCPtr, this, value);
  }

  public int getMipmaps() {
    return RaylibJNI.Texture2D_mipmaps_get(swigCPtr, this);
  }

  public void setFormat(int value) {
    RaylibJNI.Texture2D_format_set(swigCPtr, this, value);
  }

  public int getFormat() {
    return RaylibJNI.Texture2D_format_get(swigCPtr, this);
  }

  public Texture2D() {
    this(RaylibJNI.new_Texture2D(), true);
  }

}
