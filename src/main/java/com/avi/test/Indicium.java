package com.avi.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Indicium {

	/*
	 * private static HashSet<String> ceckr= null; private static HashSet<String>
	 * ceckc= null;
	 */
	public static void main(String[] args) {
		String[] rowRead;
		String[][] charArr;
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			int N = in.nextInt();
			

			System.out.println("Case #" + i + ": " + isContainDuplicatesInRow(charArr, N));
		}
	}

	public static void createLatinSquare(int size, int trace) {
		int[][] a = new int[size][size];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				for (int cnt = 1; cnt <= size; cnt++) {
					if(!isContainDuplicates(a, size, c, trace)) {
						a[r][c] = cnt;
						break;
					}
				}
				
				
				// System.out.println("lie; " +rowRead[c]);
			}

		}

	}

	public static boolean isContainDuplicates(int a[][], int N, int numToIn, int trace) {
		String out = "";
		int rowDupC = 0, colDupC = 0, sum = 0;
		for (int i = 0; i < N; i++) {
			for (int row = 0; row < N; row++) {
				if (a[row][i] == numToIn) {
					return true;
				}
			}

			for (int col = 0; col < N; col++) {
				if (a[i][col] == numToIn) {
					return true;
				}
			}

			sum += a[i][i];

		}
		if (sum > trace)
			return true;
		return false;
	}

}
