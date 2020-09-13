#include <jni.h>
#include "NativeDemo.h"
#include <stdio.h>
JNIEXPORT void JNICALL Java_com_max_1hayday_javacore_chapter13_NativeDemo_test(JNIEnv *env, jobhect obj)
{
jclass cls;
jfieldID fid;
jint i;
printf("Start native method. \n");
cls = (*env) ->GetObjectClass(env,obj);
fid = (*env) ->GetFieldID(env,cls,"i","I");

if(fid == 0){
printf("Can not get id.\n");
return;
}
i = (*env) ->GetIntField(env,obj,fid);
printf("i = %d\n", i);
(*env)->SetIntField(env,obj,fid,2*i);
printf("Finish native method.\n");
}