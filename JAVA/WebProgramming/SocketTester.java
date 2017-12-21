package webProgramming;

public class SocketTester {
	public static void main(String args[]) {
		Server s = new Server(8080);
		s.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Client c = new Client("127.0.0.1", 8080, "TestString");
		c.start();
	}
}
