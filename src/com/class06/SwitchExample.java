package com.class06;

public class SwitchExample {

	public static void main(String[] args) {
		/*
		 * store gender using M or F base on the gender we will specify if M --> Male if
		 * F --> Female otherwise --> TrannyBoiz
		 */

		
		char gender = 'M';
		String description;

		switch (gender) {

		case 'M':
			description = "Male";
			break;

		case 'F':
			description = "Female";
			break;

		default:
			description = "TrannyBoiz";

		}

		System.out.println(description);
		
		/*LIMITATIONS
		 * switch CANNOT use relational or logical operators(it just checks values)
		 * switch CAN only be used with BYTE,SHORT,CHAR,INT,STRING.
		 * dont forget "break;"  afer each statement.
		 */
		
		
		
		
	}

}
