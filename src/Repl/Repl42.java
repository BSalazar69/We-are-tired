package Repl;

import java.util.Scanner;

public class Repl42 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
	      String name;
	      int num1;
	      
	      
	      System.out.println("Enter the roll number of the child");
	      num1=scan.nextInt();
	    
	      switch(num1) {
	      case 101:
	        name="Ramesh";
	        break;
	      case 102 :
	        name="Mahesh";
	        break;
	      case 103:
	        name="Mukesh";
	        break;
	        default:
	          name="Not found student name: in Class";
	          
	      
	      }System.out.println("Student name: "+name);
		
		
		
		

	}

}
