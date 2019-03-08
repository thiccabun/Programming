// Zack Friedman 3/8/19

/* UML Diagram:
------------------------
	 RegularPolygon
------------------------
-n: int
-side: double
-x: double
-y: double
------------------------
+getPerimeter()
+getArea()
------------------------
*/


public class RegularPolygon {
	private int n = 3;
	private double s = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
		
	} // regularpolygon end
	public RegularPolygon(int n, double s) {
		this.n = n;
		this.s = s;
	} // regularpolygon end
	public RegularPolygon(int n, double s, double x, double y) {
		this.n = n;
		this.s = s;
		this.x = x;
		this.y = y;
	} // regularpolygon end
	public double getPerimeter() {
		return this.n + this.s;
	} // getperimeter end
	public double getArea() {
		return ((n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n)));
	} // getarea end
}