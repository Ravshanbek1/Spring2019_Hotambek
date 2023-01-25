package day08;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		
		
		
		// Logical AND operator & && 
		//(as long as one is false WHOLE WILL BE FALSE
		
		// Logical OR  operator | ||
		//as long as one operand is TRUE WHOLE THING WILL BE TRUE
		// ONLY WHEN both operands are false then WHOLE THING WILL BE FALSE
		
		// Logical NOT operator    !
		
		/*difference between single & | and double && || is 
	      && will only evaluate first part if the whole result can be decided
		  just using the first boolean value
          & will  check for both side whether it  can be already decided using
	      boolean value

		 * */
		

		System.out.println("result of (true && true)"+ (true && true));
		//System.out.println("result of (false && true)"+ (false && true));
		System.out.println("result of (true && true)"+ (true && false));
		//System.out.println("result of (false && false)"+ (false && false));
		
		System.out.println("-------------------------------");
		
		//System.out.println("result of (true || true)"+ (true || true));
		System.out.println("result of (false || true)"+ (false || true));
		//System.out.println("result of (true || true)"+ (true || false));
		System.out.println("result of (false || false)"+ (false || false));
		
		System.out.println("result of !true " +(!true));
		System.out.println("result of !false "+ (!false));


		

	}

}
