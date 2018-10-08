// Zack Friedman 9/28/18

import java.util.Scanner;

public class Exercise_5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 15: ");
		int pyramid = input.nextInt();
		
		if (pyramid < 1 ^ pyramid > 15){
			System.out.println("Invalid number");
		}
		else {
			for (int lines = 1; lines <= pyramid; lines++){
				for (int space = 1; space <= pyramid - lines; space ++){
					System.out.print ("   ");
				}
				for(int leftN = lines; leftN > 0; leftN--){
					System.out.print((leftN < 9) ? "  " + leftN : " " + leftN);
				}
				for (int rightN = 2; rightN <= lines; rightN++){
					System.out.print((rightN < 9) ? "  " + rightN : " " + rightN);
				}
				System.out.println();
			}
		}
	}
}