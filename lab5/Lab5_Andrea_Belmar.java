/*
 *
 * This program turns a user input for a color red from 0 - 255 into a hex value
 *
 */

import java.util.Scanner;

public class Lab5_Andrea_Belmar{

	static public void main(String[] args){
	
		//initialializes the scanner
		Scanner input = new Scanner(System.in);
		
		int userInput, div16Result, mod16Result;
		String mostSigDigit, leastSigDigit;

		//prompts user for the amount of red
		System.out.println("Enter the amount of red as an integer from 0 - 255: ");
		userInput = input.nextInt();

		//checks if integer is between 0-255
		if (userInput <= 255 && userInput >= 0){
		
			//valid number
			
			//divides the userInput by 16 and assigns a value for the most significant figure
			div16Result = userInput / 16;
			switch (div16Result){
			
				case 10:
					mostSigDigit = "A";
					break;
				case 11:
					mostSigDigit = "B";
					break;
				case 12:
					mostSigDigit = "C";
					break;
				case 13:
					mostSigDigit = "D";
					break;
				case 14:
					mostSigDigit = "E";
					break;
				case 15:
					mostSigDigit = "F";						
					break;
				default:
					mostSigDigit = String.valueOf(div16Result);
			}
			
			//does userInput % 16 to determine the second sig digit
			mod16Result = userInput % 16;
			switch (mod16Result){
				
				case 10:
					leastSigDigit = "A";
					break;
				case 11:
					leastSigDigit = "B";
					break;
				case 12:
					leastSigDigit = "C";
					break;
				case 13:
					leastSigDigit = "D";
					break;
				case 14:
					leastSigDigit = "E";
					break;
				case 15:
					leastSigDigit = "F";						
					break;
				default:
					leastSigDigit = String.valueOf(mod16Result);
			
			}
			System.out.println("The hex value is: "+mostSigDigit+leastSigDigit);
		}
		else{
			//invalid number
			System.out.println("invalid number");
		}

	}
}
