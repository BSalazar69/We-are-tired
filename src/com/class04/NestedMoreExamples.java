package com.class04;

public class NestedMoreExamples {

	public static void main(String[] args) {
		/*
		 * if its friday --> go to the movie, otherwise stay home and study
		 * if its friday then i wll check if the day is the 13-> if yes-> watch scary movie
		 *                                if no --> watch any movie
		 */
		
		
		boolean isFriday=true;
		int day=10;
		
		if (isFriday) {
			System.out.println("Its a movie day!");
			
		if (day==13) {
			System.out.println("i will watch somthing scary");
		}else {
			System.out.println("i watch any porno");
		}
			
		}else {
			System.out.println("i will stay home and study");
		}
		System.out.println("---------------------------------------------------------------------");
		/* check assignment and based on the score we display a message
		 * 
		 */
		
		boolean completed =true;
		int score =95;
		
		if (completed) {
			
		if(score>90) {
			System.out.println("Great job!");
		}else if (score>80){
			System.out.println("good job");
		}else if (score>70) {
			System.out.println("good but lets try to do better");
		}else {
			System.out.println("good try but study more");
		}
			
		}else {
			System.out.println("Please make sure to complete assignments on time");
		}
		
		
		
		

	}

}
