// Zack Friedman 10/12/18

import java.util.Scanner;

public class Exercise_6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		
		System.out.println("The formatted number is " + format(number, width));
		
	} // end of main method
	public static String format(int number, int width) {
		String result = number + " ";
		
		for (int i = 0; i < width - len(number); i++) {
			result = "0" + result;
		} // end of for loop
		return result;

	} // end of format method
	public static int len(int number) {
		int size = 0;
		while (number > 0) {
			size += 1;
			number = number / 10;
			
		} // end of while loop
		return size;
	} // end of len method
}