/*
 *
 * calculates the final cost of a meal after tipping and tax
 *
 */

import java.util.Scanner;


public class InClass10_Andrea_Belmar {

	static public void main(String[] args){
	
		//initializes the scanner
		Scanner input = new Scanner(System.in);

		double initCost, tip, finalCost;

		//ask for initial cost of meal
		//call sales tax
		//call tip
		//final cost = initial cost + salestax(init) + tip(init)
		//prompts the user for initial price of the meal
		System.out.println("what is the initial price of the meal?");
		initCost = input.nextDouble();

		//prompts user for tip percent
		System.out.println("How much was the tip as a percent? eg. 15, 18");
		tip = input.nextDouble();

		printOutput(initCost, tax(initCost), tip(initCost, tip));

	}

	//prints output
	public static void printOutput(double initCost, double tax, double tip){
		//
		System.out.printf("the final cost is: %.2f", initCost + tax + tip);
	
	}

	//calculates sales tax
	public static double tax(double meal){
	
		final double SALES_TAX = 0.0825;

		return meal * SALES_TAX;

	}
	
	//calculates tip
	public static double tip(double meal, double tip){
	
		tip = tip / 100;

		return (meal + tax(meal)) * tip;
		
	}
}
