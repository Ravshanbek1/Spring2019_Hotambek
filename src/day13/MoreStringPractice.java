package day13;

public class MoreStringPractice {

	public static void main(String[] args) {
		
		// s1.contains("something") ---> check for specified letter in the string inside ("letter") returns true or false
		// s1.indexOf("s") ---> this will give position of specified letter of the string
		
		String s1 = "Zuhkra";
		boolean uExistsOrNot = s1.contains("u");		
		
		System.out.println("does name contains u " + uExistsOrNot);
		
		System.out.println("what is the position of u : " + s1.indexOf("u"));
		
		// subString(beginning index , ending index )
		// it will return part of a string starting from beginning till right before ending index
		
		// 012345
		//"Zuhkra ; substring(1, 4) ---> u
		
		String partOfString = s1.substring(1, 4);
		System.out.println(partOfString);
		
		// 0123456
		// SAYYARA
		
		String s2 = "SAYYARA";
		String yarString = s2.substring(3, 6);
		System.out.println(yarString);
		
		
		

	}

}
