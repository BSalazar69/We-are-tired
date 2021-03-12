package Repl;

import java.util.Scanner;

public class Repl45 {
public static void main(String[] args) {
	
	String day;
	String num;
	Scanner input;
	
   input=new Scanner(System.in);
   System.out.println("Please enter any number from 1-7");
   day=input.nextLine();
   
	
	switch(day) {
	
	case "1":
		day="Monday";
		break;
	case "2":
		day="Tuesday";
		break;
	case "3":
		day="Wednesday";
		break;
	case "4":
		day="Thursday";
		break;
	case "5":
		day="Friday";
		break;
	case "6":
		day="Saturday";
	case "7":
		day="Sunday";
		break;
			
		default:
	      day="Invalid";
	      
		
		
	}

	System.out.println(day);
	
	
	
}
}
