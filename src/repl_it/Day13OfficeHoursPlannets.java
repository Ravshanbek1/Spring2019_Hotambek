package repl_it;

import java.util.Scanner;

public class Day13OfficeHoursPlannets {

	public static void main(String[] args) {
		/*
		 * Store on String a.
		 * after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, valid answer.
		 */
		 Scanner s = new Scanner(System.in);
		 
		 System.out.println("what is the farthest planet in the solar system:");
		 System.out.println("a)venus");
		 System.out.println("b)pluto");
		 System.out.println("c)neptune");
		 System.out.println("Enter the answer:");
		 
		 String a = s.nextLine();
		 
		 if(a.equals("a") || a.equals("c")) {
			 System.out.println(a+" is wrong");
		 }else if(a.equals("b")) {
			 System.out.println("b is correct");
		 
		 }else {
			 System.out.println(a+" is not a valid answer");
		 }
			 
		 
		 
		 s.close();
	}

}
