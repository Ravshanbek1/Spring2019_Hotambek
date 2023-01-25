package day06;

import java.util.Scanner;

public class ScannerAgeCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name today ");
		String name = input.next();
		System.out.println("Your name is : "+name);
		// Task 2 Ask user to enter birth year as a number
		// and calculate users age
		
		System.out.println("Enter your year of birth  :");		
		int yearOfBirth = input.nextInt();
		int age = 2022 - yearOfBirth;		
		// int yourAge = currentYear-yearOfBirth;
		
		// Be careful , bear shouldn't ingest large fluffy dog
		//boolean, char, byte, short, int, long, float, double
		System.out.println("Enter short value : ");
		//byte b1 = input.nextByte();
		float b1 = input.nextFloat();
		System.out.println("Your have entered short value "+b1);
		
		System.out.println("Enter boolean value "+b1);
		boolean isHungry = input.nextBoolean();
		System.out.println(" I am hungry "+isHungry );
		
		System.out.println("If you are born in "+yearOfBirth+ ", "
		+ "\nthen your age is : "+age+" years old" );
		// System.out.println("Your age is :" + (2022 - yearOfBirth));
		
		input.close();
	}

}
