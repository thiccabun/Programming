// Zack Friedman 10/5/18

public class Exercise_5_33 {
	public static void main(String[] args) {
		
		for (int numberP = 1; numberP <= 10000; numberP++){
			int sum = 0;
		
			for (int i = 1; i <= numberP / 2; i++) {
				if (numberP % i == 0) {
					sum += i;
				}
			}
			if (sum == numberP) {
				System.out.println(numberP);
			}
		}
	}
}