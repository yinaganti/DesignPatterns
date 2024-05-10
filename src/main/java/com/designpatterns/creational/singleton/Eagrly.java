package com.designpatterns.creational.singleton;

public class Eagrly {
	
	private static Eagrly instance = new Eagrly();//object will create while loading a class
	
	private Eagrly() {}
	
	public static synchronized Eagrly getInstance() {
		return instance;
	}
}
