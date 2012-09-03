/**
* Classes with methods and variables
* Written by: Melanie J. Hernandez
* Written: July 6, 2012
* I attest that this my original work.
*/
// This is an example of an object being instantiated.
public class TestCircle
{
	public static void main(String[] args)
	{
		// The first Circle, a, is to have a radius of 10 and the second Circle, b, has a radius that is set by the default constructor which is located in the Circle class. 
		Circle a = new Circle(10.0);
		Circle b = new Circle();

		// I have included verbiage to explain the outcome of the diameter and area for the Circles, a and b.
		System.out.println( "The Circle with a radius of " + a.getRadius() + " and a diameter of " + a.getDiameter()  + " has an area of " + a.getArea() + "." );
		System.out.println( "The Circle with a radius of " + b.getRadius() + " and a diameter of " + b.getDiameter() + " has an area of " + b.getArea() + ".");
	}
}