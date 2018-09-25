// Zack Friedman 9/21/18

import java.util.Scanner;

public class Exercise_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter the first three letters from a month: ");
		String month = input.next();
		
		if (!month.equals("Jan") && !month.equals("Feb") && !month.equals("Mar") && !month.equals("Apr") && !month.equals("May") && !month.equals("Jun") && !month.equals("Jul") && !month.equals("Aug") && !month.equals("Sep") && !month.equals("Oct") && !month.equals("Nov") && !month.equals("Dec")) {
			System.out.println("Please enter a valid month");
		}
		else {
			
			if (month.equals("Feb")) {
				if (year % 4 == 0) {
					if (year % 100 == 0) {
						if (year % 400 == 0) {
							System.out.println(month + " " + year + " has 29 days");
						}
						else {
							System.out.println(month + " " + year + " has 28 days");
						}
					}
					else {
						System.out.println(month + " " + year + " has 29 days");
					}
				}
				else {
					System.out.println(month + " " + year + " has 28 days");
				}
			}
			else {

				if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
					System.out.println(month + " " + year + " has 31 days");
				}
				else {
					System.out.println(month + " " + year + " has 30 days");
				}
			}
		}
	}
}