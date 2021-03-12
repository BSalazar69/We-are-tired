package Repl;

import java.util.Scanner;

public class Repl44 {

	public static void main(String[] args) {
		
		String car,carOrigin;
		Scanner scan=new Scanner(System.in);
		
	   System.out.println("Please enter your favorite car make");
		
	   car=scan.nextLine();
	   
		switch(car) {
		
		case "bmw":
			carOrigin="german car";
			break;
		case "Toyota":
			carOrigin="japanese car";
			break;
		case "Maserati":
			carOrigin="italian car";
			break;
		default:
			carOrigin="unknown";
	
		}System.out.println("your favoriter car is "+carOrigin);
		
	
		
		
		

	}

}
