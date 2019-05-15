// Zack Friedman 4/24/19

import java.util.Scanner;
import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;

public class Exercise_12_3 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for(int i = 0; i <  numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100);
		} // for end
		System.out.println(Arrays.toString(numbers));
		System.out.println("\n");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an index of the array:");
		int index = input.nextInt();
		try {
			System.out.println(numbers[index]);
		} // try end
		catch (ArrayIndexOutOfBoundsException ex) {
		System.out.println("Out of Bounds.");			
		} // catch end
	} // main end
}