package day05;

import java.util.Scanner;

public class ScannerRound2 {

	public static void main(String[] args) {
		
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		//asking user questions
		System.out.println("Enter your first name : ");
		
		//force user to enter input
		String firstName = input.next();
		// and format the display output		
		System.out.println("Your first name is "+firstName);
		
		System.out.println("Enter your last name ");
		
		//asks the user enter his/her name		
		String lastName = input.next();
		
		System.out.println("Your full name is "+firstName+" "+ lastName);
		
		
		
		//System.out.println("Your full name is "+ firstName + " "+ lastName);
		
		input.close();

	}

}
