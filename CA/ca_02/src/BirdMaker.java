/*
*	This is a main class, which intends to create an array of type
*	Bird {abstract}, and populate it randomly with the concrete types:
*		BlackBird or Emu
*	after which, a call to sing() is made. Depending on the concrete
*	object type, a differing sing() implementation should execute.
*/
import java.util.Random;

class BirdMaker{

	public static void main(String[] args){

		Random rand =  new Random();
		Bird[] birds = new Bird[6];			//new empty Bird[]

		for( int i = 0; i < birds.length; i++ ){
			birds[i] = (rand.nextInt(2)==0)? new Emu() : new BlackBird();
			Bird b = birds[i];		//[*]
			b.sing();				//[*] a polym___h_c call
			System.out.println(b.canFly());
		}

	}
}
/* After you understand the above example and have gotten it to execute successfully...
	try to replace the two lines marked [*] with just this _one_ equivalent expression:
		birds[i].sing();
	and see that it works the same
*/
