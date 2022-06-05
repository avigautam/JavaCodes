package com.avi.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
		//Array.get(sortArray(a));
		//Collectors;
		int [] arr = {1, 2, 3,4};
		System.out.println("Sum: "+Arrays.stream(arr).sum());
		//List list = new ArrayList<>();
		System.out.println();
		System.err.println();

		for (int i = 0; i < 10; i++) {

		}

		String abc = "animals";
		System.out.println(abc.replace("a","A"));
		//abc.substring(3,8);
		//abc.substring(3,2);
		System.out.println(a);
	}

	public static void sortArray(int a[][]) {
		System.out.println(a);
		Arrays.sort(a, (e1,e2)->Integer.compare(e1[0], e2[0]));

	}

}
