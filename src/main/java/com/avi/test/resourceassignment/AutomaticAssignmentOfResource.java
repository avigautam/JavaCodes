package com.avi.test.resourceassignment;

import java.util.Arrays;

public class AutomaticAssignmentOfResource {
	
	public static void main(String[] args) {
		int a[] = {1,2,8,4,9,12,6,4};
		int number = 9;
		System.out.println("Initial Array- ");
		System.out.println("lenght: " + a.length);
		printArray(a);
		findSum(a, number);
		
	}
	
	public static boolean findSum(int a[], int number) {
		Arrays.sort(a);
		System.out.println("Sorted Array- ");
		printArray(a);
		
		if(a.length <2) return false; 	
		if(a[0]+ a[a.length-1] < number) return false;
		if(a[0]+ a[a.length-1] == number) return true;
		
		return false;
	}
	
/*	public static int lessIndex(int a[], int index, int sum) {
		if(a[index]<sum) return index;
		return 0;
		
	}*/
	public static void printArray(int a[]) {
		Arrays.stream(a).forEach(s -> System.out.print(s + ","));
		System.out.println();
	}

}
