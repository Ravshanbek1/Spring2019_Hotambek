package day09;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		
		// TASK 3
		// Create a simple program to check login
		// predefine user-name and password as String and assign value
		// Ask user to enter user-name and password using scanner
		// IF user-name and password match
		//     login successful
		//ELSE
		//     login failed
		
		//Optional Tasks : check for user name is admin or not
		//  if user is admin , whatever password should work
		
		String userName = "Ravshan"  , password  = "yusup";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username:");
		userName = scan.next();
		System.out.println("Enter password:");
		password = scan.next();
//		System.out.println("login as Admin");
//		admin = scan.next(); 
		
				
		if(userName.equals("Ravshan")&& password.equals("yusup")) {			
			System.out.println("login successful.");			
			}else{
			System.out.println("login failed");
		}
		
        
		scan.close();
	}
       
}
