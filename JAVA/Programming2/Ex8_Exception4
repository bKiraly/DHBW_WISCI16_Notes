package JavaCourse;

public class Exceptions2 {
	static class ExceptionCreator{
		String printerName;
		public ExceptionCreator(String name) {
			printerName = name;
		}
		public class PrinterException extends Exception{
			public String getCustomErrorMessage() {
				return printerName+": Printer exception occured";
			}
		}
		public class NoPaperException extends PrinterException{
			public String getCustomErrorMessage() {
				return printerName+": No paper!";
			}
		}
		public class NoTonerException extends PrinterException{
			public String getCustomErrorMessage() {
				return printerName+": No toner!";
			}
		}
	}
	static class Printer {
		int paper = 0;
		int toner = 0;
		float paperTonerRatio;
		public void addPaper(int amt) {
			this.paper += amt;
		}
		public void addToner(int amt) {
			this.toner += amt;
		}
		public void print() {
			ExceptionCreator ec = new ExceptionCreator("myPrinter");
			try {
				if(this.paper < 1) throw ec.new NoPaperException();
				if(this.toner < 1) throw ec.new NoTonerException();
				this.paperTonerRatio = this.paper / this.toner;
				this.paper--;
				this.toner--;
				System.out.println("Printed!");
			} catch(ExceptionCreator.NoPaperException e1) {
				System.out.println("PAPER!");
				showError(e1.getCustomErrorMessage());
			} catch (ArithmeticException ea) {
				System.out.println("Paper-Toner-Ratio could not be determined. Is the toner empty?");
			} catch(ExceptionCreator.PrinterException e2) {
				showError(e2.getCustomErrorMessage());
			}
		}
		public void showError(String err) {
			System.out.println(err);
		} 
	}
	public static void main (String args[]) {
		Printer printer = new Printer();
		printer.print();		//>No paper!
		printer.addPaper(10);
		printer.print();		//>No toner!
		printer.addToner(10);
		
	}
}
