/**
* Classes with methods and variables
* Written by: Melanie J. Hernandez
* Written: July 6, 2012
* I attest that this my original work.
*/
public class Circle1
{
	private static int circleCount = 0;

	private double radius;
	private String name;

	public Circle1()
	{
		radius = 1.0;
	}

	public Circle1(double rad)
	{
		radius = rad;

	}	 
	public void setRadius(double rad)
	{
		radius = rad;
	}
	public double getRadius()
	{
		return radius;
	}

	public double getDiameter()
	{
		return radius * 2;
	}

	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
}


