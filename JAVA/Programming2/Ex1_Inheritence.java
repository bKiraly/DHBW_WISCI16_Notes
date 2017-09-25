public class Ex1_Inheritence{
	public static void main(String args[]){
		Admin admin = new Admin();
		admin.username = "sajt";												//Here we show that we can access the inherited attributes of user from admin
		admin.password = "sajt";
		admin.adminPass = "sajt";
		System.out.println(admin.login("sajt","sajt"));							//Here we show that we can access the inherited method of user from admin
		User user = admin.addUser("sonka", "sonka@sonka.com", "sonka", "sajt");
		System.out.println(user.login("sonka", "sonka"));						//Here we show we can still use admin methods to create a user
	}
	public static class User{
	public String username;
	public String password;
	public String email;

	public boolean login(String username, String password){
		if(this.username == username && this.password == password)
			return true;
		else
			return false;
	}
	}
	public static class Admin extends User{
	public String adminPass;
	public User addUser(String username, String email, String password, String adminPass){
	   if(this.adminPass == adminPass){
		   User user = new User();
		   user.username = username;
		   user.email = email;
		   user.password = password;
		   return user;
	   }else return null;
	}
	}
}
