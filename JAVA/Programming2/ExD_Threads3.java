package JavaCourse;

import java.util.Scanner;

public class Thread3 {
	static Thread t = null;
	public static void main(String args[]) {
		t = new Thread(()->{
			int i = 0;
			try {
				System.out.println("I am eating cookies");
				while(true) {
					System.out.println("Ate cookie number "+i++);
					Thread.sleep(500);
				}
			}catch(InterruptedException e){
				t.interrupt();
				System.out.println("Interrupted while eating cookies! D: Nevermind, ate "+i+" cookies! :D");
			}
		});
		t.start();
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		t.interrupt();
		scan.close();
	}
}
