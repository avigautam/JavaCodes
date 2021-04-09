package com.avi.codejam2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution_ForegoneProblem {
	public static BigInteger firstNumber = new BigInteger("0") ;
	public static BigInteger secondNumber = new BigInteger("0") ;
	public static BigInteger multiplier = new BigInteger("1") ;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(new BufferedReader( new InputStreamReader(System.in)))){
			int i=0;
			while(sc.hasNext()) {
				BigInteger numberContains4 = new BigInteger(sc.nextLine());
				System.out.println("Case #"+(++i)+ ": " + breakNumber(numberContains4) + " " + secondNumber);
				firstNumber = new BigInteger("0");
				secondNumber = new BigInteger("0") ;
				multiplier = new BigInteger("1") ;
			}
			
		}	
	}
	
	public static BigInteger breakNumber(BigInteger number) {
		BigInteger twoMultiplier = new BigInteger("2");
		while(! number.remainder(new BigInteger("10")).equals( new BigInteger("0")) || ! number.equals(new BigInteger("0"))) {
			if(number.remainder(new BigInteger("10")).equals( new BigInteger("4"))) {
				firstNumber = firstNumber.add(twoMultiplier.multiply(multiplier));
				secondNumber = secondNumber.add(twoMultiplier.multiply(multiplier));
			}else {
				secondNumber = secondNumber.add(number.remainder(new BigInteger("10")).multiply(multiplier));
			}
			multiplier = multiplier.multiply(new BigInteger("10"));
			number = number.divide(new BigInteger("10"));
		}
		return firstNumber;
	

	}
}
