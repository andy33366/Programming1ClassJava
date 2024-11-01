/*
 *
 * calculates compound interest of a house given a principal amount
 *
 */

import java.util.Scanner;
import java.lang.Math;

public class Lab10_Andrea_Belmar {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		double principal, interest;
		double finalAmount = 0;
		int years;

		//prompts the user for the principal, interest and years
		System.out.println("what is the principal? ");
		principal = input.nextDouble();

		System.out.println("what is the interest rate? ");
		interest = input.nextDouble();

		System.out.println("what is the amount of years? ");
		years = input.nextInt();

		//call the calculate method and printoutput method
		printOutput(compoundInterest(principal, interest, years, finalAmount));
	}

	//calculates compound interest
	//A = P(1 + r)^t
	public static double compoundInterest( double principal, double interest, int years, double finalAmount){
	
		//convert interest to a decimal
		interest = interest / 100;
		//returns the final amount based on the formula above
		return principal*Math.pow(1 + interest, years);
	}
	
	//prints output
	public static void printOutput(double finalAmount){
	
		//prints amount to 2 decimal points
		System.out.printf("The final amount is $%,.2f", finalAmount);
	}
}
