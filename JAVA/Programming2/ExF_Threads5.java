package JavaCourse;

public class Thread5 {
	static class Daemons extends Thread{
		Daemons(){
			setDaemon(true);
		}
		public void run() {
			assert(isDaemon());
			while(true) System.out.println("sajt");
		}
	}
	public static void main(String args[]) {
		new Daemons().start();
		try{Thread.sleep(200);}catch(Exception e) {}
	}
}
