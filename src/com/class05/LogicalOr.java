package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*variable day
		 * 
		 * if day is tues or weds --> manual class
		 * if day is mon or fri --> no class
		 * if day is sat or sun --> Java class
		 * if day is thurs---> review class
		 */
		
		String day="sat";
		
		if (day.equals("mon") ||  day.equals("friday")) {
	    System.out.println("today no class");
	    
		}else if (day.equals("tues") || day.equals("weds")) {
			System.out.println("today i have manual class");
			
		}else if (day.equals("thurs")){
			System.out.println("today is my review class");
			
		}else if (day.equals("sat")|| day.equals("sun")) {
			System.out.println("today is my java class");
			
		}else {
			System.out.println(day + " is invalid");
		}
		
	}

}
