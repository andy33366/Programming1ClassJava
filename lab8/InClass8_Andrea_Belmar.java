/*
 *
 * takes user input and calculates sum of all inputs
 *
 */
import java.util.Scanner;

public class InClass8_Andrea_Belmar {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		int gradeInput = 0;
		int gradeCount = 0;
		int gradeSum = 0;
		double average;

		System.out.print("Enter a grade: ");
		gradeInput = input.nextInt();


		while (gradeInput != -1) {

			gradeSum += gradeInput;
			gradeCount++;

			System.out.print("Enter a grade (-1 to exit): ");
			gradeInput = input.nextInt();

		}

		System.out.println("average = " + gradeSum + "/" + gradeCount);
		average = (double)gradeSum/gradeCount;

		System.out.printf("The everage grade is: %.2f", average);
	}
}
