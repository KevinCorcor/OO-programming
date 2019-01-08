/*
 * Study the code in this folder and
 *	a) identify the six changes required to make this compile and run.
 		01: Cider.java - line 3
		02: Cider.java - line 4
		03: Apple.java - line 7
		04: Apple.java - line 2
		05: Apple.java - line 10
		06: Fruit.java - line 3
 *	b) specify the compile statements needed to compile each file
		From within src/ Run
			javac -d ..\bin *.java -cp ../bin *.java
 */
package drinks;
class Runner{
	public static void main(String[] args){
		System.out.println("Run Cider");
		new Cider();
	}
}
