// Zack Friedman 5/13/19

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_11_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Enter 10 numbers:");
		
		for (int i = 0; i < 10; i++) {
			numbers.add(input.nextInt());
		} // for end
		
		removeDuplicate(numbers);
		
		System.out.println("Distinct numbers:");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		} // for end
	} // main end
	public static void removeDuplicate(ArrayList<Integer> numbers) {
		for (int i = 0; i < numbers.size() - 1; i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if (numbers.get(i) == numbers.get(j)) {
					numbers.remove(j);
				} // if end
			} // for end
		} // for end
	} // removeDuplicate end
}