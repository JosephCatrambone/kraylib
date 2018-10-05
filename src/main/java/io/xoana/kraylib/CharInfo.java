/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.xoana.kraylib;

public class CharInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CharInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CharInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        RaylibJNI.delete_CharInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setValue(int value) {
    RaylibJNI.CharInfo_value_set(swigCPtr, this, value);
  }

  public int getValue() {
    return RaylibJNI.CharInfo_value_get(swigCPtr, this);
  }

  public void setRec(Rectangle value) {
    RaylibJNI.CharInfo_rec_set(swigCPtr, this, Rectangle.getCPtr(value), value);
  }

  public Rectangle getRec() {
    long cPtr = RaylibJNI.CharInfo_rec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Rectangle(cPtr, false);
  }

  public void setOffsetX(int value) {
    RaylibJNI.CharInfo_offsetX_set(swigCPtr, this, value);
  }

  public int getOffsetX() {
    return RaylibJNI.CharInfo_offsetX_get(swigCPtr, this);
  }

  public void setOffsetY(int value) {
    RaylibJNI.CharInfo_offsetY_set(swigCPtr, this, value);
  }

  public int getOffsetY() {
    return RaylibJNI.CharInfo_offsetY_get(swigCPtr, this);
  }

  public void setAdvanceX(int value) {
    RaylibJNI.CharInfo_advanceX_set(swigCPtr, this, value);
  }

  public int getAdvanceX() {
    return RaylibJNI.CharInfo_advanceX_get(swigCPtr, this);
  }

  public void setData(SWIGTYPE_p_unsigned_char value) {
    RaylibJNI.CharInfo_data_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData() {
    long cPtr = RaylibJNI.CharInfo_data_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public CharInfo() {
    this(RaylibJNI.new_CharInfo(), true);
  }

}
