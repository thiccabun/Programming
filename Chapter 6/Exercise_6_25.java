// Zack Friedman 10/17/18

import java.util.Scanner;

class Exercise_6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter time in milliseconds: ");
		int milli = input.nextInt();
		
		System.out.println(convertMillis(milli));
		
	} // end of main method
	public static String convertMillis(long millis) {
		int hours = 3600000;
		int ht = (int)(millis / hours);
		
		int minutes = 60000;
		millis -= ht * hours;
		int mt = (int)(millis / minutes);
		
		int seconds = 1000;
		millis -= mt * minutes;
		int st = (int)(millis / seconds);
		
		String time = ht + ":" + mt + ":" + st;
		return time;
		
	} // end of string method
}