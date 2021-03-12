package com.class06;

import java.util.Scanner;

public class RecapLogicalOperators {

	public static void main(String[] args) {
		Scanner scan;
		int time;
		String timeOfDay = null;

		scan = new Scanner(System.in);
		System.out.println("Please enter time in 24hr Format");
		time = scan.nextInt();

		if (time >= 1 && time <= 11) {
			timeOfDay = "Morning";
		} else if (time >= 12 && time <= 13) {
			timeOfDay = "Noon";
		} else if (time >= 14 && time <= 17) {
			timeOfDay = "Afternoon";
		} else if (time >= 18 && time <= 21) {
			timeOfDay = "Evening";
		} else if (time >= 22 && time <= 24) {
			timeOfDay = "Night";
		}

		System.out.println("Base on the time enntered it is " + timeOfDay);

	}

}
