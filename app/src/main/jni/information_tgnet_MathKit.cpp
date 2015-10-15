//
// Created by zhonghanwen on 2015/10/15.
#include <information_tgnet_MathKit.h>
#include <jni.h>

JNIEXPORT jint JNICALL Java_information_tgnet_MathKit_square
        (JNIEnv *env, jclass cls, jint num)
{
    return num*num;
}
