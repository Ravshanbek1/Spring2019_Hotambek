package repl_it;

import java.util.Scanner;

public class day10if_statement {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("----------------");
		System.out.println("select an option:");
		System.out.println("1) option 1");
		System.out.println("2) option 2");
		System.out.println("3) option 3");
		System.out.println("-------------");

		int choice = s.nextInt();

		// your code here

//		if(choice==1) {
//			System.out.println("user selected 1");
//		}else if(choice==2) {
//			System.out.println("user selected 2");
//		}else if(choice==3) {
//			System.out.println("user selected 3");
//		}else {
//			System.out.println("invalid number.");
//		}

		if (choice > 0 && choice <= 3) {
			System.out.println("user selected " + (choice));
		} else {
			System.out.println("invalid selection!");
		}
		
		s.close();
	}

}
