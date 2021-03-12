package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		/* we identify favorite food
		 * we need to capture country from user
		 * based on country identify favorite food
		 * 
		 */
		
		Scanner input;
		String country,food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		country=input.nextLine();
		
		switch(country) {
		
		case "USA":
			food ="burger";
			break;
		case "Mex":
			food ="tacos";
			break;
		case "Vietnam":
		    food ="Pho";
				break;
		case "Afgh":
			food ="Kebobs";
			break;
		case "Brian":
			food ="AZZ";
			break;
		default:
			food ="Unknown";
		
		}
		
		System.out.println(country+" your favorite food is "+food);
		
		

	}

}
