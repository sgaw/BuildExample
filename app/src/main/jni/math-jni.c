#include <string.h>
#include <jni.h>

jstring Java_com_playground_sgaw_buildexample_MainActivityFragment_stringFromJNI( JNIEnv* env, jobject thiz) {
    return (*env)->NewStringUTF(env, "MyMath string here");
}