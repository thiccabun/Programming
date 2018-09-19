// Zack Friedman 9/17/18

class Exercise_1_13 {
	public static void main(String[] args) {
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;
		
		double detA = a * d - b * c;
		
		if (detA == 0) {
			System.out.println("The equation has no solution.");
		}
		else {
			double x = (e * d - b * f) / detA;
			double y = (a * f - e * c) / detA;
			System.out.println("x is " + x);
			System.out.println("y is " + y);
		}
	}
}