package thirdpackage;

public class KahutIt {

	public static void main(String[] args) {
		
		int num1 =5;
		int num2 = 8;
		num2++;
		num1--;
		System.out.println((num1++ > --num2 ? num2 : num1) +10);
		
		String str1 = "Apple";
		String str2 = "apple";
		String str3 = new String("Apple");
		System.out.println(str1 == str3 ? str1 : str2);
		
	}

}
