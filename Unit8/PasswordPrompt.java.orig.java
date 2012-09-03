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

		String passWord;   //Need to get the password

		int i;
		char p;
		
		passWord = JOptionPane.showInputDialog(null, "Please enter a password which contains 6-10 characters, with
			at least one letter, and one digit");
		
		
		
		
		int length = passWord.length//passWord.getLength();	//Need to make sure of its length 6-10 characters
		for(i = 0; i < length; i++)
		{
			
			while(passWord.length < 6 && passWord.length < 11) 

			p = passWord.charAt(i);
		}
		// Checking for invalid input

		if(passWord.isLetter(p))    //test for at least 1 letter
			letter = true;
		else
			System.out.println("Please enter a strong valid password \n(Must contain at least one letter)");
		isWhiteSpace())	
		if(passWord.isDigit(c))    //test for at least 1 digit
			digit = true;
		else
			System.out.println("Please enter a strong valid password \n(Must contain atleast one number"));
		if(password.isWhiteSpace())			//test for spaces in password
			whitespace = false;
			System.out.println("Spaces are not valid in passwords, please try again");
		if(passWord.getlength < 5)    //at least 6 characters long
			System.out.println("Please choose a strong password between 6 and 10 characters long");
		if(passWord.getlength > 10)    // no more than 10 characters long
			System.out.println("Please choose a strong password between 6 and 10 characters long");	

		// Confirming password match

		String confirmPassword = JOptionPane.showInputDialog(null, "Please retype your password for confirmation")

		// Password is valid and strong

		JOptionPane.showMessageDialog(null, "You have successfully confirmed your password")
		

	}
}