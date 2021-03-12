package com.class04;

public class Nestedif {

	public static void main(String[] args) {
		
		boolean morning=true;
		boolean classToday=true;
		
		
		if(morning) {
			System.out.println("let me check if i have class today");
		
		if(classToday) {
			System.out.println("good morning my classmates");
		}else {
			System.out.println("good morning my family");
		}
		
		}
		
		
		System.out.println("---end of code-----");
		
		System.out.println("--------------------------------example 2------------------------------");

		boolean anyAllergy=true;
		boolean pollenAllergy=true;
		
		if(anyAllergy) {
			System.out.println("Lets check which allergies you have");
			
			if (pollenAllergy) {
				System.out.println("Stay at home when trees are blooming ");
			}else {
				System.out.println("ok i know you dont have pollen allergy");
			}
			
		}else {
			System.out.println("Youre lucky no allergies");
		}
		
		System.out.println("-----------------------example 3--------------------------");
		
	
		
		
		
		
		
	}

}
