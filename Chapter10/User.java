public abstract class User
{

	
	private String name;
	private Integer age;
	private String occupation;
	private String country;
	

	public String getName()
	{

		return this.name;
	}

	private void setName(String newName)
	{

		this.name = newName;
	}

	public void askName()
	{

		this.setName(this.ask("Please enter you name: "));
	}
	public void tellName()
	{

		this.tell("You said your name is " + this.getName());
	}
	public int getAge()
	{

		return this.age;
	}

	private void setAge(int newAge)
	{

		this.age = newAge;
	}

	public void askAge()
	{

		String answer = this.ask("Please enter you age: ");
		Integer age = Integer.parseInt(answer);
		this.setAge(age);
	}
	public void tellAge()
	{

		this.tell("You said your age is " + this.getAge());
	}
	public String getOccupation()
	{

		return this.occupation;
	}

	private void setOccupation(String newOccupation)
	{

		this.occupation = newOccupation;
	}

	public void askOccupation()
	{

		this.setOccupation(this.ask("Please enter your occupation: "));
	}
	public void tellOccupation()
	{

		this.tell("You said your occupation is " + this.getOccupation());
	}

	public String getCountry()
	{

		return this.country;
	}

	private void setCountry(String newCountry)
	{

		this.country = newCountry;
	}

	public void askCountry()
	{

		this.setCountry(this.ask("Please enter you country: "));
	}
	public void tellCountry()
	{

		this.tell("You said your country is " + this.getCountry());
	}
	public abstract String ask(String question);
	public abstract void tell(String message);
}




