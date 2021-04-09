package com.avi.codejam2019;

import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.io.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		//int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		//System.out.println("int t:" + t);
		
		//for (int i = 1; i <= t; ++i) {
			System.out.println("Enter a: ");
			int a = in.nextInt();
			System.out.println("Enter b: ");
			int b = in.nextInt();
			System.out.println("Enter n: ");
			int n = in.nextInt();
			solve(in, a, b, n);
		//}
	}
	public static void solve(Scanner sc, int a, int b, int n) {
		int m = (a+b)/2;
		System.out.println("System Guess: "+ m);
		sc.nextLine();// this is to move cursor on next line1
		System.out.println("Enter response: ");
		String res = sc.nextLine();
		if((n == a) || (n== b)) {
			System.out.println("found a: "+a +" b:"+ b);
			return;
		}
		if(n == m) {
			System.out.println("m :" + m);
			return;
		}else if(res.equalsIgnoreCase("bg")) {
			solve(sc, a, m, n);
		}else if(res.equalsIgnoreCase("sm")) {
			solve(sc, m, b, n);
		}
			
	}
}