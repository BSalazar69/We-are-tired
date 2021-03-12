package Repl;

import java.util.Scanner;

class Main {
 public static void main(String[] args ){

Scanner scan=new Scanner(System.in);
String banana,apple;
String num1,num2;

System.out.println("Please entere two strings");
banana=scan.nextLine();
apple=scan.nextLine();
System.out.println("Please enter two numbers");
num1=scan.nextLine();
num2=scan.nextLine();

if(num1.equals(num2) && banana.equals(apple)){
  System.out.println("AND");
}else if(num1.equals(num2)|| banana.equals(apple)){
  System.out.println("OR");
}else{
  System.out.println("NONE");
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		

	}

}
