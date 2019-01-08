package classic;
import plain.PlainFiddle;

public class ClassicFiddle extends PlainFiddle{ //03 made public
	//package access => default constructor and playSweetly also
	public void playSweetly(){ //04 made public
		play(); //works! Accessing play() through inheritance
		System.out.println("playSweetly():\t & plays sweetly");

		//*TASK:
		PlainFiddle pf; // public class, so its ok
		pf = new PlainFiddle(); //2.1 Does this work?// yes, public since class is public and thus default constructor is
		// yes, the default PlainFiddle() constructor is public since the class is public

		//pf.play(); 		  	   //2.2 Does this work? Think about it!
		// no, because we are in the classic package and trying to access play in the plain package.
		//So, we are not in the same package and not using 'this' or 'super' so not inheritence.
		// Thus as oultined below the method play is not accessible.
								   //...protected access means...
								   // package
								   // OR
								   // through inheritance

		// could be fixed by making play() public
		//*/
	}

}
