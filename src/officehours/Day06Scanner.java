package officehours;

import java.util.Scanner;

public class Day06Scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// take one word from the console		 
		System.out.println("Please enter your hometown: ");
		//if we have more than one word, we need to use nextLine();
		String word = scan.nextLine();
		System.out.println("are you serious:");
		//boolean bool = scan.nextBoolean();
		System.out.println("My hometown is: "+word);
	
		scan.close();
	}

}
