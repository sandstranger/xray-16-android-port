LOCAL_PATH := $(call my-dir)
HERE_PATH := $(LOCAL_PATH)

LOCAL_PATH := $(HERE_PATH)
include $(CLEAR_VARS)
LOCAL_MODULE := linkerhook
LOCAL_SRC_FILES := driver_helper/hook.c
LOCAL_LDFLAGS := -z global -llog
include $(BUILD_SHARED_LIBRARY)

LOCAL_PATH := $(HERE_PATH)
include $(CLEAR_VARS)
LOCAL_MODULE := nsbypass
LOCAL_SRC_FILES := driver_helper/nsbypass.c
LOCAL_LDFLAGS := -z global -llog
include $(BUILD_SHARED_LIBRARY)
