package day08;

public class LogicalOperatorPractice {

	public static void main(String[] args) {
		
		int score = 10;
		boolean result1 = score > 4 ; // 10>4 true
		boolean result2 = score > 4 && score < 11; //10>4 && 10<11 true
		
		boolean result3 = score > 14 && score < 11; //10>14 && 10<11 false
		boolean result4 = score > 14 || score < 12; //10>14 || 10<12 true
		
        //boolean result5 = score++ > 10 && score < 11; // 10>10 && 11<12 false
	    //boolean result5 = ++score > 10 && score < 11; // 11>10 && 11<12 true
		//boolean result5 = score++ > 10 || score < 12; // 10>10 || 11<12   true
		
		//boolean result5 = score++ > 10 && ++score <13;//10>10 false so it will not evaluate next one 
		//boolean result5 = score++ > 10 & ++score <13; //10>10 & 12<13 
		
		boolean result5 = score >9 || score <1; //10>9 & 10<1 true  
		//boolean result6 = ! true && true;
		
		boolean result7 = (score > 5) && (6 > 5); //true true-->true
		boolean result8 = (score > 5) && !(6 > 5);//true false->false
		
		boolean result9 = (score > 5) && (score > 11) && (score/2 == 5);//true false->false
		boolean result10= (score > 5) && (score <= 11) && (score/2 ==5);//true true true->true
		
		System.out.println(true && false || true);
		
		//System.out.println(true || false && false);
		
		//precedence
		                  //false   or true      and  true      
		System.out.println(score>10 || (score==10 && score >5));
		
		//System.out.println("the value of score right now : " + score); 
		
		System.out.println("result1 is " + result1);
		System.out.println("result2 is " + result2);
		System.out.println("result3 is " + result3);
		System.out.println("result4 is " + result4);
		System.out.println("result5 is " + result5);
		//System.out.println("result6 is " + result6);
		System.out.println("result7 is " + result7);
		System.out.println("result8 is " + result8);
		System.out.println("result9 is " + result9);
		System.out.println("result10 is "+result10 );



	}

}
