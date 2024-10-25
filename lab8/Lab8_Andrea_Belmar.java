/*
 *
 * takes user input and makes geometric mean
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class Lab8_Andrea_Belmar {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int procInput = 1;
		int dataCount = 0;
		int procProduct = 1;
		double geoMean;

		System.out.print("Enter a processor speed (-1 to exit): ");
		procInput = input.nextInt();


		while (procInput != -1) {

			procProduct *= procInput;
			dataCount++;

			System.out.print("Enter a processor speed (-1 to exit): ");
			procInput = input.nextInt();

		}

		geoMean = Math.pow(procProduct, 1/((double)dataCount));

		System.out.printf("The geometric mean is: %.2f", geoMean);
	}
}
