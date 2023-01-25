package mysecondtpackage;

import java.util.Scanner;

public class Mar06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your city? ");
		String city = scan.nextLine();
		System.out.println("What is your occupation? ");
		String occupation = scan.nextLine();
		System.out.println("My city is: "+city+", and my occupation is: "+occupation);
		
		
		
		scan.close();
	}

}
