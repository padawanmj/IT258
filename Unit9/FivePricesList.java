/**
* A java program that creates and uses an array variable.
* Written by: Melanie J. Hernandez
* Written: August 7, 2012
* I attest that this my original work.
*/

//This program will prompt the user for 5 prices and then return with the sum, avaerage and greater than average prices
import javax.swing.*;
public class FivePricesList
{

	public static double sumArray(double [] prices)    //this method receives and returns the sum user input
	{

		int i = 0;
		double price = 0;
		int length = prices.length;
		double sum = 0;

		for (i = 0; i < length; i++)
		{

			price = prices[i];
			sum += price;
		}	

		return sum;
	}

	public static double aveArray(double [] prices)    //this method receives and returns the average of the user input
	{

		int i = 0;
		double total = 0.00;
		int length = prices.length;

		for (i = 0; i < length; i++)
			total = total + prices[i];

		return total/length;

	}	
			
	public static void highPrices(double[] prices, double ave)    //this method receives the array and the average and then returns the amounts higher than average
	{

		int i = 0;
		int length = prices.length;

		for (i = 0; i < length; i++)
			if (prices[i] > ave)
				JOptionPane.showMessageDialog(null, "These prices are greater than the average price" + prices[i]);


	}
	
	public static void main(String[] args)
	{

		int i = 0;
		double[] price = new double[5];
		double ave = 0.00;
		double sum = sumArray(price);
		
		String price1, price2, price3, price4, price5;

		//The user needs to input prices

		price1 = JOptionPane.showInputDialog("Enter the first price: ");
		price2 = JOptionPane.showInputDialog("Enter the second price: ");
		price3 = JOptionPane.showInputDialog("Enter the third price: ");
		price4 = JOptionPane.showInputDialog("Enter the fourth price: ");
		price5 = JOptionPane.showInputDialog("Enter the fifth price: ");

		price[0] = Double.parseDouble(price1);
		price[1] = Double.parseDouble(price2);
		price[2] = Double.parseDouble(price3);
		price[3] = Double.parseDouble(price4);
		price[4] = Double.parseDouble(price5);

		sum = sumArray(price);
		JOptionPane.showMessageDialog(null, "The sum of all the prices entered is $" + sum);

		ave = aveArray(price);
		JOptionPane.showMessageDialog(null, "The average of all the prices entered is $" + ave);

		highPrices(price, ave);
	}	

}