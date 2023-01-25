package day12;

import java.util.Scanner;

public class Caculator_Switch2 {
	
	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Enter Operator, plus , minus , multiplication , division ");
		
		String operator = scan.next();
		
		switch(operator.toLowerCase()) {
		case "plus":
			System.out.println("the addition result is "+(num1+num2));
			break;
		case "minus":
			System.out.println("the subtraction result is "+(num1-num2));
			break;
		case "multiplication":
			System.out.println("the multiplication result is "+(num1*num2));
			break;
		case "division":
			System.out.println("the division result is "+(num1/num2));
			break;
		default:
			System.out.println("INVALID ENTRY");
			break;	
	}
		
		scan.close();

}
}
