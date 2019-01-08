
class Runner
{
	public static void main(String[] args)
	{
		//Cs613 dealer = new Cs613(); //won't compile? why not?
		System.out.println("Call instance() first time");
		Cs613 module1 = Cs613.instance();
		System.out.println("Cs613.numObjects = "+Cs613.numObjects+", module1:"+module1);
		
		System.out.println("Call instance() second time");
		Cs613 module2 = Cs613.instance();
		System.out.println("Cs613.numObjects = "+Cs613.numObjects+", module2:"+module2);
		
	}
}