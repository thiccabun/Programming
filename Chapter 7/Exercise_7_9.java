// Zack Friedman 10/30/18

import java.util.Scanner;

public class Exercise_7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		} // end of for loop
		System.out.println("The minimum number is: " + min(numbers));
	} // end of main method
	public static double min(double[] list) {
		double minDouble = list[0];
		
		for (int i = 1; i < list.length; i++) {
			if (minDouble > list[i]) {
				minDouble = list[i];
			} // end of if statement
		} // end of for loop
		return minDouble;
	} // end of min method
}