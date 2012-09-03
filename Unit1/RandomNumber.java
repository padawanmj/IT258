import javax.swing.JOptionPane;
public class RandomNumber
{
	public static void main(String[] args)
	{
		message("Think of a number between 1 and 10");
		message("The number is " + guess());
	}
	
	public static int guess(){
		int guess = (1 + (int) (Math.random() * 10));
		return guess;
	}
	
	public static void message(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
}