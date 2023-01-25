package day05;

// import scanner class to define the location
import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		
		// Create a Scanner object		
		Scanner userInput = new Scanner(System.in);
		
		// ask user questions
		System.out.println("Enter name please : ");
		
		//store user input
		//next() method will read one word
		String name = userInput.next();
		
		//nextLine() method will read one whole line
		//String sentence = userInput.nextLine();
		
		//print what user input
		System.out.println("You have entered : " + name);
		
		userInput.close();
	}

}
