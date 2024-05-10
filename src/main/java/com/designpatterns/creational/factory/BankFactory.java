package com.designpatterns.creational.factory;

public class BankFactory {

	public static Bank getBank(String type) {
		switch (type) {
		case "SBI":
			return new SBI();
		case "ICICI":
			return new ICICI();
		case "HDFC":
			return new Hdfc();
		default:
			return new DefaultROI();
		}
	}
}
