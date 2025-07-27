package com.bank.main;

public class Unique1 {
	public static void main(String[] args) {
		
	int a[]= {2,3,4,2,5};
	
	for(int i=0;i<a.length;i++) 
	{
		boolean NoDuplicate1=true;
		
		for (int j=0;j<a.length;j++) 
		{
			if(i != j && a[i] == a[j]) 
			{
				NoDuplicate1=false;
				break;
			}
		}
	if(NoDuplicate1) {
	System.out.println(a[i]);
	}
}
	
}

}
