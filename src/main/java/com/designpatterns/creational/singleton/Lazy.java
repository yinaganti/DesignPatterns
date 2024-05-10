package com.designpatterns.creational.singleton;

public class Lazy {
	
	private static Lazy instance = null;
	
	private Lazy() {}
	
	public static synchronized Lazy getInstance() {
		if(instance == null) {
			instance = new Lazy(); //Object will create while call the getInstance() method
		}
		return instance;
	}
}
