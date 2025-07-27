package com.bank.main;

import java.util.Arrays;

public class NoDuplicate {

	public static void main(String[] args) {
		int a[]= {2,3,4,2,5};
		
		for (int i=0;i<a.length;i++) {
			boolean Unique=true;
				for(int j=0;j<a.length;j++) {
				if(i!=j && a[i] == a[j]) {
					Unique=false;
					break;
				}
			}
			if(Unique) {
				System.out.println(a[i]);
			}
		}
		

	}

}
