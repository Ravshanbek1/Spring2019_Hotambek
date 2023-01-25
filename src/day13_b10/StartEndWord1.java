package day13_b10;

public class StartEndWord1 {

	public static void main(String[] args) {
		
		/*
		 * Write a program CheckWords:   
		 * Program accepts 3 words and:
		 * - if they are same length: 
		 * print "All words are same length" 
		 * - if all different length 
		 * print "All different length"
		 */
		String word1 = "javva";
		String word2 = "apple";
		
		if(word1.length() == 5 && word2.length() == 5) {
			if(word1.charAt(4) == word2.charAt(0)) {
				System.out.println("Fizz");
			}else {
				System.out.println("Buzz - did not match");
			}
		}else {
			System.out.println("need to be exactly 5 chars");
		}

	}

}
