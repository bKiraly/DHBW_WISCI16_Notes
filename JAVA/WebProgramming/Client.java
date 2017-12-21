package webProgramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client extends Thread{
	int port;
	String host;
	String message;
	Client(String host, int port, String message){
		this.port = port;
		this.host = host;
		this.message = message;
	}
	
	public void run() {
		try {
			Socket clientSocket = new Socket(host, port);
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			outToServer.writeBytes(this.message+"\n");
			outToServer.flush();
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String msg = "";
			do {
				msg = inFromServer.readLine();
				System.out.println("FROM SERVER: " + msg);
			} while(msg != null);
			clientSocket.close();
		}catch(Exception e) {}
	}
}
