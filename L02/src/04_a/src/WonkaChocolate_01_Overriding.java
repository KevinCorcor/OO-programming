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
	void taste()					//A method "override"
	{
		System.out.println("Oh!... Wonka chocolate! Yum! \n");
	}

	void checkForGoldenTicket()
	{
		//a "ternary expression"
		System.out.println( (Math.random() > .2)? "you win"  : "you loose" );
	}

}

class RunChocolateBars
{
	public static void main(String[] args)
	{
		ChocolateBar plain = new ChocolateBar();
		plain.taste(); //prints "plainChocolate"
			
		WonkaChocolateBar wonka = new WonkaChocolateBar();	
	    wonka.taste(); //prints "wonka chocolate!, yum" - method "override"
	}
}

