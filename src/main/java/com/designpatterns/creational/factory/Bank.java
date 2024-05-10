package com.designpatterns.creational.factory;

public interface Bank {
	default float rateOfIntrest() {
		return 15f;
	}
}
