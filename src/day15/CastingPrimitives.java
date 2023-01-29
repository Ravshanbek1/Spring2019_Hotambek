package day15;

public class CastingPrimitives {

	public static void main(String[] args) {
		// char, boolean, byte, short, int, long, float, double
		
		//type conversion - casting
		
		// byte -> int up-casting / type widening
		// this happens implicitly by compiler
		byte b = 12;
		int i = b;
		int y = (int)b; // explicit casting - by programmer
		//System.out.println(i+y);
		// int -> byte downcasting / type narrowing
		
		int a = 20;
		byte c = (byte)a;
		double d = 12.12;
		int k = (int) d;
		System.out.println(c);
        System.out.println(k);
		
		
	}

}
