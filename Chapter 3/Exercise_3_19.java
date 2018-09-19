// Zack Friedman 9/17/18

import java.util.Scanner;

public class Exercise_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers: ");
		System.out.println("Enter side a: ");
		double a = input.nextDouble();
		System.out.println("Enter base b: ");
		double b = input.nextDouble();
		System.out.println("Enter side c: ");
		double c = input.nextDouble();

		double perimeter = a + b + c;
		
		if (a + b > c) {
			System.out.println("The perimeter of the triangle is " + perimeter);
		}
		else {
			System.out.println("Input invalid");
		}

	}
}