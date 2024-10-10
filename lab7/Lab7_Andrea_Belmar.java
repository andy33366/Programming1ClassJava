/*
 *
 * this program sorts 3 names into alphabetical order
 *
 */

import java.util.Scanner;

public class Lab7_Andrea_Belmar {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		String city1, city2, city3;

		System.out.println("Enter the first city: ");
		city1 = input.nextLine();

		System.out.println("Enter the second city: ");
		city2 = input.nextLine();
		
		System.out.println("Enter the third city: ");
		city3 = input.nextLine();


		//create boolean values for city comparison
		//city1first = 
		//if city2comparecity1 > city1comparecity2 && city3comparecity1 > city1comparecity3
		//	city1 first
		//	if city3comparecity2 > city2comparecity3
		//		city2 next
		//		city3 last
		//	else
		//		city3 next
		//		city2 last 
		//else if city3comparecity2 > city2comparecity3
		//	city2 first
		//	if city3comparecity1 > city1comparecity3
		//		city1 next
		//		city3 last
		//	else
		//		city3 next
		//		city1 last
		//else if city2comparecity1 > city1comparecity2
		//	city3 first
		//	city1 next
		//	city2 last
		//else
		//	city3 first
		//	city2 next
		//	city1 last
		//
		if (city2.compareTo(city1) > city1.compareTo(city2) && city3.compareTo(city1) > city1.compareTo(city3)) {
		
			System.out.println(city1);
			if (city3.compareTo(city2) > city2.compareTo(city3)){
			
				System.out.println(city2);
				System.out.println(city3);
			}
			else{
		
				System.out.println(city3);
				System.out.println(city2);
			}
		}
		else if (city3.compareTo(city2) > city2.compareTo(city3)){
		
			System.out.println(city2);
			if (city3.compareTo(city1) > city1.compareTo(city3)){
			
				System.out.println(city1);
				System.out.println(city3);
			}
			else {
			
				System.out.println(city3);
				System.out.println(city1);
			}
		}
		else if (city2.compareTo(city1) > city1.compareTo(city2)) {
		
			System.out.println(city3);
			System.out.println(city1);
			System.out.println(city2);
		}
		else {

			System.out.println(city3);
			System.out.println(city2);
			System.out.println(city1);
		}
		//city3 is first

		//
		//For loop
		//String cities[] ={}
		//add userinput to cities
		//for (int i=0; i < cities.length(); i++)
		//	for (int j = ++i; j < cities.length(); j++)
		//		if (cities[i].compareto(cities[j]) > 0)
		//			temp = cities[i]
		//			cities[i] = cities[j]
		//			cities[j] = temp
		//
		//for (int i =0; i < cities.length(); i++)
		//	system.out.println(cities[i])

	}
}
