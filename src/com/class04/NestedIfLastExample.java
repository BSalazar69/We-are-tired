package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		/*to donate 
		 * you must be 18 and older, otherwise you cant
		 * your weight must be over 110 lbs otherwise you cant.
		 */
		
		int age=18;
		int weight=110;
		
		if (age>=18) {
		System.out.println("you are of age lets check weight");
		
		if (weight>=110) {
			System.out.println("Great you can donate blood");
		}
			
			
			
			
		}else {
			System.out.println("sorry you cannot donate at this time");
		}
		
		
		
		
	}

}
