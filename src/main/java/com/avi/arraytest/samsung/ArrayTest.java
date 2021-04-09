package com.avi.arraytest.samsung;

public class ArrayTest {
	
	public static void main(String[] args) {
		String s = "ab";
		System.out.println("lenght: " +s.length());
		System.out.println("bytes: " +s.getBytes());
		System.out.println("char at: " +(int)s.charAt(0));
		System.out.println("char at: " +(int)s.charAt(1));
		System.out.println("hashcode: " +s.hashCode());
		System.out.println("hashcode man: " +(int)calculateHasCode(s));
		findUniqueChars(s);
	}
	public static boolean findUniqueChars(String s) {
		for(int i=0; i<s.length(); i++) {
			
		}
		return false;
	}
	
	public static double calculateHasCode(String s) {
		double code=0;
		for(int i=0; i<s.length(); i++) {
			code = code + s.charAt(i)*Math.pow(31, s.length() -(i+1));
		}
		return code;
	}

}



