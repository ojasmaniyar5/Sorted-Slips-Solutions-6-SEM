import java.net.*;
public class Slip_11A{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress addr=InetAddress.getLocalHost();
		String ipAddress=addr.getHostAddress();
		System.out.println("IP Address of localhost from Java Program:"+ ipAddress);
		String hostname=addr.getHostName();
		System.out.println("Name of hostname:"+hostname);
	}
}