/**
* A java program that contains loop structures.
* Written by: Melanie J. Hernandez
* Written: July 24, 2012
* I attest that this my original work.
*/

public class SquareNum // Class
{

	public static void main(String[] args)
	{

		squareFor();		//method/ procedure 
		squareDoWhile();	//method/ procedure
	}

	public static void squareFor()
	{

		int i = 1;
		System.out.println("The squares using a for statement are: ");

		for (i = 1; i < 11; i++) // For i equals one and as long as i is less than eleven, increment by 1
			System.out.println(i + " " + i * i); //Print out i as the initial value and then multiply it by itself, return to the for statement, increment and multiply again until i is no longer less than 11.

	}

	public static void squareDoWhile()
	{

		int i = 1;
		System.out.println("The squares using a do...while statement are: ");

		do
		{
			System.out.println(i + " " + i * i); //This is saying to print i and i * i 
		}
		while (i++ < 10); //while incrementing until i reaches 10.
	}

}

