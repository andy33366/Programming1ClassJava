/*
 *
 * This program calculates the final value of the home after compound interest
 *
 */

//imports the scanner and math
import java.util.Scanner;
import java.lang.Math;

public class Lab3_Andrea_Belmar {

	static public void main(String[] args) {

		//initializes the scanner
		Scanner input = new Scanner(System.in);
	
		//homevValueInit - initial home value
		//rate - interest rate
		//homeValueFinal - final value of the home
		//years - amount of years elapsed
		double homeValueInit, rate, homeValueFinal;
		int years;

		//asks for homeValueInit
		System.out.println("What is the initial value of the home?");
		homeValueInit = input.nextDouble();

		//asks for years
		System.out.println("How many years have elapsed?");
		years = input.nextInt();

		//asks for rate
		System.out.println("What is the interest rate?");
		rate = input.nextDouble();
		//checks if the rate is given as a percent or decimal
		//if percent -> converts to decimal
		if (rate >= 1) {
			rate = rate*0.01;
			System.out.printf("The rate as a decimal is: %.2f\n", rate);
		}

		//homeValueFinal = homeValueInit*(1+rate)^years
		//homeValueFinal = homeValueInit*Math.pow((1+rate), years);
		homeValueFinal = homeValueInit*Math.pow((++rate), years);


		System.out.printf("The final value of the home is $%.2f\n", homeValueFinal);
	
	}

}
