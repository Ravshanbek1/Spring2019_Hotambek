package day08;

import java.util.Scanner;

public class ConditionalStatment2 {

	public static void main(String[] args) {

		/*
		 * * Task 2 BestBuy store : declare double variables for price of iphone, Ipad,
		 * yourBudget assign value for iPhone as 599.99, ipad 899.99 declare 2 more int
		 * variables for phoneCount and tabletCount ask user to enter the budget ask
		 * user to enter quantity you want to buy calculate the total price
		 * 
		 * write a conditional statement to check whether total price is more than your
		 * budget if it's more print, "out of budget" else print "I will take it !!
		 */

		Scanner input = new Scanner(System.in);
		double iPhonePrice = 599.99, iPadPrice = 899.99, yourBudget;
		int phoneCount, tabletCount;

		System.out.println("Enter iphone count :");
		phoneCount = input.nextInt();
		System.out.println("Enter iPad count :");
		tabletCount = input.nextInt();

		System.out.println("Enter your budget :");
		yourBudget = input.nextDouble();

		double total = iPhonePrice * phoneCount + iPadPrice * tabletCount;
		System.out.println(total);
		
		
		
		// command  + shift + f for mac
		// ctrl  +  shift + F on windows

		if (total > yourBudget) {
			System.out.println("Out of budget. " );
			System.out.println("You need extra " +(total-yourBudget));
		} else {
			System.out.println("I will take it !!");
		}
		 input.close();
	}

}
