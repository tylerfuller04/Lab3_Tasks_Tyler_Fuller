/*
 * Lab3_Task2_Tyler_Fuller.java
 * Tyler Fuller
 * 01261802
 * 09/11/2023
 */

import java.util.Scanner; // Import Scanner to get user input

public class Lab3_Task2_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Declare variables
		double numberOfHours, parkingFee;
		
		// Prompt user to input number of hours car is parked
		System.out.print("Enter the number of hours the car is parked: ");
		Scanner input = new Scanner(System.in);
		numberOfHours = input.nextDouble();
		input.close();
		
		// Test which category the number of hours falls into
		if (numberOfHours > 0 && numberOfHours <= 3) {
			parkingFee = 5.0;
			System.out.print("Please pay: $" + String.format("%.2f", parkingFee));
		}
		else if (numberOfHours > 3 && numberOfHours <= 9) {
			parkingFee = 6 * (int)(numberOfHours + 1); // Car is parked between 3 and 9 hours
			System.out.print("Please pay: $" + String.format("%.2f", parkingFee));
		}
		else if (numberOfHours > 9 && numberOfHours <= 24) {
			parkingFee = 60.0; // Car is parked between 9 and 24 hours
			System.out.print("Please pay: $" + String.format("%.2f", parkingFee));
		}
		
	}
}