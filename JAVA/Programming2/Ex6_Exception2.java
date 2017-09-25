public class Ex6_Exception2 {
	static class NoPaperException extends Exception{
		public String getCustomErrorMessage() {
			return"No paper!";
		}
	}
	static class Printer {
		int paper = 0;
		public void addPaper(int amt) {
			this.paper += amt;
		}
		public void print() {
			try {
				if(this.paper < 1) throw new NoPaperException();
				this.paper--;
				System.out.println("Printed!");
			} catch(NoPaperException e) {
				showError(e.getCustomErrorMessage());
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
		printer.print();		//>Printed!
	}
}
