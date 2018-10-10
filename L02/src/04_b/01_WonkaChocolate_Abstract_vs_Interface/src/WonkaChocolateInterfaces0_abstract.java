/*
*This work by Rob Cleary is licensed under a Creative Commons AttributionShareAlike
*3.0 Unported License. Based on a work at www.usethetools.net. Permissions beyond
*the scope of this license may be available via usethetoolsinstructor1@gmail.com.
*/
abstract class ChocolateBar				//an abstract class
{
	double cocoaPercentage;				//with an attribute 
	void taste()
	{
		System.out.println("Mmnn...Chocolate Taste \n");
	}
}
class WonkaChocolateBar extends ChocolateBar
{
	void taste()
	{
		super.taste();												//"re-use" super-class implementation
		System.out.println("Oh!... Wonka chocolate! Yum! \n");		// ...& "extend" it
	}

	void checkForGoldenTicket()										// extension here also
	{
		System.out.println((Math.random() > .2)? "you win"  : "you loose");
	}

}
class RunChocolateBars
{
	public static void main(String[] args)
	{
		ChocolateBar b = new WonkaChocolateBar(); 
		System.out.println( b.cocoaPercentage );				//Note: the attribute is also accessible: it's part of the interface
		//Note: above, as before, we have polymorphism.
		//Now, the reference 'b' has a ChocolateBar interface as per the above 'abstract' class
		//		definition.
	}
}

