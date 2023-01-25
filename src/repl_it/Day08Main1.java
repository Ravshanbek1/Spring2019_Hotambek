package repl_it;

import java.util.Scanner;

public class Day08Main1 {

	public static void main(String[] args) {
		// YOUR  CODE HERE
		
		/*Write a program that asks user to input int vaues: areaCode and
		 * localNumber>
		 * 
		 * -Using concatenation put together in this format and assign to String
		 * phoneNumber variable:
		 * -(222)-3334444
		 * 
		 * -Write a print statement that displays (use phoneNumber variable):
		 * Caling number (222)-3334444		 * 
		 */
//		int areacode, localNumber;
//		String phoneNumber = "Calling number " ;
		
//		
//		
//		System.out.println("Enter the \"Area Code\" :\n"
//				+ "\"Phone Number\" :");
//		areacode = input.nextInt();
//		localNumber = input.nextInt();
//		//phoneNumber = scan.nextLine();
//		
//		System.out.println(phoneNumber +" "+"("+areacode+")"+"-"+localNumber);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter area code and a Phone number ");
		int areaCode = input.nextInt();
		int localNumber = input.nextInt();
		
		String phoneNumber = "("+areaCode+")-"+localNumber;
		System.out.println("Calling number "+phoneNumber);
		
		
		
		input.close();
	}

}
