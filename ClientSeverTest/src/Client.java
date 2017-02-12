import java.net.*;
import java.io.*;

public class Client extends Thread{
	
	private static int port = 22666;
	private static String server = "localhost";
	
	public void run(){
		try {
			System.out.println("Connecting");
			Socket servSock = new Socket(server, port);
			
			System.out.println("Connected");
			DataOutputStream cliData = new DataOutputStream(servSock.getOutputStream());
			cliData.writeUTF("Up:Down:Left:Right");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		Thread t = new Client();
		t.start();
	}
	
}
