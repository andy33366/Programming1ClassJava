/*
 *
 *In class 13
 *
 */

import java.util.Scanner;

public class SphereDemo {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		//constructs a sphere object of raduis = 5
		Sphere sphere = new Sphere(5);

		System.out.println("The radius is: "+sphere.getRadius());	
		System.out.println("the surface area is: "+sphere.getSurfaceArea());	
		System.out.println("The volume is: "+sphere.getVolume());
		sphere.setRadius(7.5);	
		System.out.println("The new radius is: "+sphere.getRadius());	
		System.out.println("the new surface area is: "+sphere.getSurfaceArea());	
		System.out.println("The new volume is: "+sphere.getVolume());


	}
}


