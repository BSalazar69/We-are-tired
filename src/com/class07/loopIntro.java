package com.class07;

public class loopIntro {

	public static void main(String[] args) {
		
		System.out.println("Hello"); //LOOP WILL CLEAN CODE UP AND ELIMINATE REPETATIVE CODE
		System.out.println("Hello");
		System.out.println("Hello");// CONDITION NEEDS TO BE TRUE TO EXECUTE!!!!!!!!!!!!!
		System.out.println("Hello");
		
		
		int time=7;
		
		if(time<12) {
			System.out.println("Hello"); // code executes 1 time
		}
		
		System.out.println("------------ WHILE LOOP---------------------");
		
		
		while(time<12) {
			System.out.println("Hello"); // code runs forever  
			time++;
		}

		System.out.println("---------------------print numbers from 1-10-------------------------------");
		
		int num=1;
		
		while(num<=10) {
			
			System.out.print(num+" ");
			num++;          //  <--MAKE SURE ITS INSIDE BRACKET
		}
		
		System.out.println("-------------Print from 20-40-------------------------");
		
		num=20;
		while(num<=40) {
			System.out.print(num +" ");
			num++;
		}
		
		
		
		
		System.out.println();
		
		System.out.println("----------------DECREMENT print from 10-1------------------------------");
		int a=10;
		while(a>=1) {
			System.out.print(a+ " ");
			a--;
		}
		
		
		
		
	}

}
