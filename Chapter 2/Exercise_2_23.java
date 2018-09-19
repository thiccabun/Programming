/*
Author: Zack Friedman
Date: 9/12/18
Summary: Outputs cost of driving based on what user enters
*/

import java.util.Scanner;

public class Exercise_2_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter driving distance: ");
		double distance = input.nextDouble();
		
		System.out.println("Enter the miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.println("Enter the price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		System.out.println("The cost of driving is $" + (distance / milesPerGallon) * pricePerGallon);
	}
}