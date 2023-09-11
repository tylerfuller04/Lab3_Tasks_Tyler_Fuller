/*
 * Lab3_Task1_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/11/2023
 */

import java.util.Scanner; // Import Scanner for user input

public class Lab3_Task1_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare variables
		char letterGrade;
		
		// Prompt user to input test score
		System.out.print("Enter a your letter grade: ");
		Scanner input = new Scanner(System.in);
		letterGrade = input.nextLine().charAt(0);
		input.close();
		
		// Test grade using switch/cases for each letter grade
		switch (letterGrade) {
			case 'A': // Tests if testScore A
				System.out.print("Excellent.");
				break;
			case 'B': // Tests if testScore is B
				System.out.print("Very Good.");
				break;
			case 'C': // Tests if testScore is C
				System.out.print("Passing.");
				break;
			case 'D': // Tests if testScore is D
				System.out.print("Not Good. Go Study.");
				break;
			case 'F': // Tests if testScore is F
				System.out.print("Not Good. Go Study.");
				break;
			default: // Every other character is invalid
				System.out.print("That is not a possible grade.");
				break;
		}
		
	}
}