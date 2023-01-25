package day07review;

public class StringPractice {

	public static void main(String[] args) {
		
		// the output expected is ---> "Java"
		String name = "I love \"Java\" ";		
		System.out.println(name);

		// the output expected is ---> I love /java"
		String name2 = "I love \\Java ";
		System.out.println(name2);
		
		String sentence = " \" Stay Positive \" ";
		System.out.println(sentence);
		
		// my name is "Mustakil"
		
		//IN ORDER TO HAVE quotation inside your string
		//you need to add \ before to to tell compiler it's not end of the String
		//but just treat it as normal quotation character
		// \" will generate " in the output
		// same goes for \ itself -->> \\ will generate \ in output 
		
		String name3 = "Mustakil";
		System.out.println("ny name is \""+name3 + "\" ");
		
		System.out.println(" JAVA IS\n COOL");
		
	}

}
