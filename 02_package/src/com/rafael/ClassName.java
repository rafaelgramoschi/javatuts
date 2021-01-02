package com.rafael; //tell java which this package is
public class ClassName {

	public static void staticAccessible(){
		System.out.println("This is a static method, no object creation required!");
	}

	public void printHello(){
		System.out.println("Hello! no return! only print! this is not static, so to access this method, you need to instantiate a object of this class.");
	}

}
