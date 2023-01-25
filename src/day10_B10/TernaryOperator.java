package day10_B10;

public class TernaryOperator {

	public static void main(String[] args) {
		
		/*
		 * max score 100. Passing score is 60		 
		 * 
		 * 1. do using if else
		 * 
		 * 2. Using ? (ternary operator)
		 */
		int score = 50;
		String status ;
		
		if(score>=60 ) {
			status = "pass";			
		}else{
			status = "fail";			
		}
		
		status = (score >= 60)? "pass" : "fail";
		System.out.println(status);
		
		/*
		 * boolean variable express
		 * if true => shipping = $25
		 * if false -> shipping $15
		 */
		//int shipping = 15;
		boolean express = true;
		
		System.out.println((express)? 25 : 15);
		
		int shipping = (express == true) ? 25 : 15;
		
		System.out.println(shipping);
	}

}
