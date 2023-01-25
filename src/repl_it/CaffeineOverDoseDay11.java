package repl_it;

import java.util.Scanner;

public class CaffeineOverDoseDay11 {

	public static void main(String[] args) {

		/*
		 * Scientists estimate 10 grams of caffeine consumed at one time is a lethal
		 * overdose.
		 * 
		 * Write a program with a variable that holds the number of milligrams or
		 * caffeine in a drink and outputs how many drinks it takes to kill a person.
		 * 
		 * A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce
		 * cup of coffee has approximately 160 mg of caffeine.
		 * 
		 * In one gram there are 1000 mg.
		 * 
		 * Please refer to the image above as an example and use any number of variables
		 * you want Dots mean a space in the image.
		 */

		// WRITE YOUR CODE HERE:
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink: ");
		// lethal overdose = 10 grams, so we need to convert 10 grams into milligrams
		// that = 10000
		int milligrams = scan.nextInt();
		int drinks = 10000 / milligrams;
		System.out.println("It would take about " + drinks + " drinks for a lethal overdose.");

		scan.close();

	}

}
