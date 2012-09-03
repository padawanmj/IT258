//Variables and Constants
//Written by: Melanie J. Hernandez
//Written: June 24, 2012
//I attest that this is my original work 

import javax.swing.JOptionPane;
public class MultiplyTwoIntegersWithCLI
{
	public static void main(String[] args)
	{
		String userInputOne = "", userInputTwo = "";
		int numberOne, numberTwo, product;
		if ( args.length > 0 ){
			if ( args[0] != "" ){
				userInputOne = args[0];
			}
			if ( args[1] != "" ){
				userInputTwo = args[1];
			}			
		}

		if ( userInputOne == "" ){
			userInputOne = JOptionPane.showInputDialog(null, "Enter the first number to multiply ");
		}

		if ( userInputTwo == "" ){
			userInputTwo = JOptionPane.showInputDialog(null, "Enter the second number to multiply");
		}
		numberOne = Integer.parseInt(userInputOne);
		numberTwo = Integer.parseInt(userInputTwo);
		product = numberOne * numberTwo;
		JOptionPane.showMessageDialog(null, "The result is " + product);
		System.exit(0);

	}	
}	
