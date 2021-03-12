package Repl;

import java.util.Scanner;

public class Repl39 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int num;
		String grade = null;
		
		System.out.println("Please enter your mark");
		num=scan.nextInt();
		
		
		
		if(num>=1 || num<25) {
			grade="F";
		}
		if(num>=25 && num<45) {
			grade="E";
		}
		if(num>=45 && num<50) {
			grade="D";
		}
		if(num>=50 && num<60) {
			grade="C";
		}
		if(num>=60 && num<80) {
			grade="B";
		}
		if(num>=80) {
			grade="A";
		}
		else {
			System.out.println("Please enter valid mark");
		}
		
		System.out.println("Your grade is "+grade);
		
		
		
		
	}


}
