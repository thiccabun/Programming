// Zack Friedman 9/17/18

import java.util.Scanner;

public class Exercise_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers: ");
		System.out.print("Enter number x: ");
		double x = input.nextDouble();
		System.out.print("Enter number y: ");
		double y = input.nextDouble();

		if (x >= -5 && x <= 5 && y >= -2.5 && y <= 2.5) {
			System.out.println("Point " + x + ", " + y + " is inside the rectangle");
		}
		else {
			System.out.println("Point " + x + ", " + y + " is outside the rectangle");
		}
	}
}