class BlackBird extends Bird
{
	/*... inherited 
	 *String name;		
	 *String type;		
	 */
	BlackBird()
	{
		//super(); 
		/*...the following lines execute from call to super()...
		 *System.out.println("Bird Constructor");
		 *name="tippy";
		 *type = "robin";
		 */
		type = "blackbird";
		System.out.println("BlackBird Constructor");
	}
	
	void sing()
	{
		System.out.println("BlackBird sing(): chirp-chirp I'm a BlackBird");
	}
	
	boolean sings()
	{
		return true;
	}
}