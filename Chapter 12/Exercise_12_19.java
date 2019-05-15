// Zack Friedman 5/14/19

import java.util.Scanner;

public class Exercise_12_19 {
	public static void main(String[] args) {
		int count = 0;
		String URLString = "http://cs.armstrong.edu/liang/Lincoln.txt";
		try {
			java.net.URL url = new java.net.URL(URLString);
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()) {
				if (Character.isLetter((input.next()).charAt(0))) {
					count ++;
				} // if end
			} // while end
			System.out.println("There are " + count + " words");
		} // try end
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} // catch end
		catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		} // catch end
	} // main end
}
