package com.bank.main;

public class SplitName {

	public static void main(String[] args) {
		String s="Bhavika Ramesh Koli";
		String[] middle=s.split(" ");
		if (middle.length >= 3) {
            System.out.println(middle[1]); // prints "Ramesh"
        } else {
            System.out.println("Middle name not found");
        }

	}

}
