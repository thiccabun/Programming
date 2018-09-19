/* 
Author: Zack Friedman
Date: 9/10/18
Summary: Converts Celsius to Fahrenheit
*/

import java.util.Scanner;

public class Exercise_2_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
			
		double fahrenheit = (9.0 / 5) * celsius + 32;
			
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
	}
}