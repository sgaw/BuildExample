#include <string.h>
#include <jni.h>

/* Add two numbers, return result */
jint Java_com_playground_sgaw_buildexample_MainActivityFragment_add(
    JNIEnv* env,
    jobject thiz,
    jint ja,
    jint jb) {
    int a = ja;
    int b = jb;
    int result = a + b;
    return result;
}