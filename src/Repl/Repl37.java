package Repl;

import java.util.Scanner;

public class Repl37 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		boolean thirsty = true,sleepy = true;
		String drink = null;
	    
		System.out.println("Are you thirsty?");
		thirsty=scan.nextBoolean();
		
		System.out.println("Are you sleepy?");
		sleepy=scan.nextBoolean();
	

      if(!thirsty && sleepy) {
    	  drink="tea";
      }
	 if(thirsty && !sleepy) {
		 drink="water";
	 }
	 if(thirsty && sleepy) {
		 drink="coffee";
	 }
	 if(!thirsty && !sleepy) {
		 drink="nothing";
	 }
	
	System.out.println("Looks like you need to drink "+drink);
	 
	 
	 
	}
}
