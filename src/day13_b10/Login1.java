package day13_b10;

public class Login1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secretUserName = "admin";
		String secretPassword = "abc123";

		// create 2 variables userName, password
		// make sure they match with secret ones. and allow login successfully
		// Whenever login is not successful, let program tell exact reason
		// why it is not valid:
			//username is not valid
			//passwowrd is not valid
			//both username and password
		String userName = "ADMin2";
		String password = "abc123";
		
		if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword) ) {
			System.out.println("Login Successful. Welcome back!");		
		}else{
			//System.out.println("both username and password are invalid");
			if(!userName.equalsIgnoreCase(secretUserName) && !password.equalsIgnoreCase(secretPassword) ) {
				System.out.println("ERROR: Both Username and password area invalid");
			}else if(!userName.equalsIgnoreCase(secretUserName)) {
				System.out.println("ERROR: Username is no valid");
			}else {
				System.out.println("ERROR: Password is not valid");
			}
		}
 
	}

}
