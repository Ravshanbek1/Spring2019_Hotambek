package day12;

import java.util.Scanner;

public class DayPrinter3 {

	public static void main(String[] args) {
		/*HOMEWORK
		 * <<<<<< 2 variables : season as String , monthNumber as int >>>>>>>>
		 * Use switch statement to check for monthNumber equality
		 * if 3-4-5 as spring 6-7-8 as summer -9-10-11 fall -12,1,2 as winter
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter day number. ");
		int dayNum = scan.nextInt();
		String dayWord;
		
		switch (dayNum) {
		case 1:			
		case 2:			
		case 3:			
		case 4:			
		case 5:
			dayWord="Weekdays";
			break;
		case 6:			
		case 7:
			dayWord="Weekend";
			break;
		default:
			dayWord="Invalid day of the week.";
			break;
		}
		System.out.println("the day is: " + dayWord);
		
		scan.close();
		
	}

}
