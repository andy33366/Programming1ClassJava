/*
 *
 *
 *
 */

import java.util.Scanner;
import java.lang.Math;

public class Lab6_Andrea_Belmar {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		double median;
		int sizeRange, shift, randomNum;

		System.out.println("Enter the median of the range: ");
		median = input.nextDouble();

		System.out.println("Enter the size of the range: ");
		sizeRange = input.nextInt();

		// if range is 2-10 then median is 6 and size is 8
		// lowvalue = shift
		// median = size/2 + shift
		// shift = median - (size/2)
		// size = highvalue - shift
		// highvalue = size + shift
		// n = highvalue - shift
		// n = (size + shift) - shift
		shift = (int) Math.ceil(median - (sizeRange/2));
		randomNum = (int) (Math.random() * (sizeRange) + shift);

		System.out.println("the random number is: "+randomNum);

	}
}
