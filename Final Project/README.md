# Final Project

## Synopsis
This program was supposed to send and recieve ping. It only sends it.

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
"pong.java" was the other half to this program. It is not finished and as far as I know there is no way to finish it.
