package Repl;

import java.util.Scanner;

public class Repl40 {
public static void main(String[] args) {
	
	 Scanner input;
	 String name,toDo;

	 input=new Scanner(System.in);
	 System.out.println("Enter name of instructor");
	 name=input.nextLine();


	 switch(name){

	 case "Asghar":
	 toDo="Will take care of Java Assignment";
	 break;
	 case "Moazzam":
	 toDo="Will take care of SDLC Assignment";
	 break;
	 case "Weqas":
	 toDo="Will take care of Selenium Assignment";
	 break;
	 case "Asel":
	 toDo="Will take care of every Assignment";
	 break;
	 default:
	 toDo=" Invalid instructor selected";
	 }
	 System.out.println(toDo);


	
}
}
