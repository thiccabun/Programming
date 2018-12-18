// Zack Friedman 12/18/18

import java.util.Scanner;

public class Exercise_7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int numberOfDistinctValues = 0;
		
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++) {
			int value = input.nextInt();
			
			boolean isInTheArray = false;
			for (int j = 0; j < numberOfDistinctValues; j++) {
				if (value == numbers[j]) {
					isInTheArray = true;
				} // end of if statement
			} // end of for loop
			if (!isInTheArray) {
				numbers[numberOfDistinctValues] = value;
				numberOfDistinctValues++;
			} // end of if statement
		} // end of for loop
		System.out.println("The number of distinct numbers is " + numberOfDistinctValues);
		System.out.println("List without duplicates is: ");
		for (int i = 0; i < numbers.length; i++) {
			if (!numbers.equals(0)) {
			System.out.print(numbers[i] + " ");
			} // end of if statement
		} // end of for loop
	} // end of main method
}