package com.bank.main;

public class RemoveWhiteSpacing {

	public static void main(String[] args) {
		String name="Bhavika is an   Automation Tester   K";
		String result = name.trim().replaceAll("\\s+", " ");
		System.out.println(result); // Output: "Bhavika is an Automation Tester"
		

	}

}
