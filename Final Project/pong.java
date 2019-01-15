// receives ping, run second

import java.util.Timer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class pong {
	public static void main(String[] args) throws UnknownHostException {
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		String stop = "	not yet implemented";
		
		System.out.println(new java.util.Date());
		System.out.println("What OS are you on? Choose 'Linux', 'macOS', 'Windows':");
		String os = input.next();
		
		if (os.equals("Linux") || os.equals("linux")) {
			System.out.println("Type 'start' to enter an ip address to receive ping from, or type 'help' for help");
			while (loop == true) {
				String userInput = input.next();

				if (userInput.equals("help")) {
					System.out.println("	help - lists available commands");
					System.out.println("	exit - terminates the program");
					System.out.println("	ip - lists current ip address");
					System.out.println("	stop - pauses receiving ping");
					System.out.println("	start - starts receiving ping");
				} // if end
				if (userInput.equals("exit")) {
					System.out.println("	Exiting...");
					System.exit(0);
				} // if end
				if (userInput.equals("ip")) {
					System.out.println(InetAddress.getLocalHost().getHostAddress());
				} // if end
				if (userInput.equals("stop")) {
					System.out.println(stop);
				} // if end
				if (userInput.equals("start")) {
					System.out.println("Enter an ip address:");
					String pong = input.next();
					
					System.out.println("Is this correct? y/n");
					String ynInput = input.next();
					if (ynInput.equals("y")) {
						System.out.println("test");
					} // if end
					else if (ynInput.equals("n")) {
						System.out.println("Type 'start' to enter an ip address to receive ping from, or type 'help' for help");
					} // else if end
				} // if end
			} // while end
		} // if end
		if (os.equals("macOS") || os.equals("macos") || os.equals("Macos") || os.equals("MacOS")) {
			System.out.println("Type 'start' to enter an ip address to receive ping from, or type 'help' for help");
			while (loop == true) {
				String userInput = input.next();

				if (userInput.equals("help")) {
					System.out.println("	help - lists available commands");
					System.out.println("	exit - terminates the program");
					System.out.println("	ip - lists current ip address");
					System.out.println("	stop - pauses receiving ping");
					System.out.println("	start - starts receiving ping");
				} // if end
				if (userInput.equals("exit")) {
					System.out.println("	Exiting...");
					System.exit(0);
				} // if end
				if (userInput.equals("ip")) {
					System.out.println(InetAddress.getLocalHost().getHostAddress());
				} // if end
				if (userInput.equals("stop")) {
					System.out.println(stop);
				} // if end
				if (userInput.equals("start")) {
					System.out.println("Enter an ip address:");
					String pong = input.next();
					
					System.out.println("Is this correct? y/n");
					String ynInput = input.next();
					if (ynInput.equals("y")) {
						System.out.println("test");
					} // if end
					else if (ynInput.equals("n")) {
						System.out.println("Type 'start' to enter an ip address to receive ping from, or type 'help' for help");
					} // else if end
				} // if end
			} // while end
		} // if end
		if (os.equals("Windows") || os.equals("windows")) {
			System.out.println("Type 'start' to enter an ip address to receive ping from, or type 'help' for help");
			while (loop == true) {
				String userInput = input.next();

				if (userInput.equals("help")) {
					System.out.println("	help - lists available commands");
					System.out.println("	exit - terminates the program");
					System.out.println("	ip - lists current ip address");
					System.out.println("	stop - pauses receiving ping");
					System.out.println("	start - starts receiving ping");
				} // if end
				if (userInput.equals("exit")) {
					System.out.println("	Exiting...");
					System.exit(0);
				} // if end
				if (userInput.equals("ip")) {
					System.out.println(InetAddress.getLocalHost().getHostAddress());
				} // if end
				if (userInput.equals("stop")) {
					System.out.println(stop);
				} // if end
				if (userInput.equals("start")) {
					System.out.println("Enter an ip address:");
					String pong = input.next();
					
					System.out.println("Is this correct? y/n");
					String ynInput = input.next();
					if (ynInput.equals("y")) {
						System.out.println("test");
					} // if end
					else if (ynInput.equals("n")) {
						System.out.println("Type 'start' to enter an ip address to receive ping from, or type 'help' for help");
					} // else if end
				} // if end
			} // while end
		} // if end
	} // main end
}

/*
this originally would recieve ping from the other machine
as far as i know, there is no way to tell that you are being pinged in java
this is also the program that would open the shutdown commands
*/