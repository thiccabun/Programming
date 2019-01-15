// pings server, run first
// Zack Friedman, cohort final project
// as of now, all this does is ping another machine.

import java.util.*;
import java.net.*;
import java.io.*; 

public class ping {
	public static void main(String[] args) throws UnknownHostException {
		Scanner input = new Scanner(System.in);
		
		boolean loop = true;
		int sleep = 30 * 1000;
		
		System.out.println(new java.util.Date());
		System.out.println("Type 'start' to enter an ip address to ping, or type 'help' for help");
		while (loop) {
			String userInput = input.next();
			if (userInput.equals("help")) {
				System.out.println("	help - lists available commands");
				System.out.println("	exit - terminates the program");
				System.out.println("	file - creates a file for history to write to");
				System.out.println("	history - opens file with ping history");
				System.out.println("	ip - lists current ip address");
				System.out.println("	start - starts pinging");
				System.out.println("	stop - pauses pinging");
			} // if end
			if (userInput.equals("exit")) {
				System.out.println("	Exiting...");
				System.exit(0);
			} // if end
			if (userInput.equals("file")) {
				File file = new File("history.txt");
				if(file.exists() && !file.isDirectory()) {
					System.out.println("	File 'history.txt' already exists");
				} // if end
				else {
					try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("history.txt"), "utf-8"))) {
					} // try end
					catch (Exception e){
						e.printStackTrace();
					} // catch end
						System.out.println("	File 'history.txt' created in source folder");
				} // else end
			} // if end
			if (userInput.equals("history")) {
				System.out.println("	not yet implemented");
			} // if end
			if (userInput.equals("ip")) {
				System.out.println("	Current IP address: '" + InetAddress.getLocalHost().getHostAddress() + "'");
			} // if end
			if (userInput.equals("start")) {
				System.out.println("Enter an IP address:");
				String ping = input.next();
				System.out.println("Is this correct? y/n");
				String ynInput = input.next();
				if (ynInput.equals("y")) {
					sleep = 30 * 1000;
         			while (loop) {
						try{
							InetAddress address = InetAddress.getByName(ping);
							boolean reachable = address.isReachable(10000);
							if (!reachable) {
								System.out.println("ERROR: Unable to ping " + ping + " @ " + new java.util.Date());
								Thread.sleep(sleep);
							} // if end
							else {
								System.out.println("Successfully pinged " + ping + " @ " + new java.util.Date());
								Thread.sleep(sleep);
							} // else end
						} // try end 
						catch (Exception e){
							e.printStackTrace();
						} // catch end
					} // while end
				} // if end
				else if (ynInput.equals("n")) {
					System.out.println("Type 'start' to enter an ip address to ping, or type 'help' for help");
				} // else if end
			} // if end
			if (userInput.equals("stop")) {
				System.out.println("	ERROR: Must be pinging to stop");
			} // if end
		} // while end
	} // main end
}

// random stuff below, ignore

/*
ideas:

for history.txt, use "[ip] @ [time]"
create backups of history.txt [daily?]
*/

/*
known problems:

program freaks out if you enter characters for the ip, but does not crash
'stop' doesnt actually work (couldnt figure out how to get input in the ping loop)
'history' does not open history.txt
nothing is written to history.txt
*/

// feel free to report bugs, but know i probably wont fix them

// unused test code below, ignore

/*	
pause ping v1 (thread.interrupt causes error)

if (userInput.equals("stop")) {
	System.out.println("	Stopping...");
	Thread.interrupt();
} // if end */

/* 
pause ping v2 ("stop" doesn't work, loop doesn't loop)

String line = null;
String pingInput = "";
if (!(line = input.nextLine()).isEmpty()) {
	pingInput = input.next();
}
if (pingInput.equals("stop")) {
	System.out.println("	Stopping...");		
} // if end
*/

/*
file creation v1, doesn't create file

if (userInput.equals("file")) {
	File file = new File("history.txt");
	System.out.println("	File 'history.txt' created in source folder");
} // if end
*/

/*
file creation v2, doesn't work without "IOException"

if (userInput.equals("file")) {
	PrintWriter writer = new PrintWriter("history.txt", "UTF-8");
	System.out.println("	File 'history.txt' created in source folder");
} // if end
*/

/*
file creation v3, works but requires try-catch

if (userInput.equals("file")) {
	try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("history.txt"), "utf-8"))) {
	} // try end
	catch (Exception e){
		e.printStackTrace();
	} // catch end
	System.out.println("	File 'history.txt' created in source folder");
} // if end
*/

/*
file creation v4, works perfectly

if (userInput.equals("file")) {
	File file = new File("history.txt");
	if(file.exists() && !file.isDirectory()) {
		System.out.println("	File 'history.txt' already exists");
	} // if end
	else {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("history.txt"), "utf-8"))) {
		} // try end
		catch (Exception e){
			e.printStackTrace();
		} // catch end
			System.out.println("	File 'history.txt' created in source folder");
	} // else end
} // if ends
*/

/*
file write v1, cannot find symbol?

try {
	fWriter = new FileWriter("history.txt");
} // try end
catch (Exception e) {
	System.out.println("ERROR: IP not saved to log");
} // catch end 
*/