// Zack Friedman 9/13/18

import java.util.Scanner;

public class Exercise_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 6 numbers: ");
		System.out.println("Enter a: ");
		double a = input.nextDouble();
		System.out.println("Enter b: ");
		double b = input.nextDouble();
		System.out.println("Enter c: ");
		double c = input.nextDouble();
		System.out.println("Enter d: ");
		double d = input.nextDouble();
		System.out.println("Enter e: ");
		double e = input.nextDouble();
		System.out.println("Enter f: ");
		double f = input.nextDouble();
		
		double detA = a * d - b * c;
		
		if (detA == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			double x = (e * d - b * f) / detA;
			double y = (a * f - e * c) / detA;
			System.out.println("x is " + x + " and y is" + y);
		}
	}
}