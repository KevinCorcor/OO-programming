class BlackBird extends Bird
{
	BlackBird()
	{
		System.out.println("Blackbird Constructor");
	}
	
	void sing()
	{
		System.out.println("ChirpChirp I'm a Blackbird");
	}
	
	//TASK: remove this method - it doesn't make sense to provide the same implementation 
	// (you can just inherit it!)
	boolean sings()
	{
		return true;
	}

	
}