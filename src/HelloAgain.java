
public class HelloAgain {

	public static void main(String[] args) {
		
		System.out.println("Hello again running");
		System.out.println("Hello at last");
		
		int k, m;
		k = 100;
		m = 200;
		
		k=300; // re - assignment
		k = m;
		// int k ; we cannot reuse the variable name in same block
		
		System.out.println(k);
		System.out.println(m);
	}

}
