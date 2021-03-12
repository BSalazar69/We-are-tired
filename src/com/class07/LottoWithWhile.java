package com.class07;

import java.util.Scanner;

public class LottoWithWhile {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num;
		int lottoNum=17;
	
		System.out.println("Please enter any number from 1 to 100 to win");
		num=scan.nextInt();
		
		while(num!=lottoNum);{
			System.out.println("please enter any number from 1 to 100 to win");
			num=scan.nextInt();
		}
		
		
		
		
	
		System.out.println("Congrats you entered"+num+"which is the lucky number");
		
		
		

	}

}
