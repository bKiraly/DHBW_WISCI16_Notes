public class Ex5_Exception {
	static class NotAuthorizedException extends Exception {
		public NotAuthorizedException(String uname) {
			super(uname + " not authorized");
		}
	}
	static class AuthorityCheck{
		public void check(String uname) throws NotAuthorizedException{
			if(uname != "Admin") throw new NotAuthorizedException(uname);
		}
	}
	static void printSecureContent() {
		System.out.println("Secure content");
	}
	public static void main (String args[]) {
		AuthorityCheck authorityCheck = new AuthorityCheck();
		try {
			authorityCheck.check("noAdmin");	//Change to "Admin" to gain access
			printSecureContent();
		}catch (NotAuthorizedException e1) {
			System.out.println(e1.getMessage());
		} finally {
			System.out.println("I'm always executed!");
		}
	}
}
