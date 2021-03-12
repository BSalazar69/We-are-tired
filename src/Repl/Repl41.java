package Repl;

import java.util.Scanner;

public class Repl41 {

	public static void main(String[] args) {
		
		
	    String age,walking;
	    
	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Enter the age of the Child");
	    age=scan.next();
	    
	    switch(age.toUpperCase()) {
	    case"1":
	      walking="You can Crawl";
	      break;
	    case "2":
	      walking="You can Talk";
	      break;
	    case "3":
	      walking="You can Dance";
	      break;
	    case"4":
	      walking="You can get Trouble";
	      break;
	    default:
	      walking="I don't know how old you are";
	      
	    }
	    System.out.println(walking);
		
		
		
		

	}

}
