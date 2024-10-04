/*
 *
 * This program will generate a random number within a range specified by a user
 *
 */

import java.util.Scanner;
import java.lang.Math;

public class InClass6_Andrea_Belmar {

	static public void main(String[] args){

		//initializes the scanner
		Scanner input = new Scanner(System.in);

		int upper, lower, random;

		System.out.println("what is the smallest value?");
		lower = input.nextInt();

		System.out.println("what is the largest value?");
		upper = input.nextInt();
		//the upper value in the range will have the lower value subtracted to account for the shift by adding lower
		//adding one to account for the -1 shift from casting as int
		upper = upper - (lower) + 1;

		int random = (int) (Math.random() * upper) + lower;

		System.out.println("your number is: "+random);
	

	}
}
