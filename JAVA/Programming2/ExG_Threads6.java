package JavaCourse;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Threads6 {
	
	static class LockExample implements Runnable{
		static String magic = "";
		static Lock l = new ReentrantLock();
		public void run() {
			String sajt = "";
			while(true) {
				if(l.tryLock()) {
					sajt = magic;
					magic += sajt.length();
					if(magic.length() != sajt.length()+(""+sajt.length()).length()) System.out.println(magic.length()+"!="+(sajt.length()+(""+sajt.length()).length()));
					l.unlock();
				}
			}
		}
	}
	
	public static void main(String args[]) {
		new Thread(new LockExample()).start();;
		new Thread(new LockExample()).start();;
		new Thread(new LockExample()).start();;
	}
}
