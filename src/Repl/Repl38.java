package Repl;

import java.util.Scanner;

public class Repl38 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	    boolean weekend=true;
	    String learn;
	    System.out.println("Is it weekend?");
	    weekend=scan.nextBoolean();
	    
	    
	    
	    if(!weekend) {
	    	learn="manual testing";
	    }else {
	    	learn="Java";
	    }
	    
		System.out.println("Today you will be learning "+learn);
		
		
		
		
	}

}
