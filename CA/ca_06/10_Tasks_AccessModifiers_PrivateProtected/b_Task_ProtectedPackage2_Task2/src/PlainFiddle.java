package plain;

public class PlainFiddle{
	//protected => package access OR through inheritance
	protected void play(){ //change to public for cf.play() to work
		System.out.println(this);
		System.out.println("play():\t\t plays ");
	}
}
