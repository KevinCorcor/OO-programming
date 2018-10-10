class Emu extends Bird
{
	/*... inherited 
	 *String name;		
	 *String type;		
	 */
	Emu()
	{
		/*...the following lines execute from call to super()...
		 *System.out.println("Bird Constructor");
		 *name="tippy";
		 *type = "robin";
		 */
		System.out.println("Emu Constructor");
	}
	
	void sing()
	{
		System.out.println("Emu sing(): Coo Koo, I'm an E-M-uh");
	}
	
	//remove this method - it doesn't make sense to provide the same implementation 
	// (you can just inherit it!)
	boolean sings()
	{
		return true;
	}
}