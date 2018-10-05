/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public class Matrix {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Matrix(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Matrix obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_Matrix(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM0(float value) {
    RaylibJNI.Matrix_m0_set(swigCPtr, this, value);
  }

  public float getM0() {
    return RaylibJNI.Matrix_m0_get(swigCPtr, this);
  }

  public void setM4(float value) {
    RaylibJNI.Matrix_m4_set(swigCPtr, this, value);
  }

  public float getM4() {
    return RaylibJNI.Matrix_m4_get(swigCPtr, this);
  }

  public void setM8(float value) {
    RaylibJNI.Matrix_m8_set(swigCPtr, this, value);
  }

  public float getM8() {
    return RaylibJNI.Matrix_m8_get(swigCPtr, this);
  }

  public void setM12(float value) {
    RaylibJNI.Matrix_m12_set(swigCPtr, this, value);
  }

  public float getM12() {
    return RaylibJNI.Matrix_m12_get(swigCPtr, this);
  }

  public void setM1(float value) {
    RaylibJNI.Matrix_m1_set(swigCPtr, this, value);
  }

  public float getM1() {
    return RaylibJNI.Matrix_m1_get(swigCPtr, this);
  }

  public void setM5(float value) {
    RaylibJNI.Matrix_m5_set(swigCPtr, this, value);
  }

  public float getM5() {
    return RaylibJNI.Matrix_m5_get(swigCPtr, this);
  }

  public void setM9(float value) {
    RaylibJNI.Matrix_m9_set(swigCPtr, this, value);
  }

  public float getM9() {
    return RaylibJNI.Matrix_m9_get(swigCPtr, this);
  }

  public void setM13(float value) {
    RaylibJNI.Matrix_m13_set(swigCPtr, this, value);
  }

  public float getM13() {
    return RaylibJNI.Matrix_m13_get(swigCPtr, this);
  }

  public void setM2(float value) {
    RaylibJNI.Matrix_m2_set(swigCPtr, this, value);
  }

  public float getM2() {
    return RaylibJNI.Matrix_m2_get(swigCPtr, this);
  }

  public void setM6(float value) {
    RaylibJNI.Matrix_m6_set(swigCPtr, this, value);
  }

  public float getM6() {
    return RaylibJNI.Matrix_m6_get(swigCPtr, this);
  }

  public void setM10(float value) {
    RaylibJNI.Matrix_m10_set(swigCPtr, this, value);
  }

  public float getM10() {
    return RaylibJNI.Matrix_m10_get(swigCPtr, this);
  }

  public void setM14(float value) {
    RaylibJNI.Matrix_m14_set(swigCPtr, this, value);
  }

  public float getM14() {
    return RaylibJNI.Matrix_m14_get(swigCPtr, this);
  }

  public void setM3(float value) {
    RaylibJNI.Matrix_m3_set(swigCPtr, this, value);
  }

  public float getM3() {
    return RaylibJNI.Matrix_m3_get(swigCPtr, this);
  }

  public void setM7(float value) {
    RaylibJNI.Matrix_m7_set(swigCPtr, this, value);
  }

  public float getM7() {
    return RaylibJNI.Matrix_m7_get(swigCPtr, this);
  }

  public void setM11(float value) {
    RaylibJNI.Matrix_m11_set(swigCPtr, this, value);
  }

  public float getM11() {
    return RaylibJNI.Matrix_m11_get(swigCPtr, this);
  }

  public void setM15(float value) {
    RaylibJNI.Matrix_m15_set(swigCPtr, this, value);
  }

  public float getM15() {
    return RaylibJNI.Matrix_m15_get(swigCPtr, this);
  }

  public Matrix() {
    this(RaylibJNI.new_Matrix(), true);
  }

}
