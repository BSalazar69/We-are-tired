package Repl;

import java.util.Scanner;

public class Repl43 {
public static void main(String[] args) {
	
	String month;
	
	Scanner input;
	
   input=new Scanner(System.in);
   System.out.println("Please enter any number from 1-12");
   month=input.nextLine();
   
	
	switch(month) {
	
	case "1":
		month="January";
		break;
	case "2":
		month="February";
		break;
	case "3":
		month="March";
		break;
	case "4":
		month="April";
		break;
	case "5":
		month="May";
		break;
	case "6":
		month="June";
	case "7":
		month="July";
		break;
	case "8":
		month="August";
		break;
	case "9":
		month="September";
	case "10":
		month="October";
		break;
	case "11":
		month="November";
		break;
	case "12":
		month="December";
		
		default:
			month="Invalid";
	
	}	
	
	
}
}
