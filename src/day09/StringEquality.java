package day09;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {
				
		// TASK 2
		//Create a name variable to store your name
		//CREATE A SCANNER TO ASK FOR A NAME
		//compare the name with what your entered
		//print out thats my name if it's equal
		//print out thats not my name if its not
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name pease : ");
		String name = scan.next();
		
		boolean nameEqualToExpec = name.equals("Tahir");
		
		System.out.println(nameEqualToExpec);
		
		if(name.equals("Tahir")) {
			System.out.println("That's Tahir");
		}else {
			System.out.println("NOT HIM !!");
		}
		
		
		scan.close();
		
	}

}
