import java.util.Scanner;
public class DemoVariables2
{
	public static void main (String[] args)
	{
	   int entry;
	   Scanner keyBoard = new Scanner(System.in);
	   System.out.print("Enter an integer ");
	   entry = keyBoard.nextInt();
	   keyBoard.nextLine();
	   System.out.println("Your entry is " + entry + ".");
	}
}