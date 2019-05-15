// Zack Friedman 3/28/19

/*
-----------------------------------------------------
					  Triangle
-----------------------------------------------------
- side1: double
- side2: double
- side3: double
-----------------------------------------------------
+ Triangle()
+ Triangle(double side1, double side2, double side3)
+ getArea()
+ getPerimeter()
+ toString(): String
-----------------------------------------------------
*/

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {
		super();
	} // Triangle end
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	} // Triangle end
	public Triangle(double side1, double side2, double side3, String color, boolean fill) {
		super(color, fill);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	} // Triangle end
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		return (Math.sqrt(s*(s - this.side1)*(s - this.side2)*(s - this.side3)));
	} // getArea end
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	} // getPerimeter end
	public String toString() {
		return "Triangle:\n\tSide 1: " + this.side1 + "\n\tSide 2: " + this.side2 + "\n\tSide 3: " + this.side3 + "\n\tArea: " + this.getArea() + "\n\tPerimeter: " + this.getPerimeter() + "\n" + super.toString();
	} // toString end
}