/*
 *
 *In class 13
 *
 */

public class Circle{

	//declares radius field
	double radius;

	//declares methods of the class
	//default constructor for a default radius of 1
	public Circle(){
	
		radius = 1;//default radius

	}
	//constructor to choose radius size
	public Circle(double newRadius){
	
		radius = newRadius;
	}
	//gets radius of circle object
	public double getRadius(){
	
		return radius;
	}
	//gets area of circle object
	public double getArea(){
	
		return Math.PI * Math.pow(radius, 2);//formula for area
	}
	//gets circumference of circle object
	public double getCircumference(){
	
		return 2 * Math.PI * radius;//formula for circumference
	}
	//updates radius of circle object
	public void setRadius(double newRadius){
	
		radius = newRadius;
	}
}


