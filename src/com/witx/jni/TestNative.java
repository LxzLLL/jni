package com.witx.jni;

public class TestNative {
	
	//使用JAVAH命令生成包含native方法定义的C/C++头文件
	//该命令需要使用JDK/bin目录下的javah.exe
	//注意：在windows下使用javah.exe时，会有编码问题，cmd为jbk，而此工程编码为UTF-8
	public native void sayHello();
	
	
	public static void main(String[] args) {
		//加载dll文件
		System.loadLibrary("NativeCode");
		TestNative tNative = new TestNative();
		tNative.sayHello();
	}
}
