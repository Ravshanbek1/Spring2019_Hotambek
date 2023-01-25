package day06;

import java.util.Scanner;

public class UsingComparisionOperator {

	public static void main(String[] args) {
		
		// creating scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user questions
		System.out.println("Enter number1 :");
		int num1 = input.nextInt();
		System.out.println("Enter number2 : ");		
		int num2 = input.nextInt();
		
		boolean isGreater = num1 > num2;
		
		System.out.println("IS NUMBER1 GREATER THAN number 2 :"+ isGreater );
		
		input.close();
	}

}
