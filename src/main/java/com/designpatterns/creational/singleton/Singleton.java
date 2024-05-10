package com.designpatterns.creational.singleton;

public class Singleton {

	public static void main(String[] args) {
		Lazy obj1 = Lazy.getInstance();
		Lazy obj2 = Lazy.getInstance();
		System.out.println(obj1.hashCode()==obj2.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
