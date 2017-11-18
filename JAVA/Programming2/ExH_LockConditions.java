package JavaCourse;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExH_LockConditions {
	static class RandomProducer extends Thread{
		int delay;
		int[] queue;
		int free;
		Lock l;
		Condition c;
		RandomProducer(int delay, int queueLength){
			this.delay = delay;
			queue = new int[queueLength];
			l = new ReentrantLock();
			c = l.newCondition();
			free = queue.length;
		}
		public void run() {
			try {
				while(true) {
					push((int)(Math.random()*1000));
					Thread.sleep(delay);
				}
			}catch (Exception e) {}
		}
		private void push(int i) throws Exception {
			//System.out.println("Push locking...");
			l.lock();
			if(free < 1) c.await();
			queue[queue.length-free] = i;
			free--;
			System.err.println(free);
			c.signal();
			//System.out.println("Push unlocking");
			l.unlock();
		}
		public int pop() {
			try {
			//System.out.println("Pop locking");
			l.lock();
			if(free == queue.length) c.await();
			int res = queue[0];
			for(int i = 0; i < queue.length-1; i++)
				queue[i] = queue[i+1];
			free++;
			System.out.println(res);
			c.signal();
			//System.out.println("Pop unlocking");
			l.unlock();
			return res;
			}catch(Exception e) { return 0;}
		}
	}
	static class TextCommandLineConsumer extends Thread{
		RandomProducer rp;
		int delay;
		public TextCommandLineConsumer(RandomProducer rp, int delay) {
			this.rp = rp;
			this.delay = delay;
		}
		public void run() {
			try {
				while(true) {
					rp.pop();
					Thread.sleep(delay);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
		RandomProducer rp = new RandomProducer(200,10);
		TextCommandLineConsumer tclc = new TextCommandLineConsumer(rp,300);
		rp.start();
		tclc.start();
	}
}
