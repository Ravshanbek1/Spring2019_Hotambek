package day09;

public class MultiBranchIfStatementIntro {

	public static void main(String[] args) {
		
		
		//Grade book 
		int score = 84;
		
		// if the score is between 90-100 A
		// if the score is between 80-89 B
		// if the score is between 70-79 C
		// ELSE D and print study harder
		
		if(score >= 90) {
			System.out.println(" YOU GOT \" A\"");
		}else if(score>=80 && score<90) {
			System.out.println(" YOU GOT \"B\"");
		}else {
			System.out.println("study harder");
		}
		
		
	}

}
