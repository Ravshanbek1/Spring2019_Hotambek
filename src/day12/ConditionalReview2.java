package day12;

import java.util.Scanner;

public class ConditionalReview2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is the weather like?");
		String weather = input.next(); // get the weather value from scanner
		String action = null;
		
		//ALWAYS USE str1.equal(str2) for String equality check
		// add 2 more condition nice or warm
		
		if (weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("nice")) {
			action = "go out";
		}else {
			action="stay home";
		}
		     //TERNARY WAY//
		action = (weather.equalsIgnoreCase("sunny") || weather.equalsIgnoreCase("nice"))? "go out" : "stay home";
		
		System.out.println("THE ACTION according to weather is : " +action); 		
		
		input.close();

	}

}
