package day09;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		
		/*WARM UP TASK :
		 * 
		 * Create a simple program
		 * 
		 * print out welcome to Math library
		 * ask user for 2 integer :
		 * ---------------------------
		 * write simple if statement
		 * IF the sum of 2 numbers are greater than 100
		 * then print out you entered great numbers
		 * 
		 * ELSE
		 * looks like your sum is less than 100
		 * 
		 * Logical Operator &&, & ||, | !
		 * && --> AND it will not evaluate right hand
		 *        side if left hand side is already false
		 * ||---> OR it will only evaluate right hand side if left hand side is false
		 * |----> OR it will always evaluate both sides 
		 * !----> LOGICAL NOT        
		 */
		int num1, num2, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to Math library. "+"\n" + "please enter 2 numbers :");
		num1 = scan.nextInt();
		num2 = scan.nextInt();		
		sum = num1 + num2;
		
		
		if(sum >= 100){
			System.out.println("you entered great number!");
		}else {
			System.out.println("looks like yuor sum is less than or equal to 100.");
		}
		
		scan.close();
	}

}
