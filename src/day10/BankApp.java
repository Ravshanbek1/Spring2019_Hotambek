package day10;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		// WARM UP TASK
		
		//ACCESS YOUR BANK ACCOUNT APP
		
		//Print welcome to Cybertek Banking App
		
		//declare 2 variables account number and password and assign
		//your account number and password`
		
		//Ask user to enter account number as long
		//Ask user to enter password as String
		
		//if user account and password match the print success message
		//else print login fails
		
		long accountNumber = 1111L ;
		String password = "user";
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to Cybertek Banking App.");
		
		//in order to check primitive type equality
		//you should always use ==
		
		//for String you should always use. equals method
		
		//if you have single line of statement under your if or else
		//curly braces are optional
		
		System.out.println("Please enter account number: ");
		accountNumber = scan.nextLong();
		
		System.out.println("Please enter your password: ");
		password = scan.next();
		
		if(accountNumber==1111L && password.equals("user")) {
			System.out.println("Login successful!");
		}else {
			System.out.println("user name or password incorrect.");
		}
		
		scan.close();
	}

}
