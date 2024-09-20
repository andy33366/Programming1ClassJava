/*
 *
 * This program calculates cost of meal and tip
 *
 */

//imports the scanner and math
import java.util.Scanner;
import java.lang.Math;

public class Lab4_Andrea_Belmar{

	static public void main(String[] args) {
		
		//initializes the scanner
		Scanner input = new Scanner(System.in);

		double mealCost, tip, finalMealCost;
		int tipChoice;
		final double SALES_TAX = 0.0825;

		//prompts the user for cost of the meal
		System.out.println("How much did the meal cost?");
		mealCost = input.nextDouble();

		//prints the cost of the meal + salestax
		mealCost = mealCost + mealCost*SALES_TAX;
		System.out.println("The cost of the meal with sales tax of " + (SALES_TAX*100) + "% is " + mealCost);

		//prompts the user for choice of tip amount
		System.out.println("Choose a tipping option\nOption 1 - 10% tip\nOption 2 - 15% tip\nOption 3 - 20% tip");
		tipChoice = input.nextInt();

		//initializes tip
		tip = 0;

		//changes tip amount based on user choice
		if (tipChoice == 1) {

			tip = 0.1;

		}
		else if (tipChoice == 2) {
		
			tip = 0.15;
		
		}
		else if (tipChoice == 3) {
			
			tip = 0.2;
		
		}
		else {
		
			System.out.println("please pick option 1, 2, or 3");
		}

		//rounds to 2 decimal places using the cast operator
		//cost = (int)(cost*100+0.5)/100.0
		finalMealCost = (int)((mealCost+mealCost*tip)*100.0+0.5)/100.0;

		System.out.println("The final cost of your meal including sales tax and a "+(tip*100)+"% tip is: "+finalMealCost);



	}
}
