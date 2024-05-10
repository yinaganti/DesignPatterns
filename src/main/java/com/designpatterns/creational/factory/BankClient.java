package com.designpatterns.creational.factory;

public class BankClient {
	
	public static void main(String args[]) {
		Bank icici = BankFactory.getBank("ICICI");
		System.out.println("ICICI ROI = "+icici.rateOfIntrest());
		Bank sbi = BankFactory.getBank("SBI");
		System.out.println("SBI ROI = "+sbi.rateOfIntrest());
		Bank hdfc = BankFactory.getBank("HDFC");
		System.out.println("Hdfc ROI = "+hdfc.rateOfIntrest());
		Bank union = BankFactory.getBank("union");
		System.out.println("union ROI = "+ union.rateOfIntrest());
	}

}
