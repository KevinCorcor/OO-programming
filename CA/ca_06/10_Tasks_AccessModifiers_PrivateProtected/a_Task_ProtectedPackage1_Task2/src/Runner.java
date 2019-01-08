/*
 * TASK01: Examine the code in this folder and make
 * whatever changes are necessary to get it to
 * compile and execute.
 *
 * TASK02: Remove the 'package classic;' statement
 *			from this file and repeat the task01

 	01: Runner.java - line - 14
	02: Runner.java - line - 15
	03: ClassicFiddle.java - line 12
	04: ClassicFiddle.java - line 14
 */
//package classic; // 01: removed - Task 02
import classic.ClassicFiddle; // 02: needed from package
class Runner{
	public static void main(String[] args){
		ClassicFiddle cf = new ClassicFiddle(); //same package so its okay
		//cf.play();		//doesn't work: why?
		//because it is protected. This means it must be called using
		//inheritence or package access. ie there should be 'this.play()',
		//'super.play()' or 'play()' of which we have neither.
		// if play() was made public 'cf.play()' would work correctly
		cf.playSweetly();
	}
}
