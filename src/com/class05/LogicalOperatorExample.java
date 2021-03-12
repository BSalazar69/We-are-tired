package com.class05;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		/* ask user to enter age
		 * base on age we will define 
		 * if age 1-3 -> u are baby 
		 * if age 3-5 -> big baby
		 * if age 5-12-> child
		 * if age from 13-19 -> teen
		 * if age above 20 -> adult
		 */

		Scanner input;
		String name;
		int age;
		
		input=new Scanner(System.in);
				System.out.println("please enter your name");
		name=input.next();
		
	    System.out.println("please enter your age");
		age=input.nextInt();
		 
		if(age>=1 && age<3) {
			System.out.println("you are a baby");
		}else if(age>=3 && age<=5) {
			System.out.println("you are a big baby");
		}else if (age>=5 && age<=12) {
			System.out.println("you are a kid");
		}else if (age>=13 && age<=19) {
			System.out.println("your a teen");
		} else {
			System.out.println("your an adult");
		}
		
		
		
		
		
		
		
	}

}
