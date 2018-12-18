// Zack Friedman 11/20/18

import java.util.Scanner;

public class Exercise_8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] array = {
		{"Oregon", "Salem"},
		{"Utah", "Salt Lake City"},
		{"California", "Sacramento"},
		{"Rhode Island", "Providence"},
		{"South Dakota", "Sioux Falls"},
		{"New Hampshire", "Concord"},
		{"Washington", "Olympia"},
		{"West Virginia", "Charleston"},
		{"Maryland", "Annapolis"},
		{"Michigan", "Lansing"} 
		}; // array end

		int score = 0;
		int counter = 0;
		
		while (counter < 10){
			System.out.println("Enter " + array[counter][0] + "'s capital:");
			String answer = input.nextLine();

			if (answer.equalsIgnoreCase(array[counter][1])) {
				System.out.println("Correct.");
				score++;
			} // if end
			else {
				System.out.println("Incorrect");
			} // else end
			counter++;
			System.out.println("Score = " + score + "/10");

		} // while end
	} // main end
}