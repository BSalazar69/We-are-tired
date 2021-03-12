package Repl;

import java.util.Scanner;

public class Repl32 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int age;
		String gender;
		
		System.out.println("Please enter your gender: M or F");
        gender=scan.nextLine();
		
        System.out.println("Please enter your age");
		age = scan.nextInt();
		
		if(age>=25 && gender.equals("M")) {
			System.out.println("Man");
		}else if(age<25 && gender.equals("M")) {
			System.out.println("Boy");
		}if (age>=25 && gender.equals("F")) {
			System.out.println("Woman");
		}else if (age<25 && gender.equals("F")) {
			System.out.println("Girl");
		}
		
		
		
		
		
		
	}
}
