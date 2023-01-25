package day12;

import java.util.Scanner;

public class DayPrinter {

	public static void main(String[] args) {
		// Task 4
		
		//Switch VS if else
		
		//Switch : should be used when checking for equality of certain variable
		//in multiple specific case
		
		//Ternary : conditionally assigning a value .
		// 	we cannot take actions we can only assign value according to condition
		//If else : most flexible , can do anything
		
		//use switch statement to accomplish this task
		
		//declare int variable daynum
		//declare a String variable daWord
		
		//use switch to check for equality of dayNum
		/* case 1 --- assign the value for dayWord as Monday
		 * case 2 --- assign the value for dayWord as Tuesday
		 * case 3 --- assign the value for dayWord as Wednesday
		 * case 4 --- assign the value for dayWord as Thursday
		 * case 5 --- assign the value for dayWord as Friday
		 * case 6 --- assign the value for dayWord as Saturday
		 * case 7 --- assign the value for dayWord as Sunday
		 * 
		 * if nothing match assign value dayWord as invalid day
		 * 
		 * after switch statement -- print out the dayWord value  
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day number. ");
		int dayNum = scan.nextInt();
		String dayWord;
		
		switch (dayNum) {
		case 1:
			dayWord="Monday";					
			break;
		case 2:
			dayWord="Tuesday";			
			break;
		case 3:
			dayWord="Wednesday";
			break;
		case 4:
			dayWord="Thursday";
			break;
		case 5:
			dayWord="Friday";
			break;
		case 6:
			dayWord="saturday";
			break;
		case 7:
			dayWord="Sunday";
			break;
		default:
			dayWord="Invalid day of the week.";
			break;
		}
		System.out.println("the day is: " + dayWord);
		
		scan.close();

	}

}
