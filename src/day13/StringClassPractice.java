package day13;

import java.util.Scanner;

public class StringClassPractice {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "ABC";

		boolean b1 = s1.equals("abc");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println(s1 + " ---uper case "+s1.toUpperCase());
		System.out.println(s1 + " ---lower case "+s1.toLowerCase());
		
		// get a certain character inside a str
		// "abc" ---> a is at position 0 b 1 , c2
		
		char c1 = s1.charAt(0); // first character
		char c2 = s1.charAt(1); // second character 
		char c3 = s1.charAt(2); // third character
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// getting the length of String object
		//s1.length(); --> gets count of the characters
		
		int countOfCharacter = s1.length();
		System.out.println(countOfCharacter);
		
		//TASK 1
		//Ask user for two names
		//check for the equality without caring about the case print result
		
		//also compare the length of the names
		// if name 1 has more character ---> print second character of name1
		// else print 3rd character of name2
		
		/*
		 * OPTIONAL
		 * store the last character of name 2 in  char variable
		 * and create switch statement to check few cases as below
		 * 
		 * case 'a' --> print name ended with a
		 * case 'b' --> print name ended with b
		 * case 'c' --> print name ended with c
		 * if no match print did not get abc
		 */
		
		
		// how do we get last character index of any String s1.length() -1
		// int lastCharIndex = count1=1;
		// char lastChar = name1.charAt(lastCharIndex);
		
		//how do we  get first character of any String
		//s1.charAt(0);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name1: ");
		String name1 = scan.next();
		System.out.println("Enter name2: ");
		String name2 = scan.next();	
		
		System.out.println("IS IT SAME name > : "+ name1.equalsIgnoreCase(name2) );
		
		int count1 = name1.length();
		int count2 = name2.length();
		
		if(count1>count2) 
			System.out.println(name1.charAt(1));
		else 
			System.out.println(name2.charAt(2));
		
		System.out.println("character is "+((count1>count2)? name1.charAt(1) : name2.charAt(2)));
		
		int lastCharIndex = count1-1;
		char lastChar = name1.charAt(lastCharIndex);
		
		System.out.println("last char of name1 is "+lastChar);
		
		switch(lastChar) {
		
		case 'a':
			System.out.println("name as ended with a");
			break;
		case 'b':
			System.out.println("name as ended with b");
			break;
		case 'c':	
			System.out.println("name as ended with c");
			break;
			default:
				System.out.println("NOT MATCH AT ALL ");
		
		}
		
		
		scan.close();
		
		
		

	}

}
