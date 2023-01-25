package day13_b10;

import java.util.Scanner;

public class CheckWords {

	public static void main(String[] args) {
		/*
		 * Write a program CheckWords:   
		 * Program accepts 3 words and:
		 * - if they are same length: 
		 * print "All words are same length" 
		 * - if all different length 
		 * print "All different length"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 words");
		String word1 = scan.next();

		System.out.println("Enter the 2nd word: ");
		String word2 = scan.next();

		System.out.println("Enter the 3rd word: ");
		String word3 = scan.next();

		int lengthWord1 = word1.length();
		int lengthWord2 = word2.length();
		int lengthWord3 = word3.length();

		if (lengthWord1 == lengthWord2 && lengthWord2 == lengthWord3) {
			System.out.println("All words are same length");
		} else if (lengthWord1 == lengthWord2 
				|| lengthWord1 == lengthWord3 
				|| lengthWord2 == lengthWord3) {
			System.out.println("Not Same nor Different lengths");
		} else {
			System.out.println("All are different length");
		}

		scan.close();

	}

}
