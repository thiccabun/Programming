// Zack Friedman 11/15/18

import java.util.Scanner;

public class Exercise_8_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final int N = 3;
		final int M = 3;
		
		System.out.print("Enter matrix #1: ");
		double[][] matrix1 = new double[N][M];
		
		for (int row = 0; row < matrix1.length; row++) {
			for (int col = 0; col < matrix1[row].length; col++) {
				matrix1[row][col] = input.nextDouble();
			} // end of for loop
		} // end of for loop
		
		System.out.print("Enter matrix #2: ");
		double[][] matrix2 = new double[N][M];
		
		for (int row = 0; row < matrix2.length; row++) {
			for (int col = 0; col < matrix2[row].length; col++) {
				matrix2[row][col] = input.nextDouble();
			} // end of for loop
		} // end of for loop
		double[][] resultMatrix = addMatrix(matrix1, matrix2);
		System.out.println("The sum of the matrices is ");
		printResult(resultMatrix);
	} // end of main method
	public static double[][] addMatrix(double[][] m1, double[][] m2) {
		double[][] result = new double[m1.length][m1[0].length];
		for (int row = 0; row < result.length; row++) {
			for (int col = 0; col < result[row].length; col++) {
				result[row][col] = m1[row][col] + m2[row][col];
			} // end of for loop
		} // end of for loop
		return result;
	} // end of addMatrix method
	public static void printResult(double[][] m1) {
		for (int row = 0; row < m1.length; row++) {
			for (int col = 0; col < m1[row].length; col++) {
				System.out.print(m1[row][col] + " ");
			} // end of for loop
			System.out.println();
		} // end of for loop
	} // end of printResult method
}