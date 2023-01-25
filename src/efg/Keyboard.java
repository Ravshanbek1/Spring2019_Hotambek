package efg;

public class Keyboard {

	public static void main(String[] args) {
		
		//What is JVM?
		System.out.println(" What is JVM ?");
		System.out.println(" What is JRe ?");
		System.out.println(" What is JDK ?");
		
		// in order to just run java application what do we need ?
		//JRE --
		//in order to just develop java application what do we need ?
		//JDK
		
		//JDK has JRE , JRE has JVM
		
		/*
		 * Variable : a container or storage to store piece of data with certain taype
		 * declaring a variable : dataType variableName ;
		 */
//		int count = 0 ; // declaring variable
//		count = 10; //assignment, literal value 
		
		int score = 100; //declaring and assigning in one statement 
		
		int x, y , z;
		x = 10;
		 y = 20;
		 z = 30;
		 
		 z = x + y ;
		 
		 // once you use one variable name , you can not reuse that 
		 //variable in same block
		 score =  200 ;
		 
		 System.out.println(z);
		 System.out.println(score);
		 
		 /*
		  * Naming variable 
		  * is this a valid name for a variable
		  * int abc; ---good
		  * int 123 ; ----bad
		  * int a123; ---good
		  * int _a ; good
		  * int $; ----good but not recommended
		  * int a-b ; ----bad
		  * int _123 ; ---good not recommended
		  * 
		  * Rules:
		  * Reserved keywords should be avoided :Systsem public class
		  *  you can use letters a-z A-Z
		  *  numbers, (just don't start with number)
		  *  only 2 special character _$
		  * 
		  * Guideline : 
		  * 	for more than one word , use camel case int gameScore
		  * 	make your variable name tell what do you wanna store
		  *     int countOfOnlineStudent = 300;
		  *     
		  *     Naming a class
		  *     Reserved keywords should be always avoided
		  *     It should be whole word without space
		  *     
		  *     Guideline : 
		  *     It should always start with Uppercase , the rest can be lower case
		  *     if you have multip;e word , it can be camelCase
		  *     Car Boat , ComputerMonitor
		  *     
		  *     package naming:
		  *     Reserved keywords should be always avoided
		  *     It should be whole word without space
		  *     
		  *     name is always encourage to be lower case
		  */
//		 byte   b=127;
//		 short  s=32767;
//		 int    i=255555555;
//		 long   l=180000000000L;
//		 
		 

	}

}
