package day05;

public class WarmupTask {

	public static void main(String[] args) {
		
		
/*
 *
 The unit price of each vegetable is provided in the above picture
Store each price is one of the primitive data types you learned and print below message.

Expected Result ;

1 Cucumber is 2.5 dollars
4 Tomatoes are 12 dollars
2 Onion is 3 dollars
1 Pepper is 2 dollars
6 Carrot is 24 dollars

declare variables that can old the unit price of each vegetables
assign value according to the picture you saw on the screen
Then print out below message by concatenating the final price of each
		 */
		double cucumber_price = 2.5, tomatoes_price = 12, onion_price = 3, 
			   pepper_price = 2,	carrot_price = 4;
		
		
		System.out.println("1 Cucumber is "+cucumber_price*2.5+"$"+"\n"+"4 Tomatoes are "
		+tomatoes_price*4+"$ "+"\n"+"2 Onion is "+onion_price*2+"$ "+"\n"+"1 Pepper is "+pepper_price+"$ "
		+"\n"+"6 Carrot is "+carrot_price*6+"$");
		
		double total_price = cucumber_price + tomatoes_price*4 + onion_price*2
				+ pepper_price + carrot_price*6;
		
		System.out.println("Total price : "+total_price+"$");
		
		
	}

}
