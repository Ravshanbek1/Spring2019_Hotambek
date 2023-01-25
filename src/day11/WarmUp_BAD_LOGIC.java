package day11;

import java.util.Scanner;

public class WarmUp_BAD_LOGIC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num % 5 ==0) {
			System.out.println("fizz");
		}else if(num % 3 == 0) {
			System.out.println("buzz");
		}else if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("vizz buzzzz");
			}else {
				System.out.println("NOT A FIZZ BUZZ NUMBER");
			}
		
		scan.close();
	}

}
