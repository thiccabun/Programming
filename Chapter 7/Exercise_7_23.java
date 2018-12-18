// Zack Friedman 11/5/18

public class Exercise_7_23 {
	public static void main(String[] args) {
		
		boolean lockers[] = new boolean[100];
		
		for (int s = 1; s <= 100; s++) {
			for (int l = s - 1; l < 100; l += s) {
				lockers[l] = !lockers[l];
			} // end of for loop
		} // end of for loop
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == true) {
				System.out.print(i + 1 + " ");
			} // end of if statement
		} // end of for loop
	} // end of main method
}