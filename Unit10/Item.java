//Applying Java objects and structures to development 
//Written: August 14, 2012
//Written By: Melanie J. Hernandez
//IT258Java Professor Whale
// I attest that this is my original work.



public class Item
{

	private String name = "";   //to hold the item name
	private double price = 0.00;  //to hold the price

	public Item(String startName, double startPrice)   
	{
 
		name = startName;         //initializing instance variables
		price = startPrice;

	}

	public int compareTo(Item aItem, String compareBy)
	{
		if (compareBy.equals("n"))
		{
			return name.compareTo(aItem.name);             //when n is chosen the output needs to compare the names of the items
		}                                                  //and arrange them alphabetically
		if (compareBy.equals("p"))                         //when p is chosen the output needs to sort and compare according to
		{                                                  //the item prices and display accordingly
			return (int)((price - aItem.price) *10);
		}
		return 0;
	}
	public String getName()
	{

		return name;
	}

	public void setName(String newName)
	{

		name = newName;
	}

	public double getPrice()
	{

		return price;
	}

	public void setPrice(double newPrice)
	{

		price = newPrice;

	}

	public String toString()
	{

		return this.getName() + " " + this.getPrice(); 
	}
}