package day11;

public class SingleStatement {

	public static void main(String[] args) {

		int x = 100;
//
//		if (x != 100)
//			System.out.println("NOT A 100");
//		else
//			System.out.println("YES 100");

		
		if (x > 100)
			System.out.println("more than 100");
//		System.out.println("something else");
//		
//		// &&, & ||, | , !
//		System.out.println(true || false);
//		System.out.println(true && false);
//		System.out.println(! false );
		
		// 100
		 // FALSE
//		if(x>100 & ++x<200) {
//			System.out.println("both are true");
//		}
		
		// 100
		  //true
//		if(x==100 || ++x<200) {
//			System.out.println("both are true");
//		}
		
		if(x==100 | ++x<200) {
			System.out.println("both are true");
		}
		
		System.out.println(x);
	}

}
