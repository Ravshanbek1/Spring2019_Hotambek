package day10_B10;

public class Calculator_Day12B10 {

	public static void main(String[] args) {

		double num1, num2, result;
		char operator;

		num1 = 5;
		num2 = 3;
		operator = '!';

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("ERROR: Invalid Operator selected");
			return; //don't run the rest of code below.
				    //get out of main right here.
		}
		System.out.println(result);

	}

}
