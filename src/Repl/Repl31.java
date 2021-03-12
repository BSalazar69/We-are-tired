package Repl;

import java.util.Scanner;

public class Repl31 {

	public static void main(String[] args) {
		
		boolean isSunny;
		int temp;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Is it sunny outside?");
		isSunny=scan.nextBoolean();
		
		if(isSunny==true ) {
			System.out.println("It is a sunny day, I should go somewhere!");}
			else{
				System.out.println("I stay home and practice Java");
			
      }if(isSunny==true){
	
		System.out.println("What is the temperature outside?");
		temp=scan.nextInt();
		
		if(temp>=85) { 
			System.out.println("I am going to the beach");
			
		}else {
			System.out.println("I am going to the park");
		}


	}

	}
}
