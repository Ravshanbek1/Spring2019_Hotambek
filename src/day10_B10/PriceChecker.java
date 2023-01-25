package day10_B10;

public class PriceChecker {
	public static void main(String[] args) {
		/*
		 * item -> 1 - 50 -> "Cheap" -> 51 - 100 -> "Expensive" -> "Not buying"
		 */

		int price = 00;
		String status;

		if (price >= 1 && price <= 50) {
			status = "Cheap";
		} else {
			if (price >= 51 && price <= 100) {
				status = "Expensive";
			} else {
				status = "not buying";

			}
		}
		System.out.println("Status with if: "+status);
		
		status = (price >= 1 && price <= 50)? "Cheap" : 
			(price >= 51 && price <= 100)? "Expensive" : "Not buying";
		
		System.out.println("Status with ?: "+status);

	}

}