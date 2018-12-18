// Zack Friedman 11/1/18

import java.util.Scanner;

public class Exercise_7_15 {
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers separated by a space: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		} // end of for loop
		int[] result2 = eliminateDuplicates(numbers);
		
		System.out.println("List without duplicates is: " + result2.length);
		for (int i = 0; i < result2.length; i++) {
			System.out.print(result2[i] + " ");
		} // end of for loop
	} // end of main method
	public static int[] eliminateDuplicates(int[] list) {
		int[] temp = new int[list.length];
		int size = 0;
		 for (int i = 0; i < list.length; i++) {
			boolean isInArray = false;
			for (int j = 0; j < i && !isInArray; j++) {
				if (list [j] == list[i]) {
					isInArray = true;
				} // end of if statement
			} // end of for loop
			if (!isInArray) {
				temp[size] = list[i];
				size++;
			} // end of if statement
		} // end of for loop
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = temp[i];
		} // end of for loop
		return result;
	} // end of eliminateDuplicates method
}