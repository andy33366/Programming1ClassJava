/*
 *
 * sphere lab 13
 *
 */

public class Sphere{

	//declares radius field
	double radius;

	//declares methods of the class
	//default constructor for a default radius of 1
	public Sphere(){
	
		radius = 1;//default radius

	}
	//constructor to choose radius size
	public Sphere(double newRadius){
	
		radius = newRadius;
	}
	//gets radius of Sphere object
	public double getRadius(){
	
		return radius;
	}
	//gets surface area of sphere object
	public double getSurfaceArea(){
	
		return Math.PI*4*Math.pow(radius, 2);//A=pi4r^2
	}
	//gets volume of sphere object
	public double getVolume(){
	
		return 4.0/3*Math.PI*Math.pow(radius, 3);//formula for volume
	}
	//updates radius of sphere object
	public void setRadius(double newRadius){
	
		radius = newRadius;
	}
}


