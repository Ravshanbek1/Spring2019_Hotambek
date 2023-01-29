package day15;

public class CharToNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first = "Ravshanbek";
		char last = first.charAt(first.length()-1);
		
		char fChar = first.charAt(0);
		
		int lastCharNum = last ;
		System.out.println(lastCharNum);
		
		int firstCharNum = fChar ;
		System.out.println(firstCharNum);
		
		System.out.println(fChar + last);
		
		System.out.println(""+fChar + last);

		
		

	}

}
