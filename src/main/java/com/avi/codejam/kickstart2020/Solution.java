package com.avi.codejam.kickstart2020;

import java.util.*;
import java.util.stream.Stream;
import java.io.*;

public class Solution {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {
			int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
			in.nextLine();
			for (int i = 1; i <= t; ++i) {
				String[] noOfHourseAndTotalAmount = in.nextLine().split(" ");
				int[] arrayToHoldPrice = new int[Integer.parseInt(noOfHourseAndTotalAmount[0])];
				int totalAmout = Integer.parseInt(noOfHourseAndTotalAmount[1]);
				String[] priceList = in.nextLine().split(" ");
				
				int priceListInt[] = Stream.of(priceList).mapToInt(Integer::parseInt).toArray();
				printArray(priceListInt);
				Arrays.sort(priceListInt);
				
				printArray(priceListInt);
				//System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
			}
		}

	}
	
	public static void printArray(int[] priceList) {
		Arrays.stream(priceList).forEach(System.out::println);
		//Stream.of(priceList).forEach(System.out::println);
		
	}
}