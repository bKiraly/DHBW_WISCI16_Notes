package JavaCourse;

public class Thread4 {
	static class conflict extends Thread{
		static int x;
		static int y;
		static Object l;
		String name;
		conflict(String name){
			this.name = name;
			l = new Object();
		}
		public void run() {
			while(true) {
			int x = (int)(Math.random()*1000);
			int y = x;
			
			synchronized(l){
			conflict.x = x;
			conflict.y = y;
			}
			
			int i = 0;
			for(int j = 0; j < 10000; j++) i++;

			int newX = 0;
			int newY = 0;
			synchronized(l){
				newX = conflict.x;
				newY = conflict.y;
			}
			
			if(newX != newY)
				System.out.println(newX+"!="+newY);
			}
		}
	}
	public static void main(String args[]) {
		conflict s1 = new conflict("T1 ");
		conflict s2 = new conflict("T2 ");
		s1.start();
		s2.start();
	}
}
