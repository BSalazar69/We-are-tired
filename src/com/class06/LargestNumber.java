package com.class06;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// Write a program to find largest number among three numbers using nested if provided by a user 
        //	(numbers must be distinct)

		
		int num1,num2,num3,largest;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		if (num1>num2) { // were assuming #1 us bigger than #2
			if(num1>num3) {
				largest=num1;
			}else {
				largest=num3;
			}
		}else {
				if(num2>3) {
					largest=num2;
				}else {
					largest=num3;
				}
			}
		
		System.out.println("The largest number among "+num1+","+num2+","+num3+", is "+largest);
		
		
		
	}
	}

