package repl_it;

import java.util.Scanner;

public class VendingMachineDay11 {

	public static void main(String[] args) {

		/*
		 * Write a program that determines the change to be dispensed from a vending
		 * machine. An item in the machine can cost between 25 cents and 1 dollar, in
		 * 5-cent increments (36, 30,...,90, 95, or 100), and the machine accepts ONLY A
		 * SINGLE DOLLAR BILL TO PAY FOR THE ITEM.
		 */
		// ETNER CODE HERE

		int itemPrice, quarters, dimes, nickels, change;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price in cents: ");

		itemPrice = scan.nextInt();
		if (itemPrice >= 25 && itemPrice <= 100 && itemPrice % 5 == 0) {
			// we are getting amount of change
			change = 100 - itemPrice;
			// 55 / 25 = 2, 70/ 25 = 2, 30/ 25 = 1
			quarters = change / 25;
			// 70 / 25 = 2, remainder = 20 / 10 = 2  no remainder at the end
			dimes = change % 25 / 10;
			// 70 , 25 , remainder = 20/ 10, remainder = 0
			nickels = change % 10 / 5;

			System.out
					.println("Your cange is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels.");

		} else {
			System.out.println("Invalid price!");
		}

		scan.close();
	}

}
