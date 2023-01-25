package day10;

import java.util.Scanner;

public class AmazonShopping {

	public static void main(String[] args) {
		
		/*
		 * Print out welcome Amazon shopper 
		 * ask users prices double
		 * ask users isPrimeMember as boolean
		 * 
		 * eventually according to the logic in chart
		 * print out final price
		 */
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Welcome to Amazon!");
		
		System.out.println("whats the price in your cart");	
		double price = scan.nextDouble();
		System.out.println("are you a prime member?");
		boolean isPrimeMemeber=scan.nextBoolean();
				
		//System.out.println("The price is : $"+price);
		
		if(isPrimeMemeber) {
			System.out.println("YOU GOT FREE SHIPPING :");
			
		}else if(price>=35) {
			System.out.println("YOU STILL GOT FREE SHIPPING ");
			
		}else {
			price += 5;
			System.out.println("YOU gotta pay $5 for shipping. $"+(price));
			//System.out.println("YOU gotta pay $5 for shipping. $"+(price+5));
			System.out.println("you may also consider joining prime to avoid shipping fee."
					+ "");
		}
		
		
		scan.close();
		

	}

}
