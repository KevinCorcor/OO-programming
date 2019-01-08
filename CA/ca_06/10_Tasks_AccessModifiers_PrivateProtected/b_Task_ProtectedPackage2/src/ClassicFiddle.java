package classic;
import plain.PlainFiddle;

class ClassicFiddle extends PlainFiddle{
	//package access => default constructor and playSweetly also
	void playSweetly(){
		play(); //works! Accessing play() through inheritance
		System.out.println("playSweetly():\t & plays sweetly");

		//*TASK:
		PlainFiddle pf; // public class, so its ok
		pf = new PlainFiddle(); //2.1 Does this work?
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
