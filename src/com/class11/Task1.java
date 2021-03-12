package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	
	
	String[][] names={
		{"mr","mrs","ms","miss"},
		{"smith","jordan","jackson","obama"}
	
		};
		System.out.println(names[0][1]+". "+names[1][0]);
		System.out.println(names[0][0]+". "+names[1][3]);
		System.out.println(names[0][2]+". "+names[1][2]);
		System.out.println(names[0][3]+". "+names[1][1]);

		System.out.println("------------------------------------------------------------");
		
		
		String [][] grade= {
				{"Maggie","Doodie","Stinky","Emma"},
				{"A","B"},
		};
		System.out.println(grade[0][0]+" "+grade[1][0]);
		System.out.println(grade[0][1]+" "+grade[1][0]);
		System.out.println(grade[0][2]+" "+grade[1][0]);
		System.out.println(grade[0][3]+" "+grade[1][0]);
	}

}
