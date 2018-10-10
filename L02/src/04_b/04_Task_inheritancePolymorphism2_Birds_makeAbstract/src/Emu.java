class Emu extends Bird
{
	Emu()
	{
		System.out.println("Emu Constructor");
	}
	
	//TASK: try to omit this method after making Bird.sing() an abstract method and
	//		see what effect it has
	
	void sing()
	{
		System.out.println("Coo Koo, I'm an E-M-uh");
	}
	
}