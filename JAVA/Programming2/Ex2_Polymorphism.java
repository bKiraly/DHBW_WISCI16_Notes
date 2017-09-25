class Ex2_Polymorphism{
	static class Drawable{
		public void draw(){
			System.out.println("Very descriptive error message.");
		}
	}
	static class Triangle extends Drawable{
		public void draw() {
			System.out.println(	"     /|\n"
					+ 			"    / |\n"
					+			"   /__|\n");
		}
	}
	static class Rectangle extends Drawable{
		public void draw() {
			System.out.println(	"|'''''|\n"
					+ 			"|     |\n"
					+			"|_____|\n");
		}
	}
	static class Circle extends Drawable{
		public void draw() {
			System.out.println(	" /''\\\n"
					+ 			"|    |\n"
					+			" \\__/\n");
		}
	}
	
	public static void main(String args[]) {
		System.out.println("Ex. 1:");
		Drawable[] drawQueue = new Drawable[4];
		drawQueue[0] = new Triangle();
		drawQueue[1] = new Rectangle();
		drawQueue[2] = new Circle();
		drawQueue[3] = new Drawable();
		for(int i = 0; i < 4; i++)
			drawQueue[i].draw();
	}
}
