// Zack Friedman 10/11/18

import java.util.Scanner;

public class Exercise_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
	
		printMatrix(number);	
		
	} //main method end
	public static void printMatrix(int number) {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print((int)(Math.random() * 2) + " ");
			} //for loop column end
			System.out.println();
		} //for loop row end
	} //matrix end
}