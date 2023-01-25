package day13_b10;

public class StringEquality {

	public static void main(String[] args) {
		
		/* COMPARING STRINGS
		 * == is a operator to  check if 2 values are same.
		 * But == works as expected wit hprimitives only.
		 * 
		 * 100 == 100 //true
		 * int n1 = 20;
		 * int n2 = 30;
		 * n1 == n2 //false		 * 
		 * 
		 * 1. example
		 * String str1 = "abc";
		 * String str2 = "abc";
		 * 
		 * str1 == str2; //true
		 * 
		 * 2. example
		 * 
		 * String str1 = new String("abc");
		 * String str2 = "abc"'
		 * 
		 * str1 == str2; //false
		 * 3. example
		 * String str1 = new String("abc");
		 * String str2 = new String("abc");
		 * 
		 * str1 == str2;//false
		 * 
		 * equals methods
		 * 
		 * /* COMPARING STRINGS
		 * == is a operator to  check if 2 values are same.
		 * But == works as expected wit hprimitives only.
		 *  
		 * 1. example
		 * String str1 = "abc";
		 * String str2 = "abc";
		 * 
		 * str1.equals(str2); //true
		 * 
		 * 2. example
		 * 
		 * String str1 = new String("abc");
		 * String str2 = "abc"'
		 * 
		 * str1.equals(str2); //true
		 * 3. example
		 * String str1 = new String("abc");
		 * String str2 = new String("abc");
		 * 
		 * str1.equals(str2); //true
		 * 
		 * ===========================
		 * == operator for comparing objects.
		 * 
		 * When comparing objects ex: Strings
		 * == does not compare the value within the strings/ objects.
		 * 
		 * == will only compare if 2 variables are printing to 
		 * same object in memory.
		 * 	will only check if both object memory locations
		 * 	are same.
		 * 
		 * For that reason, when we do:
		 * str1 == str2 ; it is only  checking if both
		 * strings are same in memory.
		 * 
		 * Do not use == to compare strings or any other 
		 * objects. Unless you want to test if they are same
		 * in memory.
		 * 
		 * .equals();
		 * .equalsIgnoreCase() // abc vs ABC -- same
		 * 
		 */
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2);
		
		String str3 = new String("abc");
		String str4 = "abc";
		System.out.println(str3 == str4);		
		
		String str5 = new String("abc");
		String str6 = new String("abc");
		System.out.println(str5 == str6);
		
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str5.equals(str6));
		
		
		
		
	}

}
