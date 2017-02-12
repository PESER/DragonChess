import java.io.*;
import java.net.*;

public class Server extends Thread{
	private static int port = 22666;
	private ServerSocket servSock;
	
	public Server(/*int port*/) throws IOException{
		servSock = new ServerSocket(port); 
	}
	
	public void run(){
		while(true){
			try{
				System.out.println("Waiting for Client.");
				Socket cliSock = servSock.accept();
				System.out.println("Connected:");
				DataInputStream cliData = new DataInputStream(cliSock.getInputStream());
				
				String strIn = cliData.readUTF();
				System.out.println("StrIn: " + strIn);
			}
			catch(IOException e){
				e.printStackTrace();
				break;
			}
		}
	}
	
	public static void main(String args[]){
		try {
			Thread t = new Server();
			t.start();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
