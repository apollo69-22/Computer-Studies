#include "include\jni.h"
#include "beepJNI.h"
#include <stdio.h>
#include <windows.h>

JNIEXPORT void JNICALL Java_beepJNI_beep (JNIEnv *env, jobject obj)
{
	Beep(800, 500);
	return;
}
