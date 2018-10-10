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
		super.taste();			
		System.out.println("Oh!... Wonka chocolate! Yum! \n");
	}

	void checkForGoldenTicket()
	{
		System.out.println((Math.random() > .2)? "you win"  : "you loose");
	}

}

class RunChocolateBars
{
	//...now showing polymorphism in use with an array of sub-class objects,
	//		referred to by the super-class interface.
	//...also showing dynamic type-checking with Java's 'instanceof' operator
	public static void main(String[] args)
	{
		ChocolateBar[] bars = {new ChocolateBar(), new WonkaChocolateBar()};
		//bars[1].taste();
		
		for( ChocolateBar b: bars)
		{
			b.taste();
			
			if( b instanceof WonkaChocolateBar) //if it's a Wonka, check for a Golden ticket
			{
				WonkaChocolateBar wonkaRef = (WonkaChocolateBar) b; //Note: a "downcast"
				wonkaRef.checkForGoldenTicket();
				
			}//Note: this 'instanceof' kind of type-checking is not recommended.
			 // 	It is shown here, purely to to demonstrate the 'instanceof' operator 
			 //		and to illustrate the polymorphism in use.
			
		}
	}
}

/*
*       //Note, above, in RunChocolateBars
*		//	the enhanced for - is equivalent to the following 
*		for(int i=0; i< bars.length; i++)
*		{
*			bars[i].taste();
*		}	
*		
*		//try it and see
*/