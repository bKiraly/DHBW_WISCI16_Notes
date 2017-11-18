package JavaCourse;

import java.util.concurrent.locks.*;

public class ExI_RWLock {
	static ReadWriteLock rwLock;
	static String text = "Number 0";

	public static class Reader extends Thread {
		int delay;
		int time;

		Reader(int delay, int time) {
			this.delay = delay;
		}

		public void run() {
			try {
				while (true) {
					rwLock.readLock().lock();
					System.out.println("Starting to read text " + text);
					sleep(time);
					System.out.println("Ending text read " + text);
					rwLock.readLock().unlock();
					sleep(delay);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static class Writer extends Thread {
		int delay;
		int time;
		int i;

		Writer(int delay, int time) {
			this.delay = delay;
		}

		public void run() throws ArithmeticException {
			while (true) {
				rwLock.writeLock().lock();
				text = "Number " + (i++);
				try {
					System.out.println("Starting to write text " + text);
					sleep(time);
					System.out.println("Ending text write " + text);
					rwLock.writeLock().unlock();
					sleep(delay);
				} catch (Exception e) {

				}
			}
		}
	}

	public static void main(String args[]) {
		rwLock = new ReentrantReadWriteLock();
		new Reader(100, 10).start();
		new Reader(100, 10).start();
		new Reader(100, 10).start();
		new Writer(200, 20).start();
		new Writer(200, 20).start();
	}
}
