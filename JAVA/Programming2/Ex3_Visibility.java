class Ex3_Visibility{
                public static void main(String args[]){
                               Admin admin = new Admin("sajt", "sajt", "sajt@sajt.com", "sajt");
                               System.out.println(admin.login("sajt","sajt"));				//>true		#Here we show that we can access the inherited method of user from admin
                               User user = admin.addUser("sonka", "sonka@sonka.com", "sonka", "sajt");	//Here we show we can still use admin methods to create a user
                               System.out.println(user.login("sonka", "sonka"));			//>true
                               
                               //Success case: Password changed successfully
                               System.out.println(user.setPassword("sonka", "sonka2", "sonka2"));	//>true		#The password was changed successfully
                               System.out.println(user.login("sonka", "sonka"));			//>false	#The old credentials no longer work
                               System.out.println(user.login("sonka", "sonka2"));			//>true		#The new credentials work
                               
                               //Failure case: Password unchanged
                               System.out.println(user.setPassword("something", "sonka", "sonka"));	//>false	#Update failed, wrong password provided
                               System.out.println(user.login("sonka", "sonka2"));			//>true		#Old credentials still work
                               System.out.println(user.login("sonka", "sonka"));			//>false	#New credentials don not work
                }
                public static class User{
                                String username;
                               String password;
                               String email;

                               User(String username, String password, String email){
                                               this.username = username;
                                               this.password = password;
                                               this.email = email;
                               }
                               
                               public boolean login(String username, String password){
                                               if(this.username == username && this.password == password)
                                                               return true;
                                               else
                                                               return false;
                               }
                               void setPasswordInt(String password){
                                               this.password = password;
                               }
                               public boolean setPassword(String oldPass, String newPass, String newPassRepeat){
                                               if(oldPass == this.password && newPass == newPassRepeat){
                                                               setPasswordInt(newPass);
                                                               return true;
                                               }else return false;
                               }
                }
                public static class Admin extends User{
                               String adminPass;
                               Admin(String username, String password, String email, String adminPass){
                                               super(username, password, email);
                                               this.adminPass = adminPass;
                               }
                               public User addUser(String username, String email, String password, String adminPass){
                                               if(this.adminPass == adminPass){
                                                               return new User(username, password, email);
                                               }else return null;
                               }
                }
}
