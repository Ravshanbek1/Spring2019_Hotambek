package day10_B10;

import java.util.Scanner;

public class FindASeason {

	public static void main(String[] args) {

		/*
		 * 1. Find a season. month -> number and find the season of the year for that
		 * month number.
		 */
		int month;
		Scanner scan = new Scanner(System.in);

		System.out.println("Type the number from 1 - 12 to find out the season of the year: ");

		month = scan.nextInt();

		if (month == 12 || month == 1 || month == 2) {
			System.out.println("It is Winter.");
		} else if (month >= 3 && month <= 5) {
			System.out.println("It is Spring.");
		} else if (month >= 6 && month <= 8) {
			System.out.println("It is Summer.");
		} else if (month >= 9 && month <= 11) {
			System.out.println("It is Autumn.");
		} else {
			System.out.println("Invalid month 1 - 12 eccepted");
		}
		 scan.close();
	}

}
