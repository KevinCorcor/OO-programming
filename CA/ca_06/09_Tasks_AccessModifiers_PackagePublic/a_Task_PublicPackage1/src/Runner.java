/*
 * Study the code in this folder and
 *	a) identify the three changes required to make this compile and run.
		01: Cider.java - line 3
		02: Apple.java - line 3
		03: Apple.java - line 6
 *	b) specify the compile statements needed to compile each file
		From within src/ Run
			javac -d ../bin *.java -cp ../bin *.java
*/
package drinks;

class Runner{
	public static void main(String[] args){
		System.out.println("Run Cider");
		new Cider();						// must be in the same package
	}
}
