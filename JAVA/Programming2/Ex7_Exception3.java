public class Ex7_Exception3 {
	static class PrinterException extends Exception{
		public String getCustomErrorMessage() {
			return"Printer exception occured";
		}
	}
	static class NoPaperException extends PrinterException{
		public String getCustomErrorMessage() {
			return"No paper!";
		}
	}
	static class NoTonerException extends PrinterException{
		public String getCustomErrorMessage() {
			return"No toner!";
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
			try {
				if(this.paper < 1) throw new NoPaperException();
				//if(this.toner < 1) throw new NoTonerException();
				this.paperTonerRatio = this.paper / this.toner;
				this.paper--;
				this.toner--;
				System.out.println("Printed!");
			} catch(NoPaperException e1) {
				System.out.println("PAPER!");
				showError(e1.getCustomErrorMessage());
			} catch (ArithmeticException ea) {
				System.out.println("Paper-Toner-Ratio could not be determined. Is the toner empty?");
			} catch(PrinterException e2) {
				showError(e2.getCustomErrorMessage());
			}/* catch(NoTonerException e3) {	// Throws compiler error, exception already caught above
				System.out.println("TONER!");
			}*/
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
