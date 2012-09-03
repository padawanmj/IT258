/**
* Classes with methods and variables
* Written by: Melanie J. Hernandez
* Written: July 6, 2012
* I attest that this my original work.
*/

/** 
* Create a class with methods and variables. Show how to instantiate objects.
* I have created a class named Circle with a radius field of the type double to accomodate the use of decimals.
*/
public class Circle
{
	private static int circleCount = 0;

	private double radius;
	
	// The default Circle is to have a radius of 1 for the default constructor as shown here.
	public Circle()
	{
		radius = 1.0;
	}

	public Circle(double rad)
	{
		radius = rad;

	}	
	//This is the method to set the value of the radius. 
	public void setRadius(double rad)
	{
		radius = rad;
	}
	// This is the method to return the value of the radius.
	public double getRadius()
	{
		return radius;
	}
	// This is the method to compute and return the diameter of the circle.
	public double getDiameter()
	{
		return radius * 2;
	}
	//This is the method to compute and return the area of the circle. 
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
}


