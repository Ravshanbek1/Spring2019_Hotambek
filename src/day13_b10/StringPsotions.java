package day13_b10;

public class StringPsotions {

	public static void main(String[] args) {
		/**/
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";		
		System.out.println(alphabet.indexOf("A"));
		int pPosition = alphabet.indexOf("P");
		System.out.println("P is at index " + pPosition);
		
		//HIJ location in alphabet
		int hijLocation = alphabet.indexOf("HIJ");
		System.out.println(hijLocation);
		
		String sentence = "Today is Sunday and tomorrow is Monday .";
		
		System.out.println(sentence.indexOf("Sunday"));
		
		System.out.println(sentence.indexOf("a"));// 3
		
		System.out.println(sentence.lastIndexOf("a"));// 36
		System.out.println(sentence.indexOf("y", 6));// 14
		
		System.out.println(sentence.indexOf("tomor"));
		
		System.out.println(sentence.indexOf("is M"));
		
		if(sentence.indexOf("AND") >= 0) {
			System.out.println("Word is there");
		}else {
			System.out.println("Word is not there");
		}
		
		String searchResults = "1-16 of over 30,000 results for \"speakers\"";
		int pos = searchResults.indexOf("of");
		if(pos == 5) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}

}
