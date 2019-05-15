// Zack Friedman 3/28/19

import java.util.Scanner;

public class Exercise_11_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Triangle");
		System.out.println("Enter side 1: ");
		double s1 = input.nextDouble();
		System.out.println("Enter side 2: ");
		double s2 = input.nextDouble();
		System.out.println("Enter side 3: ");
		double s3 = input.nextDouble();
		System.out.println("Enter the triangle's color:");
		String color = input.next();
		System.out.println("Is the triangle filled? True/False:");
		boolean filled = input.nextBoolean();
		System.out.println("");
		
		Triangle t1 = new Triangle(s1, s2, s3, color, filled);
		System.out.println("\tArea: " + t1.getArea());
		System.out.println("\tPerimeter: " + t1.getPerimeter());
		System.out.println("\tColor: " + t1.getColor());
		System.out.println("\tFilled?: " + t1.isFilled());
	} // main end
}