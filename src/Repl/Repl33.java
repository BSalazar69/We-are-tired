package Repl;

import java.util.Scanner;

public class Repl33 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		int num;

		System.out.println("Please enter a number");
		num=input.nextInt();    

	    if(num%2==0) {
	    	System.out.println("Value is even");
	    	
	    	if(num>=1000 && num%2==0) {
	    		System.out.println("Even value is large");

	      }if (num<1000) {
	    	  System.out.println("Even value is just right");
	    	  }
	      }else {
	    	  System.out.println("Value is odd");
	    	  }
	    
	   
	    
	    if(num%3==0 && num<1000){
	    		  System.out.println("Odd value is just right");
	    }	else {
	    	 System.out.println("Odd value is large");
	    }
	    
	    	  
	    	  
	    	  
	    	  
	}
}
