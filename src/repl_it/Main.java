package repl_it;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * use Scanner object and ask user to enter 3 items followed by its price and
		 * you will calculate total price and show as a report. Declare double variables
		 * price1, price2, price3, totalPrice
		 * 
		 * Create a Scanner object named scan.
		 * 
		 * Execution flow with example:
		 * 
		 * Display prompt "Enter Item1 and its price :" tomatoes 5.5
		 * 
		 * Display prompt "Enter Item2 and its price :" Cheese 3.5
		 * 
		 * Display prompt "Enter Item3 and its price :" Apples 6.3
		 * 
		 * calculate totalPrice for all items
		 * 
		 * build the report variable by concatenating Strings and double values:
		 * 
		 * "Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
		 * "Total price: 15.3"
		 */
		String item1 = "Tomatoes", item2 = "Cheese", item3 = "Apples";

		double price1, price2, price3, totalPrice;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Item1 and its price: ");

		price1 = scan.nextDouble();
		System.out.println(item1 + " Price " + price1);

		System.out.println("Enter Item2 and its price : ");
		// item2=scan.next();
		price2 = scan.nextDouble();
		System.out.println(item2 + " Price " + price2);

		System.out.println("Enter Item3 and its price : ");
		price3 = scan.nextDouble();
		System.out.println(item3 + " Price " + price3);

		totalPrice = price1 + price2 + price3;

		System.out.println("Item1: " + item1 + " Price: " + price1 + "," + "\nItem2: " + item2 + " Price: " + price2
				+ "," + "\nItem3: " + item3 + " Price: " + price3 + ",\nTotal price: " + totalPrice);

		scan.close();

	}

}
