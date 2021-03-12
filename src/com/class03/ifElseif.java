package com.class03;

public class ifElseif {
	public static void main(String[] args) {
		
		//compared two numbers with 3 possible conditons 
		double num1=15.50;
		double num2=15.20;
		
	if (num1>num2) {
		System.out.println("double value " + num1 + " is larger than " + num2);
		
	}else if (num1<num2) {
		System.out.println("double value " + num2 + " is larger than" + num1);
	}else {
		System.out.println(num1+" is equal to "+num2);
	}
	
		System.out.println("------------------------");
		
		//2. based on the day number define a day
		
		int day=6;
		
		if(day==1) {
			System.out.println("Today is monday");
		}else if (day==2) {
			System.out.println("Today is tuesday");
		}else if (day==3) {
			System.out.println("Today is wednesday");
		} else if (day==4) {
			System.out.println("Today is thursday");
		} else if (day==5) {
			System.out.println("Today is friday");
		} else if (day==6) {
			System.out.println("Today is saturday");
		} else {
			System.out.println("Today is sunday");
		}
		
		
		
		
		
		
		
	}

	}


