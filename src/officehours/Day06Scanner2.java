package officehours;

import java.util.Scanner;

public class Day06Scanner2 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your 1st name :");
		String firstName = userInput.nextLine();
		System.out.println("You have entered as :"+firstName);
		System.out.println("Enter your last name :");
		String lastName = userInput.next();
		System.out.println("You have entered as: "+lastName );
		System.out.println("Enter your state and city :");
		//this nextLine() receives empty input
		userInput.nextLine();
		String cityState = userInput.nextLine();
		System.out.println("You haave entered :"+cityState);
		System.out.println("Entered your nationality :");
		String nationality = userInput.nextLine();
		System.out.println("You have entered :"+ nationality);
		System.out.println("Enter your age :");
		int age = userInput.nextInt();
		System.out.println("You have entered :"+age);

		System.out.println("Do you like your job?");
		boolean bool = userInput.nextBoolean();
		if(bool ==   true) {
			System.out.println("You like your  job");
		}else {
			System.out.println("You don't like your job");
		}
		System.out.println("Thak you!");
		userInput.close();
	}
	
}
