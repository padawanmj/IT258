import javax.swing.*;
public class SwingUser extends User
{

	
	public SwingUser()
	{
		
	}

	public String ask(String question)
	{

		return JOptionPane.showInputDialog(question);
	}

	public void tell(String message)
	{

		JOptionPane.showMessageDialog(null, message);
	}

	
}