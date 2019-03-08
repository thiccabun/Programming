# Final Project

## Synopsis
This program was supposed to send and recieve ping. If one computer did not recieve ping after one minute, it would safely shutdown itself. It only sends ping. It does not recieve it.

## How to Use
Run "ping.java" in a Java editor of your choice.

## Code Example
This code snippet is how the program pings another computer. "ping" is the IP address it is pinging.
```
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
```

## Other
"pong.java" was the other half to this program. It is not finished and as far as I know there is no way to finish it. It would've recieved the ping and opened the shutdown commands.
