public class Ex4_Abstract_Classes_ and_Interfaces {
	
	//Ex. 1
	static interface Drawable{
		public void draw();
	}
	static class Triangle implements Drawable{
		public void draw() {
			System.out.println(	"     /|\n"
					+ 	"    / |\n"
					+	"   /__|\n");
		}
	}
	static class Rectangle implements Drawable{
		public void draw() {
			System.out.println(	"|'''''|\n"
					+ 	"|     |\n"
					+	"|_____|\n");
		}
	}
	static class Circle implements Drawable{
		public void draw() {
			System.out.println(	" /''\\\n"
					+ 	"|    |\n"
					+	" \\__/\n");
		}
	}
	//End of Ex. 1
	
	
	//Ex. 2
	static abstract class Module{
		public abstract String shortOutput();
		public String detailedOutput() {
			return shortOutput();
		}
	}
	static class WeatherModule extends Module{
		public String shortOutput() {
			return "10°C";
		}
		@Override
		public String detailedOutput() {
			return "It's 10°C and cloudy.";
		}
	}
	static class OnlyShort extends Module{
		public String shortOutput() {
			return "SHORT!";
		}
	}
	//End of Ex. 2
	
	//Main
	public static void main(String args[]) {
		System.out.println("Ex. 1:");
		Drawable[] drawQueue = new Drawable[4];
		drawQueue[0] = new Triangle();
		drawQueue[1] = new Rectangle();
		drawQueue[2] = new Circle();
		drawQueue[3] = new Triangle();
		for(int i = 0; i < 4; i++)
			drawQueue[i].draw();
		
		
		System.out.println("\n\n\nEx. 2");
		WeatherModule wm = new WeatherModule();
		OnlyShort os = new OnlyShort();
		System.out.println(wm.shortOutput());	//>10°
		System.out.println(wm.detailedOutput());//>It's 10°C and cloudy.
		System.out.println(os.shortOutput());	//>SHORT!
		System.out.println(os.detailedOutput());//>SHORT!
	}
}
