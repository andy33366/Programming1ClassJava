/*
 *
 *In class 13
 *
 */

public class Cube{

	//declares side field
	double side;

	//declares methods of the class
	//default constructor for a default side of 1
	public Cube(){
	
		side = 1;//default side

	}
	//constructor to choose side size
	public Cube(double newSide){
	
		side = newSide;
	}
	//gets side of cube object
	public double getSide(){
	
		return side;
	}
	//gets surface area of cube object
	public double getSurfaceArea(){
	
		return Math.pow(side, 2) * 6;//formula for surface area
	}
	//gets volume of cube object
	public double getVolume(){
	
		return Math.pow(side, 3);//formula for circumference
	}
	//updates side of cube object
	public void setSide(double newSide){
	
		side = newSide;
	}
}


