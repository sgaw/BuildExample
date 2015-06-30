LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := math-jni
LOCAL_SRC_FILES := math-jni.c

include $(BUILD_SHARED_LIBRARY)
