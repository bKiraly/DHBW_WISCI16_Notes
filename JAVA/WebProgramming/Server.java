package webProgramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server extends Thread{
	interface FI{
		public String get(String input);
	}
	
	int port;
	Server(int port){
		this.port = port;
	}
	public void run() {
		ServerSocket server;
		try {
			server = new ServerSocket(port);
			int i = 0;
			while(true) {
				Socket sock = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
				String msg = br.readLine();
				synchronized(System.out) {
				System.out.println(msg);
				}
				DataOutputStream fromClient = new DataOutputStream(sock.getOutputStream());
				fromClient.writeBytes("HTTP / 1.1 200 OK\r\n\r\n<html><body><h1>If you are reading this you've developped a shitty web server.</h1><br>Btw, you are visitor number "+(i++)+"<br>The client text was"+msg+"</body></html>");
				br.close();
				sock.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
