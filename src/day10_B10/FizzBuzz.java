package day10_B10;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		/*<<< INTERVIEW QUESTION >>>
		 * 3. if number is divisible by 3 (no remainder), print "Fizz" instead of the number.
		 * For each multiple of 5, print "Buzz" instead of the number.
		 * For numbers which are multiples of both 3 and 5, print "FizzBuzz"
		 * instead of the number.
		 * Else print number itself
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int number=scan.nextInt();
		//int fizz = 3, buzz = 5;
		
		if(number%3 == 0 && number%5 == 0 ) {
			System.out.println("FizzBuzz");			
		}else if(number%3 == 0) {
			System.out.println("Fizz");
		}else if(number%5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(number);
		}
		
		scan.close();
	}
	

}
