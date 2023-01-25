package day12;

import java.util.Scanner;

public class ConditionalReview {

	public static void main(String[] args) {

		// any ternary operator can be turned into if else statement
		// one and only one purpose of ternary operator is conditional assignment
		Scanner input = new Scanner(System.in);
		System.out.println("What is the weather like?");
		String weather = input.next(); // get the weather value from scanner
		String action = null;
		// TASK 1
		/*
		 * check for weather equal to sunny or not and assign the value of --if sunny
		 * assign action value to go out if not assign action value to stay home
		 * 
		 * print out your action after the statement
		 */
		
		//if(weather.equals("sunny"))
//		if (weather.equalsIgnoreCase("sunny")) {
//			action = "go out";
//		} else if (weather.equals("raining")) {
//			action = "stay home";
//		} else if (weather.equals("cloudy")) {
//			action = "play soccer";
//		} else if (weather.equals("windy")) {
//			action = "fly kites";
//		}
		//ALWAYS USE str1.equal(str2) for String equality check
		
		action = (weather.equalsIgnoreCase("sunny")) ? "go out" : "stay home";
		//action = (weather.equals("sunny")) ? "go out" : "stay home";

		System.out.println(action);
		input.close();
	}

}
