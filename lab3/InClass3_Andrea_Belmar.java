/*
 *
 * This program calculates the volume and surface area of a cube when given a side length
 *
 */

import java.util.Scanner;
import java.lang.Math; //imports scanner and math

public class InClass3_Andrea_Belmar {

	static public void main(String[] args){
	
		Scanner input = new Scanner(System.in); //initializes scanner
						
		double sideLength, volume, surfaceArea;

		//prompts the user for sideLength value
		System.out.println("Enter the side length of the cube");
		sideLength = input.nextDouble();

		//volume = sidelength^3
		volume = Math.pow(sideLength, 3);

		//surfaceArea = 6*(area of face)
		surfaceArea = 6*(Math.pow(sideLength, 2));

		System.out.println("The volume of the cube is: "+volume+". and the surface area of the cube is: "+surfaceArea);


	}

}
