package day10_B10;

import java.util.Scanner;

public class Grades_Day12B10 {

	public static void main(String[] args) {
		/*
		 * A -> Excellent
		 * B -> Good
		 * C -> Acceptable
		 * D -> Poor
		 * Anything else -> ERROR: invalid grade
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Grade:");
		char grade = scan.next().charAt(0); //get a Char from a Scanner
		
		switch(grade) {
		case 'A':
		case 'a':	
			System.out.println(grade+" -> Excellent " );
		break;
		case 'B':
			System.out.println(grade+" -> Good ");
		break;
		case 'C':
			System.out.println(grade+" -> Acceptable");
		break;
		case 'D':
			System.out.println(grade+" -> Poor");
		break;
		default:
			System.out.println("ERROR: invalid grade");
		}
		scan.close();

	}

}
