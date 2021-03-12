package com.class08;

public class HW {

	public static void main(String[] args) {
		
		int sumEven=0;
		for(int i=0; i<=50; i+=2 ) {
			sumEven+=i;
		}
		System.out.println("The sum of even numbers is "+sumEven );
		
		
		
		
		
		
		int odd=0;
		int even=0;
		
		for(int i=1; i<=50; i++) {
			if(i%2==0){
				even+=i;
			}else {
				odd+=i;
			}
		}
		System.out.println("sum of odd numbers is "+odd);
		System.out.println("sum of even numbers is "+even);
		
		
		
		
		
		
		

	}

}
