package com.designpatterns.creational.singleton;

public class Example1 {
	
	private static Example1 instance = null;
	
	private Example1() {}
	
	public static synchronized Example1 getInstance() {
		if(instance == null) {
			return instance = new Example1();
		}
		return instance;
	}

}
