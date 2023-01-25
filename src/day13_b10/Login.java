package day13_b10;

//import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter username and password");
		String secretUserName = "admin";
		String secretPassword = "abc123";
		
		// create 2 variables userName, password
		// make sure they match with secret ones. and allow login successfully
		// Whenever login is not successful, let program tell exact reason
		// why it is not valid:
			//username is not valid
			//passwowrd is not valid
			//both username and password
		String userName = "ADMin";
		String password = "abc123";
				//don't worry about case
		if(userName.equalsIgnoreCase(secretUserName) && password.equalsIgnoreCase(secretPassword) ) {
			System.out.println("Login Successful. Welcome back!");		
		}else if(!userName.equalsIgnoreCase(userName) && !password.equalsIgnoreCase(secretPassword)) {
			System.out.println("both username and password are invalid");
		}
		
		else if(!(userName.equals(secretUserName) )){
			System.out.println("username is not valid");
		}else {
			System.out.println("password is not valid");
		}
	}

}
