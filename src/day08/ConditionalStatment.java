package day08;

import java.util.Scanner;

public class ConditionalStatment {

	public static void main(String[] args) {
				
		
				
		/*
		 * if(//put some boolean expression in here){
		 * 	 do some action if its true
		 * }else {
		 * 	do something else if its false
		 * }
		 * TASK 1
		 * IMPRIVE THIS CODE WITH SCANNER
		 * then execute below conditional program
		 * 
		 * Task 2 
		 * BestBuy store :		 
		 * declare double variables for price of iphone, Ipad, yourBudget 
		 * assign value for iPhone as 599.99, ipad 899.99
		 * declare 2 more int variables for phoneCount and tabletCount
		 * ask user to enter the budget
		 * ask user to enter quantity you want to buy
		 * calculate the total price
		 * 
		 * write a conditional statement to  check whether total price is more than your budget
		 * if it's more print, "out of budget"
		 * else print "I will take it !!
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is yuor score ?");
		
		int score =input.nextInt();
		
		
		System.out.println("current score is "+score);
		
		if(score >= 60){
			System.out.println("YOU SHALL PASS!");
		}else {
			System.out.println("YOU SHALL NOT PASS !");
		}
		input.close();

	}

}
