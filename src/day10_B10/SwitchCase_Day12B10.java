package day10_B10;

public class SwitchCase_Day12B10 {

	public static void main(String[] args) {
		// 1 - Lobby, 2 - Google, 3 - Cybertek, 4 - Apple
		int floor = 7;
		
		if(floor==1) {
			System.out.println("Lobby");
		}else if(floor==2) {
			System.out.println("Google");
		}else if(floor==3) {
			System.out.println("Cybertek");
		}else if(floor==4) {
			System.out.println("Apple");
		}else {
			System.out.println("No such floor");
		}
		
		switch (floor) {
		case 1:
			System.out.println("Lobby");
			break;
		case 2:
			System.out.println("Google");
			break;
		case 3:
			System.out.println("Cybertek");
			break;
		case 4:
			System.out.println("Apple");
			break;
			default:
				System.out.println("No Such floor");
		}
	}

}
