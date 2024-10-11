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

		//prompt the user for the three cities
		System.out.print("Enter the first city: ");
		city1 = input.nextLine();

		System.out.print("Enter the second city: ");
		city2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
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
		
		//Tests if city1 comes first by checking the unicode value and comparing it to the other 2 cities 
		if (city2.compareToIgnoreCase(city1) > 0 && city3.compareToIgnoreCase(city1) > 0 ){
		
			System.out.println(city1);
			//checks if city2 or city 3 comes next
			if (city3.compareToIgnoreCase(city2) > 0 ){
			
				System.out.println(city2);
				System.out.println(city3);
			}
			else{
		
				System.out.println(city3);
				System.out.println(city2);
			}
		}
		//checks if city2 comes first by comparing the unicode value to city 3
		else if (city3.compareToIgnoreCase(city2) > 0){
		
			System.out.println(city2);
			//checks if city 3 or city1 comes next
			if (city3.compareToIgnoreCase(city1) > 0){
			
				System.out.println(city1);
				System.out.println(city3);
			}
			else {
			
				System.out.println(city3);
				System.out.println(city1);
			}
		}
		//if neither city1 nor city2 come first, city3 must come first
		//checks if city2 or city1 comes next
		else if (city2.compareToIgnoreCase(city1) > 0) {
		
			System.out.println(city3);
			System.out.println(city1);
			System.out.println(city2);
		}
		else {

			System.out.println(city3);
			System.out.println(city2);
			System.out.println(city1);
		}

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
