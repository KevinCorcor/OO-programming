package plain;

public class PlainFiddle{

	// default constructor will be public since class is
						//TASK: change to:
	protected void play(){ // 01: changed from package access to protected, this allows ClassicFiddle to access it
		System.out.println(this);
		System.out.println("play():\t\t plays ");
	}

}
/*
 * Above, changing to 'protected void play(){...'
 * allows access to sub-classes that are outside of
 * the 'plain' package.
 */
