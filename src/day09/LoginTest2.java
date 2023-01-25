package day09;

import java.util.Scanner;

public class LoginTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String username , password;
		System.out.println("Enter user name:");
		username = scan.next();
		System.out.println("Enter password");
		password = scan.next();
		
		boolean userExists = username.equals("user");
		boolean passwordCorrect = password.equals("pass");
		
		if(userExists && passwordCorrect) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed");
		}

		scan.close();
	}

}
