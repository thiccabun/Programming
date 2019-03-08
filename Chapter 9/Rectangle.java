// Zack Friedman 01/25/19
/* UML Diagram:
-----------------------
	   Rectangle
-----------------------
+width: double
+height: double
-----------------------
+Rectangle()
+Rectangle(width: double, height: double)
+getArea(): double
+getPerimeter: double
-----------------------
*/

public class Rectangle {
	double width = 1;
	double height = 1;
	
	public Rectangle() {
		
	} // rectangle end
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	} // rectangle end
	public double getArea() {
		return (this.width * this.height);
	} // getArea end
	public double getPerimeter() {
		return (2 * (this.width + this.height));
	} // getPerimeter end
}