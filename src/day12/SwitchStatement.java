package day12;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("how is weather today?");

		String weather = s.next();
			   weather = weather.toLowerCase();	
		
		switch (weather) {
		case "sunny":
			System.out.println("go swimming");
			break;
		case "windy":
			System.out.println("go fly a plane");
			break;
		case "rainy":
			System.out.println("stay home");
			break;
		case "snowy":
			System.out.println("go snowboarding");
			break;
		default:
			System.out.println("are you sure this is a right weater?");
			break;
		}

//		if (weather.equals("sunny")) {
//
//			System.out.println("go swimming ");
//
//		} else if (weather.equals("windy")) {
//
//			System.out.println("go fly a plane ");
//
//		} else if (weather.equals("rainy")) {
//
//			System.out.println("stay home ");
//
//		} else if (weather.equals("snowy")) {
//
//			System.out.println("go snow-boarding ");
//		}else {
//			System.out.println("are sure this is the right weather?");
//		}		

		s.close();
	}

}
