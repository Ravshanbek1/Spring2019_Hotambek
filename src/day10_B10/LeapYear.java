package day10_B10;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		/*<<< INTERVIEW QUESTION >>>
		 * Leap year(February 29 days): if a year is 1) divisible of 400 or 2) divisible
		 * of 4 but NOT divisible of 100 then its a leap year.
		 * 
		 * 800 / 400 = 2 1) 800 % 400 = 0 -> it is a leap year 2000 % 400 -> leap year
		 * 2001 % 400 -> 1 - not a leap year
		 * 
		 * 10 % 3 -> 1 3+3+3=1
		 * 
		 * 2) year % 4 -> TRUE 0 (no remainder) AND year % 100 -> NOT 0 (must be a
		 * remainder) TRUE *
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter year:");
		int year = scan.nextInt();

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " is also a leap year.");
		} else {
			System.out.println(year + " IS NOT A LEAP YEAR!");
		}
//		
//		if(year % 400==0 ||(year % 4 == 0 && year % 100 != 0)) {
//			System.out.println(year+" is also a leap year.");
//		}else {
//			System.out.println("not leap year");
//		}

		scan.close();
	}

}
