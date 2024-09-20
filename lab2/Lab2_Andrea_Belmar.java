/*
 *
 * This program calculates energy based on mass and c
 *
 */

import java.util.Scanner; //imports scanner to read user input

public class Lab2_Andrea_Belmar {
	
	static public void main(String[] args) {

		Scanner input = new Scanner(System.in);//initializes scanner
						       
		final double SPEED_OF_LIGHT = 300000;
		double mass, energy;

		//prompts user for mass, then puts that in variable mass
		System.out.println("Enter a mass (kg): ");
		mass = input.nextDouble();

		//calculates e=mc^2
		energy = mass*SPEED_OF_LIGHT*SPEED_OF_LIGHT;

		System.out.println("The energy is "+energy+" MJ.");
		

	}
}
