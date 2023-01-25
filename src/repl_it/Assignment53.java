package repl_it;

import java.util.Scanner;

public class Assignment53 {

	public static void main(String[] args) {

		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		int memory = 0;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();
		if (screenSize == 13.3) {
			price += 200;
		} else if (screenSize == 15) {
			price += 300;
		} else if (screenSize == 17.3) {
			price += 400;
		}
	//==========================================================screen size
		System.out.println("Select CPU type:");
		cpu = scan.next();
		if (cpu.equals("i3")) {
			price += 150;
		} else if (cpu.equals("i5")) {
			price += 250;
		} else if (cpu.equals("i7")) {
			price += 350;
		}
	//==========================================================CPU type
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		price = price + (ram / 4 * 50);
	//==========================================================RAM size
		System.out.println("Select storage type:");
		storageType = scan.next();
		if (storageType.equals("HDD")) {
			System.out.println("Enter memory size:");
			memory = scan.nextInt();
			price = price + (memory / 10);
		} else if (storageType.equals("SSD")) {
			System.out.println("Enter memory size:");
			memory = scan.nextInt();
			price = price + (memory / 5);
		}
	//==========================================================Storage type
		System.out.println("Enter screen resolution:");
		screenType = scan.next();
		if (screenType.equals("FULLHD")) {
			price += 100;
		} else if (screenType.equals("4K")) {
			price += 200;
		}
		System.out.println("Laptop price is: $" + price);
	//==========================================================Screen resolution

		scan.close();
	}

}
