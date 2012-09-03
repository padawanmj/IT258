import javax.swing.JOptionPane;

public class BoxDialog
{
	public static void main(String[] args)
	{
		String userInputBoxOne = "", userInputBoxTwo = "", userInputBoxThree = "";
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

		int boxOne = Integer.parseInt(userInputBoxOne);
		JOptionPane.showMessageDialog(null, "The length of your line is " + boxOne + "." );

		if ( userInputBoxTwo == "" )
		{
			userInputBoxTwo = JOptionPane.showInputDialog(null, "To create a box please enter a length and a width (integers).");
		}

		int boxTwo = Integer.parseInt(userInputBoxTwo);
		JOptionPane.showMessageDialog(null, "The result is " + boxOne + " x " + boxTwo);

		if ( userInputBoxThree == "" )	
		{
			userInputBoxThree = JOptionPane.showInputDialog(null, "To create a rectangle please enter a length,a width, and a height (integers).");
		}

		int boxThree = Integer.parseInt(userInputBoxThree);
		JOptionPane.showMessageDialog(null, "The result is " + boxOne +", " + boxTwo + ", " + boxThree + " are the dimensions of your rectangle." );
	}
}