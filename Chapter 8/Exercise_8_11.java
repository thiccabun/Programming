// Zack Friedman 11/16/18

import java.util.Scanner;

public class Exercise_8_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 0 and 511: ");
		short number = input.nextShort();
		
		char[] binaryChars = toBinaryChars(number);
		
		for (int i = 1; i <= binaryChars.length; i++) {
			System.out.print(((binaryChars[i - 1] == '0')?'H':'T') + " ");
			if (i % 3 == 0) {
				System.out.println();
			} // end of if statement
		} // end of for loop
	} // end of main method
	public static char[] toBinaryChars(short number) {
		char[] result = new char[9];
		int i = result.length - 1;
		while (number != 0) {
			if (number % 2 == 0) {
				result[i--] = '0';
			} // end of if statement
			else {
				result[i--] = '1';
			} // end of else statement
			number /= 2;
		} // end of while loop
		for (int k = i; k >= 0 ; k--) {
			result[k] = '0';
		} // end of for loop
		return result;
	} // end of toBinaryChars method
}