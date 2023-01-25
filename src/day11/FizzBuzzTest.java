package day11;

import java.util.Scanner;

public class FizzBuzzTest {

	public static void main(String[] args) {
		
		// create a variable int and get the value from scanner
		// declare String variable result ;
		// conditionally assign the value of result using ternary operator
		// if the number is both divisible by 5 and 3 assign result to fizzBuzz
		// else you assign value to notFizzBuzz

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer");
		int num = scan.nextInt();
		String result;
//		
//		if(num%5==0||num%3==0) {
//			result="FizzBuzz";
//		}else {
//			result="NotFizzBuzz";
//		}
		
		result = (num%5==0 && num%3==0) ? "FizzBuzz" : "notFizzBuzz";
		// THIS IS what you if you don't want do anything in else condition
		// result = (num%5==0 && num%3==0) ? "FizzBuzz" : "notFizzBuzz";
		System.out.println(result);
		
		scan.close();
	}

}
