package day14;

public class MoreStringMethods {

	public static void main(String[] args) {
		
		// substring(beginningIndex, EndingIndex)
		// beginning index is always inclusive
		// ending index is always exclusive
		
		//             012345 
		//String name = "Merzet";
		
		//                                rze
		//System.out.println(name.substring(2, 5));
		
		//System.out.println(name.substring(1, 6));

		// Task 1
		// store your name into A String
		// print your last character
		// print your first 2 character
		
		// OPTIONAL
		// print your name starting from middle till the end
		//              0123456789 
		String name1 = "Ravshanbek";
		int count = name1.length()-1;
		System.out.println(name1.substring(count-1, count));
		//System.out.println(name1.substring(9, 10));
		System.out.println(name1.substring(0, 2));
		//System.out.println(name1.substring(5, 10));
		double midPoint = count/2;
		System.out.println(midPoint);
		
		System.out.println(name1.substring((int) midPoint, count));
		

	}

}
