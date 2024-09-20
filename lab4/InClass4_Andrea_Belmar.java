/*
 *
 * This program recommends outfits based on temperature
 *
 */

//imports the scanner
import java.util.Scanner;

public class InClass4_Andrea_Belmar {
	
	static public void main(String[] args) {
	
		//initializes the scanner
		Scanner input = new Scanner(System.in);

		double temperature;
		String message;

		//prompts for temperature
		System.out.println("what is the temperature?");
		temperature = input.nextDouble();
		

		//sets the message based on the given user temperature
		if (temperature > 70) {
		
			message = "It's pretty warm outside. You should wear something light.";
		
		}
		else if (temperature > 60) {
			
			message = "It's starting to get colder. You should wear pants and a long sleeve shirt.";
			
		}
		else {
			message = "It's pretty cold outside. Make sure you take your coat.";
			
		}
		
		System.out.println(message);


	}
}
