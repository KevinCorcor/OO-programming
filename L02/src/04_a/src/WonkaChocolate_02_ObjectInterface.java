/*
*This work by Rob Cleary is licensed under a Creative Commons AttributionShareAlike
*3.0 Unported License. Based on a work at www.usethetools.net. Permissions beyond
*the scope of this license may be available via usethetoolsinstructor1@gmail.com.
*/
class ChocolateBar
{
	void taste()
	{
		System.out.println("Mmnn...Chocolate Taste \n");
	}
}

class WonkaChocolateBar extends ChocolateBar
{
	void taste()
	{
		System.out.println("Mmnn...Chocolate Taste \n");
		System.out.println("Oh!... Wonka chocolate! Yum! \n");
	}
	
	void checkForGoldenTicket()
	{
		//a "ternary expression" inside the ...println()
		System.out.println( (Math.random() > .2)? "you win"  : "you loose" );
	}
}

class RunChocolateBars
{
	public static void main(String[] args)
	{
		ChocolateBar bar1 = new ChocolateBar();
		ChocolateBar bar2 = new WonkaChocolateBar();
		bar1.taste();				
		bar2.taste();
		bar2.checkForGoldenTicket();//will not compile
		// A ChocolateBar reference (super-class) can "refer to"
		//  a WonkaChocolateBar Object (sub-class Object)
		// 	but only use the ChocolateBar interface
	}
}

