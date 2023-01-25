package officehours;

import java.util.Scanner;

public class March6 {
	public static void main(String[] args) {
		// shorthand operators

		int a = 5;
		int b = 10;
		int result = 0;

		result = a + b;
		System.out.println(result);
		int c = 3;
		result = result - c;
		// -=, +=, /=, *=, %= shorthand operators
		result -= c; // result -= c; it's the same as result = result - c;
		System.out.println(result);
		result += b;
		System.out.println(result);
		result *= b;
		System.out.println();
		// post increment operation
		// this way we can increase value by 1
		// result++; same as result = result + 1;
		result++;
		System.out.println(result);
		// this way we can decrease value by 1
		result--;
		// result-- the same as result = result - 1;
		System.out.println(result);
		// shortcut for import in eclipse control + shift + o

		// we are creating scanner object
		Scanner scan = new Scanner(System.in);
		// take one word from the console
		System.out.println("Please enter your hometown: ");
		// if we have more than one word, we need to use nextLine();

		String word = scan.nextLine();
		System.out.println("Are you serious ?");
		boolean bool = scan.nextBoolean();
		System.out.println("My hometown is: " + word);
		System.out.println(bool);

		scan.close();
	}

}
