/*
 *
 * this program sorts 2 names into alphabetical order
 *
 */

import java.util.Scanner;

public class InClass7_Andrea_Belmar {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		String city1, city2;

		System.out.println("Enter the first city: ");
		city1 = input.nextLine();

		System.out.println("Enter the second city: ");
		city2 = input.nextLine();


		if (city1.compareTo(city2) > city2.compareTo(city1)){

			System.out.println(city2);
			System.out.println(city1);
		
		}
		else if (city2.compareTo(city1) > city1.compareTo(city2)){

			System.out.println(city1);
			System.out.println(city2);
		
		}
		else {
		
			System.out.println(city1);
			System.out.println(city2);
		}

	}
}
