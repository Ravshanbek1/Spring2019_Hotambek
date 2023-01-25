package day07review;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//int b = 10;
		
		// b++	(post increment)
		   // increment b value by 1
		   // and tell me the result next time 
		   // b showed up	
		   //++b PRE-increment
		   // increment b value right away
		   // and show the result right away
		
		//System.out.println(++b);
		//System.out.println(b);
		
		int x = 3;
		
		// int result = x++ +5; // 3+5
		//int result = ++x + 5;
		
		//x = x++ + ++x; // 3 + 5 = 8
		x = x++ + --x + x-- + x; // 3 + 3 + 3 + 2 + 11
		//step 1 x++ --> 3
		//but next time it shows up it will  be 4
		//step 2 --x at this moment x showed up so value of x is 4
		//     since currently x = 4 -> --x will immediatly generate x = 3
		
		//step 3 x-- --> 3 when x shows up again next time it will be 4
		//step 4 x = 2
		
		//System.out.println(result);
		System.out.println(x); // 4

	}

}
