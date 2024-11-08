/*
 *
 */
import java.util.Scanner;

public class InClass11_Andrea_Belmar{

	public static void main(String[] args){

		//prints 250 + 500 and "hello" + "world"
		System.out.println("Adding 250 and 500 gives: " + add(250, 500));
		System.out.println("Combining \"Hello\" and \"world\" gives: " + add("Hello", " world"));
	
	}

	//takes 2 doubles and adds them together
	public static double add(double a, double b){
	
		return a + b;
	}

	//takes 2 strings and adds them together
	public static String add(String a, String b){
	
		return a + b;
	}
}
