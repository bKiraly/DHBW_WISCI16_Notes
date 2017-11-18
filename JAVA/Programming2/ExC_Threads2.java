package JavaCourse;

public class ExC_Threads2 {
	public static class MyThread extends Thread{
		private int stepSize;
		private String prefix;
		public MyThread(int stepSize, String prefix){
			this.stepSize = stepSize;
			this.prefix = prefix;
		}
		@Override
		public void run() {
			for(int i = 0; i < 10; i += this.stepSize)
				System.out.println(prefix+" | "+i);
		}
	}
	public static void main(String args[]) {
		new MyThread(2,"A").start();
		new MyThread(3,"B").start();
	}
}
