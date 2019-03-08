// Zack Friedman 3/5/19

public class Exercise_9_3 {
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date(10000);
		
		System.out.println("Date");
		
		date.setTime(10000);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(100000);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(1000000);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(10000000);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(100000000);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(1000000000);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(10000000000L);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());

		date.setTime(100000000000L);
		System.out.print("\n");
		System.out.println(date.getTime());
		System.out.println(date.toString());
	} // main end
}