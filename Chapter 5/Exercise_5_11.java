// Zack Friedman 9/28/18

public class Exercise_5_11 {
	public static void main(String[] args) {
		int count = 0;
		int number = 100;
		
		while (number <= 200){
			
			if (number % 5 == 0 && number % 6 != 0) {
				System.out.print(number + " ");
				count = count + 1;
			}
				
			if (number % 6 == 0 && number % 5 != 0) {
				System.out.print(number + " ");
				count = count + 1;
			}
			number = number + 1;
			
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}		
	}
}