public class UserTest
{
	private static void testUser(User user)
	{

		user.askName();
		user.tellName();
		user.askAge();
		user.tellAge();
		user.askOccupation();
		user.tellOccupation();
		user.askCountry();
		user.tellCountry();
	
	}
	public static void main(String[] args) 
	{
	
		ConsoleUser user = new ConsoleUser();
		SwingUser sUser = new SwingUser();
		testUser(user);
		testUser(sUser);

	}

}