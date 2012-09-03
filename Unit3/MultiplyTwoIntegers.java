//Variables and Constants
//Written by: Melanie J. Hernandez
//Written: June 24, 2012
//I attest that this is my original work 

import javax.swing.JOptionPane;
public class MultiplyTwoIntegers
{
	public static void main(String[] args)
	{
		for ( String s: args ){
			System.out.println(s);
		}
		String userInputOne, userInputTwo;
		int numberOne, numberTwo, product;
		userInputOne = JOptionPane.showInputDialog(null, "Enter the first number to multiply ");
		userInputTwo = JOptionPane.showInputDialog(null, "Enter the second number to multiply");
		numberOne = Integer.parseInt(userInputOne);
		numberTwo = Integer.parseInt(userInputTwo);
		product = numberOne * numberTwo;
		JOptionPane.showMessageDialog(null, "The result is " + product);
		System.exit(0);

	}	
}	
