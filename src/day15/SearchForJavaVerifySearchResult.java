package day15;

public class SearchForJavaVerifySearchResult {

	public static void main(String[] args) {
		
		// About 813,000,000 results (0.56 seconds) 
		// store above String and validate
		// it starts with word About, and it contains word result
		
		String str = "About 813,000,000 results (0.56 seconds)";
		
		// how to get certain part of String
		// 
		// if(str.indexOf("About")==0) 
		if(str.substring(0, 5).equals("About")) {
			System.out.println("it started with About");
		}else {
			System.out.println("didn't pass");
		}
		if(str.indexOf("result")>=0) {
			System.out.println("it contains result");
		}else {
			System.out.println("no result");
		}
	}

}
