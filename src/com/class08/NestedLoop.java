package com.class08;

public class NestedLoop {

	// First IF needs to be true in order to go inside the body otherwise block will get skipped
	//
	
	public static void main(String[] args) {

		for (int i = 1; i < 3; i++) {
			System.out.println("I am outter loop");

			for (int j = 1; j <= 3; j++) {
				System.out.println("I am inner loop");
			}

		}

	}

}
