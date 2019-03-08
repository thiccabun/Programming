// Zack Friedman 3/8/19

public class Exercise_9_9 {
	public static void main(String[] args) {
		RegularPolygon rp1 = new RegularPolygon();
		RegularPolygon rp2 = new RegularPolygon(6, 4);
		RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Regular Polygon 1:");
		System.out.println("\tArea: " + rp1.getArea());
		System.out.println("\tPerimeter: " + rp1.getPerimeter());
		System.out.println("\n");
		
		System.out.println("Regular Polygon 2:");
		System.out.println("\tArea: " + rp2.getArea());
		System.out.println("\tPerimeter: " + rp2.getPerimeter());
		System.out.println("\n");
		
		System.out.println("Regular Polygon 3:");
		System.out.println("\tArea: " + rp3.getArea());
		System.out.println("\tPerimeter: " + rp3.getPerimeter());
	}
}