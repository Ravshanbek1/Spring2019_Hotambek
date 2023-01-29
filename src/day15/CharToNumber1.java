package day15;

public class CharToNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'A';
		int cNum = c1;
		System.out.println(cNum);
		
		// Task 2
		// store your name into a variable
		// get you first and last character
		// and find out:
		// what's the ascii value / number representation of those  character
		
		String name = "Ravshanbek";
		
		char firstChar = name.charAt(0);
		char lastChar = name.charAt(name.length()-1);
		
		int a1 = firstChar;
		int a2 = lastChar;
		
		System.out.println(a1);
		System.out.println(a2);
		
		char characterA = 'A';
		System.out.println((int) characterA);
		

	}

}
