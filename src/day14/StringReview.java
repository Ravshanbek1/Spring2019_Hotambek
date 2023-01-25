package day14;

public class StringReview {

	public static void main(String[] args) {
		
		/* String class mehtod
		 * 1, length(); ->  
		*/
		//String name = "Mamatjan";
//		System.out.println(name.length());
//		
//		System.out.println(name.toUpperCase());
//		
//		System.out.println(name.toLowerCase());
//		
//		char secondChar = name.charAt(1);
//		System.out.println(name.charAt(1));
//		System.out.println(secondChar);
//		
//		int lastIndex = name.length()-1;
//		System.out.println(name.charAt(lastIndex));
//		
		/*length() taking no external data 
		 * 		and returning a number
		 * 
		 * 1st character index is always 0
		 * last character index is always one less than
		 * 	actual count of character
		 *   int lastIndex = str.length()-1;
		 * 
		 * charAt(1) taking 1 external data / argument
		 * 		and returning a character
		 * 
		 * str.charAt(lastIndex)
		*/
//		System.out.println(name.equals("Mamatjan"));
//		System.out.println(name.equalsIgnoreCase("Mamatjan"));
		
		//contains();
		String name = "Mamatjan";
		
		boolean conatainsOrNot = name.contains("aam");
		System.out.println(conatainsOrNot);
		
		// indexOf();
		// return the first occurance of the string given
		// if it does not exist it will return -1
		System.out.println(name.indexOf("am"));
		System.out.println(name.indexOf("t"));
		System.out.println(name.indexOf("samatjan"));
		System.out.println(name.indexOf("Mamatjan"));
		System.out.println(name.indexOf("mamatjan"));
		
		String uName = name.toUpperCase();
		System.out.println(uName.indexOf("MAMATJAN"));
		
		//optional
		System.out.println(name.toUpperCase().indexOf("MA"));



	}

}
