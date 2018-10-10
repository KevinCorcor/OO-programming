class Bird
{
	String name;
	String type;
	
	Bird()
	{
		System.out.println("Bird Constructor");
		name="tippy";
		type = "robin";
	}
	
	void sing()
	{
		System.out.println("Bird sing() method");
	}

	boolean sings()
	{
		return true;
	}
	
}