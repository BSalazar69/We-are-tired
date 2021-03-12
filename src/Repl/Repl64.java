package Repl;

import java.util.Scanner;

public class Repl64 {

	public static void main(String[] args) {

		int end;
		Scanner scan = new Scanner(System.in);
		end = scan.nextInt();

		int x = end * 2;

		for (int i = 0; i < x; i++) {
			System.out.print(i + " ");
		}

	}

}
