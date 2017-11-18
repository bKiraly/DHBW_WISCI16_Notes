package JavaCourse;

public class Thread1 {
	static class MyRunnable1 implements Runnable{
		public void run() {
			for(int i = 0; i < 10; i++) System.out.println("A"+i);
		}
	}
	static class MyRunnable2 implements Runnable{
		public void run() {
			for(int i = 0; i < 2; i++) for(int j = 0; j < 5; j++) System.out.println("B"+(i*5+j));
		}
	}
	public static void main(String args[]) {
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}
