package day13_b10;

//import java.util.Scanner;

public class StartEndWords {

	public static void main(String[] args) {
		/*
		 * Write a program StartEndWords: 
		 * you have 2 words that must be 5 characters and
		 * check if last letter of first word and first letter of second word are same.
		 * 		if either one not 5 chars length: 
		 * 			print "need to be exactly 5 chars length"
		 * 		if last letter of 1st word and 1st letter of 2nd word match print "Fizz" if
		 * they do not match 
		 * print "Buzz - did not match"
		 */
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter 1st word that consists 5 characters:");
//		String firstWord = scan.next();
//		System.out.println("Enter 2nd word that consists 5 characters:");
//		String secondWord = scan.next();
		
		String word1 = "javva";
		String word2 = "appl";
		
		if(word1.length() != 5 || word2.length()!= 5) {
			System.out.println("need to be exactly 5 chars");
		}else if(word1.charAt(4) == word2.charAt(0)){
			System.out.println("Fizz");
		}else {
			System.out.println("BUZZ - did not match");
		}
		
		
		//scan.close();
		
	}

}
