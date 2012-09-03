/**
* Creating and overloading methods
* Written by: Melanie J. Hernandez
* Written: July 17, 2012
* I attest that this my original work.
*/

import javax.swing.*; //Allows me to refer to a class within a package that it resides in without qualifiying it
public class Entrance 
{

	public static validateNumericEntry(int value, int min, int max)
	{
		try 
		{

		}
	}

	public static validateNumericEntry(double value, double min, double max)
	{
		try 
		{

		}
	}

	public static String dialog(String message)
	{
		return JOptionPane.showInputDialog(message);
	}

	public static int getIntScore(String type, String message, String err_message){
		try {
			int entry = validateNumericEntry(Integer.parseInt(dialog(message)), 0, 100);
			if ( entry == null ){
				// cancel case
			} else {
				return entry;
			}
		} catch {
			// error case
			return getIntScore(type, err_message, err_message);
		}
	}

	public static int getDoubleScore(String type, String message, String err_message){
		try {
			int entry = validateNumericEntry(Double.parseDouble(dialog(message)), 0.0, 4.0);
			if ( entry == null ){
				// cancel case
			} else {
				return entry;
			}
		} catch {
			// error case
			return getDoubleScore(type, err_message, err_message);
		}
	}

	public static void main(String[] args)
	{

		JOptionPane.showMessageDialog(null, "Welcome to the College Admissions Department."); //Welcome message

		String gpaScore =; //Opens a dialog box which can accept doubles for the student's GPA
		if (gpaScore && gpaScore.length > 0){
			double gpa = Double.parseDouble(gpaScore);
		} else {

		}

		String entranceScore = JOptionPane.showInputDialog("Please enter your entrance score."); //Accepts integers for the student's entrance score
		int ent = Integer.parseInt(entranceScore);


		accepted(gpa, ent); //methods
	}

	public static void accepted(double gpa, int ent)
	{

		if((gpa >= 0.0 && gpa <= 4.0) || ent >= 85) //This line allows GPAs between 0.0 and 4.0 and above 85.
			JOptionPane.showMessageDialog(null, "We are pleased to accept you at our school.");
		else if ((gpa >= 3.0 || gpa <= 4.0) && ent >= 60) //This accepts students with GPAs over 3.0 and entrance scores over 60.
			JOptionPane.showMessageDialog(null, "We are pleased to accept you at our school.");
		else if (gpa <= 2.9 && ent <= 59) // This is a nice rejection message.
			JOptionPane.showMessageDialog(null, "Rejected, please retest and try again.");
		else if ((gpa > 4.0 || ent < 0.0) && ent < 100) //This line is error checking for numbers outside of the scope, if outside then an invalid ammount message is diplayed.
			JOptionPane.showMessageDialog(null, "Please enter a valid amount.");
	}
}