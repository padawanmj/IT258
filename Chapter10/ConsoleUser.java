import java.io.Console;
public class ConsoleUser extends User
{
	private Console cons;

	public ConsoleUser()
	{
		cons = System.console();
	}
	public String ask(String question)
	{

		return this.cons.readLine(question);
	}

	public void tell(String message)
	{
		System.out.println(message);
	}
}