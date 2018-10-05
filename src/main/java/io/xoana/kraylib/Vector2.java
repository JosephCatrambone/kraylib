/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public class Vector2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Vector2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Vector2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Vector2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    RaylibJNI.Vector2_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return RaylibJNI.Vector2_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    RaylibJNI.Vector2_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return RaylibJNI.Vector2_y_get(swigCPtr, this);
  }

  public Vector2() {
    this(RaylibJNI.new_Vector2(), true);
  }

}
