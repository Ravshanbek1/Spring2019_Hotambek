package day14_B10;

public class SubStringExamples {

	public static void main(String[] args) {
		// substring gets part of a string
		// there are two versions, 1 takes 1 int, 1 takes 2 ints
		// if it takes 1 int, it means starting point
		// we cannot give a number bigger than the length, it will throw exception
		// if we give number equal to the length, it will return empty string
		String str = "donaldtheduck@gmail.com";
		System.out.println(str.substring(14));
		
		System.out.println(str.substring(4, 5));

	}

}
