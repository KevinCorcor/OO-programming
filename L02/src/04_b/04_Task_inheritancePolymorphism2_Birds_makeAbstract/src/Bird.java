//TASK: Make this class abstract
class Bird
{
	/* ...
	 * ...note all subclasses will inherit these
	 */
	String name;		
	String type;		
	boolean sings;
	
	Bird()
	{
		System.out.println("JVM making a Bird()");
		sings = true; 								//by default all inheriting Birds will sing
	}												// unless they choose to override

	//TO DO: make this method abstract: what effect does it have on any sub-class?
	void sing()
	{
		System.out.println("sing() - Bird.java");
	}
	
	boolean sings()
	{
		return sings;
	}

	
}