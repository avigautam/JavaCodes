package com.avi.test;

import java.util.Arrays;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		final HashMap<Integer, String> hm = new HashMap<Integer, String>();
		HashMap<Integer, String> nhm = new HashMap<Integer, String>();
		hm.put(1, "S");
		hm.put(2, "H");
		
		nhm.put(1, "Avinash");
		nhm.put(2, "Gautam");
		
		hm.put(3, "Avinash");
		hm.put(4, "Gautam");
		
		//hm = nhm;
		//int an =5 ;
		
		
		System.out.println(hm.size());
		int a[][] = {{2,1,6},{1,3,1}};
		sortArray(a);
		
		System.out.println(a);
	}
	
	public static void sortArray(int a[][]) {
		Arrays.sort(a, (e1,e2)->Integer.compare(e1[0], e2[0]));
		
		System.out.println(a);
	}

}
