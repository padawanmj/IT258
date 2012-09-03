/**
* A Java program that utilizes String objects and String functions.
* Written by: Melanie J. Hernandez
* Written: July 27, 2012
* I attest that this is my original work.
*/

import javax.swing.*;
public class PasswordPrompt
{

	public static void main(String[] args)
	{

		String passWord = "";				
		String confirmPassword = "not valid"; 
		int i = 0;
		char p;

		Boolean noLetters = true;
		Boolean noDigits = true;
		
		//Need to make sure of its length 6-10 characters

		String message = "Please enter a password which contains 6-10 characters, with at least one letter, and one digit";

		while (passWord.length() < 6 || passWord.length() > 10 || noLetters || noDigits )    //this method checks to make sure that the password is at least 6 character, no more than 10 character, and contains at least 1 letter and 1 number.
		{																						
			noLetters = true; //prevents user from hacking the method. If only letters are entered the first time through and then only digits are entered the next time the password is entered then the program will think that the conditions have been satisfied.
			noDigits = true;
			passWord = JOptionPane.showInputDialog(null, message); 
			
			for (i = 0 ; i < passWord.length(); i++)	//iterating through characters in password
			{
				
				p = passWord.charAt(i);
				if (Character.isLetter(p))			//Verifying conditions are met, if not then user is prompted to re-enter. If conditions are met then user is asked to reconfirm password. 
					noLetters = false;
				if(Character.isDigit(p))
					noDigits = false;
			}
			message = "Please enter a valid password. (at least one letter, one number, longer than six and shorter than ten.)";
		}	

		while (!passWord.equals(confirmPassword)) 	
		{
			confirmPassword = JOptionPane.showInputDialog(null, "Please retype your password for confirmation");
		}

		// Password is valid and strong
		JOptionPane.showMessageDialog(null, "You have successfully confirmed your password");
		

	}
}