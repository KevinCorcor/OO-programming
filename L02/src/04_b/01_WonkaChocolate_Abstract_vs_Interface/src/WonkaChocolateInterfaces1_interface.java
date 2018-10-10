/*
*This work by Rob Cleary is licensed under a Creative Commons AttributionShareAlike
*3.0 Unported License. Based on a work at www.usethetools.net. Permissions beyond
*the scope of this license may be available via usethetoolsinstructor1@gmail.com.
*/
interface ChocolateBar	//ChocolateBar now an interface
{
	void taste();		//public void taste(); //implicitly in Java interfaces are public
}




class WonkaChocolateBar implements ChocolateBar			//declares it implements the interface
{
	public void taste(){								// implements the interface here
		//no 'super' now (try-it!)
		System.out.println("Oh!... Wonka chocolate! Yum! \n");
	}

	void checkForGoldenTicket()
	{
		System.out.println((Math.random() > .2)? "you win"  : "you loose");
	}	
}


class RunChocolateBars
{
	public static void main(String[] args)
	{
		ChocolateBar b = new WonkaChocolateBar(); 
		b.taste();
		//...now showing that an interface-type is usable as the type of a 
		//		reference to an Object, once that Object's class
		//		declares that it implements that interface.
		// Note: just pure interface now. All parts of an interface are public
		//			and typically, there are no attributes (there can be attributes in an interface)
	}
}
//*In Java you can have attributes in an interface but they are public
//	constants only.

