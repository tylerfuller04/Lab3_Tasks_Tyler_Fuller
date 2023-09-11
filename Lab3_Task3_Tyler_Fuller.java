/*
 * Lab3_Task3_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/11/2023
 */

import java.util.Scanner; // Import Scanner for user input

public class Lab3_Task3_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare variables
		int side1, side2, side3;
		
		// Prompt the user to input side lengths
		System.out.print("Enter the lengths of the sides of a triangle: ");
		Scanner input = new Scanner(System.in);
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		input.close();
		
		// Calculate squares of each side length
		int squareSide1 = (int)Math.pow(side1, 2);
		int squareSide2 = (int)Math.pow(side2, 2);
		int squareSide3 = (int)Math.pow(side3, 2);
		
		// Test whether the square of the sum of two sides = the square of the other side
		if (squareSide1 == squareSide2 + squareSide3) {
			System.out.print("This is a right triangle.");
		}
		else if (squareSide2 == squareSide1 + squareSide3) {
			System.out.print("This is a right triangle.");
		}
		else if (squareSide3 == squareSide1 + squareSide2) {
			System.out.print("This is a right triangle");
		}
		else {
			System.out.print("This is not a right triangle.");
		}
		

	}
}