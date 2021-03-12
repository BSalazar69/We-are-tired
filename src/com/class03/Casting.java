package com.class03;

public class Casting {
	public static void main(String[] args) {
		
		//converting one data type to another (ex: int to double).
		double d=10.99;
		d=10;
		System.out.println(d); // 10 can be held into a double but wil add a decimal.
		
		//2 types of casting:
		//1. Widening 
		//2. Narrowing
		
		//widening will happen automatically/"implicit"
		//narrowing you will do manually "explicit"
		
		
		double c=10;//--> widening or implicit casting
		System.out.println(c);
		
		
		
		int i=(int)12.99;//---> narrowing or explicit casting
		System.out.println(i);
		
		double newNum=10; //"10.0" it will convert since int->double.
		newNum=newNum/3;
		System.out.println(newNum);
		
		//int num1=10+10.5;  variable cant be "int" when using decimals.
		double num1=10+10.5;
		System.out.println(num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
