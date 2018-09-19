/*
Author: Zack Friedman
Date: 9/11/18
Summary: Saves "money" for you.
*/

import java.util.Scanner;

public class Exercise_2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much money would you like to deposit to the savings account monthly? ");
		double monthlyDeposit = input.nextDouble();
		
		double currentValue = monthlyDeposit;
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		System.out.println("After one month, account value is " + currentValue);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		System.out.println("After two months, account value is " + currentValue);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		System.out.println("After three months, account value is " + currentValue);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		
		currentValue = (currentValue + monthlyDeposit) * (1 + 0.05 / 12);
		
		System.out.println("After sixth months, the account value is " + currentValue);
	}
}