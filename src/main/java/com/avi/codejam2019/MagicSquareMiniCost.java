package com.avi.codejam2019;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MagicSquareMiniCost {

	// Complete the formingMagicSquare function below.
	static int formingMagicSquare(int[][] s) {
		return 1;
	}

	

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new FileReader("../JavaCodes/src/main/java/MagicSquareMiniCostInput.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("MagicSquareMiniCostOutput.txt"));

		int[][] s = new int[3][3];

		for (int i = 0; i < 3; i++) {
			String[] sRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 3; j++) {
				int sItem = Integer.parseInt(sRowItems[j]);
				s[i][j] = sItem;
			}
			
			//printArray(s);
		}
		System.out.println(Arrays.deepToString(s));

		int result = formingMagicSquare(s);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
	
	/*
	 * public static void printArray(int [][] a) { Stream.of(a) .flatMap(Stream::of)
	 * .forEach(System.out::println); }
	 */

}
