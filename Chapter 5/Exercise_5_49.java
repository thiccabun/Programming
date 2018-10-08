// Zack Friedman 10/1/18

import java.util.Scanner;

public class Exercise_5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type something: ");
		String string = input.next();
		
		int consonant = 0;
		int vowel = 0;
		
		for (int i = 0; i < string.length(); i++) {
			char temp = Character.toUpperCase(string.charAt(i));
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
				vowel++;
			}
			else if  (Character.isLetter(temp)) {
				consonant++;
			}
		}
		System.out.println(string + " contains " + consonant + " consonants & " + vowel + " vowels.");
	}
}