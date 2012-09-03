/**
* Creating and overloading methods
* Written by: Melanie J. Hernandez
* Written: July 7, 2012
* I attest that this my original work.
*/

public class Box
{
	
	private int length; //I have declared my length, width and height as integers.
	private int width;
	private int height;
	

	public Box (int x)
	{
	
		length = x; //I have set my line length with a value of x which will be instatiated in the BoxTest.java
		width = 0;
		height = 0;
	
		System.out.println("The line was created with a length of " + this.length + ".");
	}
	
	public Box (int x, int y)
	{
	
		length = x;  // I have set the box length to x and the width to y, the Box object will be instatiated in the BoxTest.java
		width = y;
		height = 0;
		
		System.out.println("The box was created with a length of " + this.length + " and a width of " + this.width + ".");
	}
	
	public Box (int x, int y, int z)
	{
		
		length = x;  // I have set the rectangle length to x and the width to y and the height to z, the Rectangle object will be instatiated in the BoxTest.java
		width = y;
		height = z;
		
		System.out.println("The rectangle was created with a length of " + this.length + " and a width of " + this.width + " and a height of " + this.height + ".");
	}
	
}