// Zack Friedman 12/18/18

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		int numberOfDistinctValues = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++) {
			int value = input.nextInt();
			
			boolean isInTheArray = false;
			for (int j = 0; j < numberOfDistinctValues; j++) {
				if (value == numbers[j]) {
					isInTheArray = true;
				} // if end
			} // for end
			if (!isInTheArray) {
				numbers[numberOfDistinctValues] = value;
				numberOfDistinctValues++;
			} // if end
		} // for end
		System.out.println("The number of distinct numbers is " + numberOfDistinctValues);
		System.out.println("List without duplicates is: ");
		for (int i = 0; i < numbers.length; i++) {
			if (!numbers.equals(0)) {
				array.add(numbers[i]);
				array.remove(Integer.valueOf(0));
			} // if end
		} // for end
		System.out.print(array + " ");
	} // main end
}