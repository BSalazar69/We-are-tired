package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		// when i have to test 2 or more conditions we use logical operators
		
		//AND (&&)
		
        //true && true ---> TRUE
		//true && false ---> FALSE
		//fals && true ---> FALSE
		//false&& false ---> FALSE
		
		//OR (||)
		
		// true || true-->TRUE
		// true || false -->TRUE
		// false || true --> TRUE
		// false || false -->FALSE
		
		
		
		
		System.out.println("---------------&& example---------------------------------------");
		
		
		
		/* we have to identify if the number is small,med,lrg,XL
		 * if number is between 1-10 --> small 
		 * if number is between 11-100 -->med
		 * if number is between 101-1000 --->lrg
		 * if number is between 1001-100000 ---> xl Large
		 */
		
		
		int num=1000;
		
	
		if(num>=1 && num<=10) {
			
			System.out.println(num +"is a small number");
		}else if(num>=11 && num<=100) {
			
			System.out.println(num +" is a medium number");
		}else if (num>=101 && num<=1000) {
			
			System.out.println(num + " is a large number");
		}else if(num>=1001 && num<=100000) {
			
			System.out.println(num +" is a XL number");
		}else {
			System.out.println(num+" is too big of a number");
		}
	
		}
		
	
		
	}


