/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pj_stun_nat_detect_result {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pj_stun_nat_detect_result(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pj_stun_nat_detect_result obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pj_stun_nat_detect_result(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setStatus(int value) {
    pjsuaJNI.pj_stun_nat_detect_result_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsuaJNI.pj_stun_nat_detect_result_status_get(swigCPtr, this);
  }

  public void setStatus_text(String value) {
    pjsuaJNI.pj_stun_nat_detect_result_status_text_set(swigCPtr, this, value);
  }

  public String getStatus_text() {
    return pjsuaJNI.pj_stun_nat_detect_result_status_text_get(swigCPtr, this);
  }

  public void setNat_type(pj_stun_nat_type value) {
    pjsuaJNI.pj_stun_nat_detect_result_nat_type_set(swigCPtr, this, value.swigValue());
  }

  public pj_stun_nat_type getNat_type() {
    return pj_stun_nat_type.swigToEnum(pjsuaJNI.pj_stun_nat_detect_result_nat_type_get(swigCPtr, this));
  }

  public void setNat_type_name(String value) {
    pjsuaJNI.pj_stun_nat_detect_result_nat_type_name_set(swigCPtr, this, value);
  }

  public String getNat_type_name() {
    return pjsuaJNI.pj_stun_nat_detect_result_nat_type_name_get(swigCPtr, this);
  }

  public pj_stun_nat_detect_result() {
    this(pjsuaJNI.new_pj_stun_nat_detect_result(), true);
  }

}
