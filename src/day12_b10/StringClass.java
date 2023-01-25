package day12_b10;

public class StringClass {
	public static void main(String[] args) {
		String name = "Ravshanbek";
		/*
		 * 1.Declaring variable -> String name. -> variable name is name and type is
		 * String -> Hey java, I want you to create a variable called name -> that can
		 * store String object 2. Assign value - String object. Anything in double
		 * quotes is String object with that value
		 */
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);// original data Ravshanbek
		name = name.toUpperCase();// update and re-assign to name All caps: Ravshanbek

		System.out.println(name.length());// 10
		System.out.println("java".length());// 4

		int count = name.length();
		System.out.println("Count is "+count);
		System.out.println(name.charAt(0));
		
		if(name.charAt(0)=='R') {
			System.out.println("R is first letter");
		}else {
			System.out.println("R is not first letter");
		}
		char secondChar = name.charAt(1);
		System.out.println(secondChar);
		
	}

}
