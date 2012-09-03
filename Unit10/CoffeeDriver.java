//Applying Java opjects and structures to development 
//Written: August 14, 2012
//Written By: Melanie J. Hernandez
//IT258Java Professor Whale
// I attest that this is my original work.

import java.io.Console;
import javax.swing.*;

public class CoffeeDriver
{

	private static Item[] items = {};                 //The Coffee Driver class includes the methods for 
                                                      //sorting the array of items either by name (n)
	public static void out(String message)            
	{                                                 //or by price(p) 

		System.out.println(message);
	}

	public static String in(String message)
	{

		Console console = System.console();
		String input = console.readLine(message);           //using the console class for program input and output
		
		return input;
	}
		

	public static void sortName()
	{

		sort(items, "n");
	}

	public static void sortPrice()
	{

		sort(items, "p");
	}

	private static void fillItems()
	{
		items = new Item[5];
		String[] itemName = {"Coffee", "Water", "Milk", "Bagel", "Donut"};
		double[] itemPrice = {1.00 , 2.00, 1.50, 1.25, .75};


		for (int i = 0; i < items.length; i++)
		{

			items[i] = new Item(itemName[i], itemPrice[i]);
			
		}

	}
	
	public static void sort(Item[] array, String compareBy)
	{
		int i, j;
		Item temp;
		int endIndex = array.length - 1;                                 
		for ( i = 0; i < endIndex; ++i)
			for ( j = 0; j < endIndex; ++j)
				if(array[j].compareTo(array[j + 1], compareBy) > 0)
				{

					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}
	private static void printList()
	{

		String output = "Item #  Name  Price\n";                 //menu items that are displayed to screen according to comparison/ sort
		for (int i = 0; i < items.length; i++)
		{                                                        //and listed according to user preference (name or price)    

			output += (i + ". " + items[i].toString() + "\n");
		}
		JOptionPane.showMessageDialog(null, output);
	}

	private static void renderMenu()
	{

		out("Welcome to Wings Coffee Shop.");                     
		out("=============================");
		out("We have a great list of items on our menu.");
		String sortIn = in("Would you like to see our menu sorted by name or price? (n/p): ");
	
		if (sortIn.equals("n"))
		{
			 sortName();
		}
		else if (sortIn.equals("p"))
		{
			 sortPrice();
		}

	}
		

		public static void main(String[] args)
		{
			fillItems();
			renderMenu();            //results rendered to the user
			printList();
		}
	



}