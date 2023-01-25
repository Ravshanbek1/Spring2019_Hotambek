package day12_b10;

import java.util.Scanner;

public class Directions {

	public static void main(String[] args) {
		
		//Warm up
		//else if
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter starting point.");
		char startingPoint = scan.next().charAt(0);
		char destination = scan.next().charAt(0);
		
		if(startingPoint=='a' && destination=='b') {
			System.out.println("go right");
		}else if(startingPoint=='a' && destination=='c') {
			System.out.println("go right and down");
		}else if(startingPoint=='a' && destination=='d') {
			System.out.println("go right, go down, go left");
		}else if(startingPoint=='b' && destination=='c'){
			System.out.println("go down");
		}else if(startingPoint=='b' && destination=='d') {	
			System.out.println("go down, go left");
		}else if(startingPoint=='b' && destination=='a') {
			System.out.println("go down, go left, go up");
		}else {
			System.out.println("Invalid input");
		
		
		
		
		scan.close();
		
		}
	}

}

