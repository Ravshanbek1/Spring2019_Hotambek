package day08;

public class TypeConversion {
	
	// Type casting
	// Converting from one data type to another data type
	// converting from smaller data type to bigger type is called type widening/ down-casting
	//down-casting require explicit casting operation for example
	//long grande = 1000L ; int medium = (int) grande ;
	
	

	public static void main(String[] args) {
		
		int medium = 10;
		// byte      , short  , int     , long
		// tinyTall  , tall   , medium  , grande // star bucks cup size
		
		//long grande = 10L;
		long grande = medium;
		System.out.println(grande);
		
		// byte widening / up-casting
		
		//short tall = 5L; cannot put a long value inside any variable that has smaller range
		
//		short tall = (short) grande; // type narrowing / down casting
//		
//		double superGrande = 15.67d ;
//		int mediumCup = (int) superGrande ;
		
		//System.out.println(mediumCup);
		
		byte tinyExpressoCup = 120;  
		
		// type widening / up-casting
		//this will happens implicitly / automatically (by compiler)
		int mediumCup = tinyExpressoCup ; 
		
		System.out.println(mediumCup);
		
		

	}

}
