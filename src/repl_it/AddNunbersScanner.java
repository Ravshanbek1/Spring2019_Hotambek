package repl_it;

import java.util.Scanner;

public class AddNunbersScanner {

	public static void main(String[] args) {
		
		/*
		 *  create a Scanner object and ask user to enter 3 number inputs.
		 * -Declare integer variables nu1, num2, num3, sum.
		 * -Create a Scanner object named scan.
		 * -Display prompt "enter 3 numbers:"
		 * -Using scanner object let user input 3 numbers
		 * -Add 3 numbers and assign to sum variable
		 * -Print "Sum of numbers: ValueOfSum"
		 */
		int num1, num2, num3, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		sum = num1 + num2 + num3;
		
		System.out.println("Sum of numbers :"+sum);
		
		
		scan.close();

	}

}
