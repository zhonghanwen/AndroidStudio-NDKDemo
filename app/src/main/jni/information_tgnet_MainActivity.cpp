//
// Created by zhonghanwen on 2015/10/15.
//

#include <information_tgnet_MainActivity.h>
#include <jni.h>

JNIEXPORT jdouble JNICALL Java_information_tgnet_MainActivity_addResult
        (JNIEnv * env, jclass jclass1, jdouble num){
    return num + num;
}