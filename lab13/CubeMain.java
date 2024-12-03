/*
 *
 *In class 13
 *
 */

import java.util.Scanner;

public class CubeMain {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);

		Cube cube = new Cube(5);

		System.out.println(cube.getSide());	
		System.out.println(cube.getSurfaceArea());	
		System.out.println(cube.getVolume());
		cube.setSide(2);	
		System.out.println(cube.getSide());	
		System.out.println(cube.getSurfaceArea());	
		System.out.println(cube.getVolume());


	}
}


