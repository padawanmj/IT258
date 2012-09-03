import javax.swing.JOptionPane;
public class BoxDialog
{
	public static void main(String[] args)
	{
		String userInputBoxOne = "", userInputBoxTwo = "", userInputBoxThree;
		int numberOne, numberTwo, numberThree, result;
		if ( args.length > 0 )
		{
			if ( args[0] != "" )
			{
				userInputBoxOne = args[0];
			}
			if ( args[1] != "" )
			{
				userInputBoxTwo = args[1];
			}
			if ( args[2] !="")
			{
				userInputBoxThree = args[2];
			}			
		}

		if ( userInputBoxOne == "" )
		{
			
			userInputBoxOne = JOptionPane.showInputDialog(null, "To create a line please enter a length (integer).");
		}
		boxOne = Integer.parseInt(userInputBoxOne);
		JOptionPane.showMessageDialog(null, "The length of your line is " + this.length + "." );

		if ( userInputBoxTwo == "" )
		{
			userInputBoxTwo = JOptionPane.showInputDialog(null, "To create a box please enter a length and a width (integers).");
		}
		boxTwo = Integer.parseInt(userInputBoxTwo);
		JOptionPane.showMessageDialog(null, "The result is " + this.length + this );

		if ( userInputBoxThree == "" )	
		{
			userInputBoxThree = JOptionPane.showInputDialog(null, "To create a rectangle please enter a length,a width, and a height (integers).");
		}
		boxThree = Integer.parseInt(userInputBoxThree);
		JOptionPane.showMessageDialog(null, "The result is " + this.length +", " + this.width + ", " + this.height + "are the dimensions of your rectangle." );
			
		}
		//boxOne = Integer.parseInt(userInputBoxOne);
		//boxTwo = Integer.parseInt(userInputBoxTwo);
		//boxThree = Integer.parseInt(userInputBoxThree);
		{

	Box line = new Box(7);   //This class, the TestBox class, has been created to demonstrate that each constructor works correctly.
	Box box = new Box(14,21);
	Box rectangle = new Box(1,2,3);
	}
		//JOptionPane.showMessageDialog(null, "The result is " + this.length + this );
		System.exit(0);

	}	
}	