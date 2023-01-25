package day10_B10;

import java.util.Scanner;

public class CheckClass_WUDay12B10 {

	public static void main(String[] args) {
		/*Warm up task:
		 * Write a program called checkClass
		 * We have a day with a number in it
		 * and we  check what day it is
		 * String classAtSchool = "Group Project"
		 * String WeekdayName = "Monday";
		 * day 1 -> classAtSchool = "Group Project"
		 * 	 WeekdayName = "Monday"
		 * 
		 *  day 2 -> classAtSchool = "Java"
		 *   WeekdayName = "Tuesday"	
		 *   
		 *   Print message -> It is Tuesday and Java class	 
		 */
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Day: ");
			int day = scan.nextInt();
			String classAtSchool="", WeekdayName="";
			
			
			
			if(day==1) {
				classAtSchool="Group Project";
				WeekdayName="Monday";
			}else if(day==2){
				classAtSchool="Java programming";
				WeekdayName="Tuesday";
			}else if(day==3){
				classAtSchool="Java programming";
				WeekdayName="Wednesday";
			}else if(day==4){
				classAtSchool="Manual QA/SDLC/SoftSkills";
				WeekdayName="Thursday";
			}else if(day==5){
				classAtSchool="No class";
				WeekdayName="Friday";
			}else if(day==6){
				classAtSchool="Java programming";
				WeekdayName="Saturday";
			}else if(day==7){
				classAtSchool="Java programming";
				WeekdayName="Sunday";
			}else {
				System.out.println("ERROR: Invalid Day!");
			}
			
			System.out.println("Day of Week: "+WeekdayName+"\n"+
			"Class: "+classAtSchool);
			
			scan.close();
	}

}
