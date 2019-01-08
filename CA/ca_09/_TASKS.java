
		/**
		TASK01: Suppose you have pre-Java5.0 code such as:
		class Box{
			Object o;
			Object get(int index){
				return o;
		}
		Outline 2 advantages to a client-programmer, if converting
		the code to use generics. Give brief demo-code (compilable).
		//*/

		/*
		* TASK01 explanation
		* 
		* Advantage 1:
		* This removes the need of casting
		* Advantage 2:
		* It aids typesafety since the object will now be homogeneous
		*/
		//TASK01 Code
		// - See task01.java
		
/**
 
TASK02: Continuing from Box code above, suppose you also have
class Num{...}
class SmallNum extends Num{}

You want to have a method to accept a Box with either a 
Num or SmallNum type object inside -
e.g.
static void boxTest( ... boxToTest){
}
//*/
/*
 * TASK02 explanation
 */
//TASK02 Code 
// see Task02.java




/**
TASK03: Give an example of a generic method
with an upper-bounded Type parameter AND
compare it to the same only using a wild-card
//*/
/*
 * TASK03 explanation
 * 
 * In the first method you have a handle to the type parameter T. This
 * means that you can use it to define local variables of type T, cast 
 * to the type T, etc. 
 * 
 * In the second instance there is no handle to the type so you can't do
 * any of the things mentioned above.
 * 
 */
//TASK03 Code
public <U extends Num> void boxTest(U u){					//**HERE the type-specification will allow
	System.out.println("upperbound type param");		

}
public void compareBox(List<? extends Num> n){
	System.out.println("wilcard upper");		// 		only arguments of type Num or subclasses
}


/**
TASK04: Give an example of a generic method
with an lower-bounded Type parameter AND
compare it to the same only using a wild-card
//*/
/*
 * TASK04 explanation
 * 
 * lower bounded type parameters are not permitted. There
 * is no need to handle specific classes below the lower bounds 
 * can't be used to declare variables etc. since we do not 
 * inherit from subclasses of a class. [1]
 * 
 * The wildcard does not use a handle and is permitted* 
 * 
 */
//TASK04 Code
public <U super Num> void boxTest(U u){					
	System.out.println("upperbound type param");		

}
public void compareBox(List<? super SmallNum> n){
	System.out.println("wilcard upper");
}



/**
TASK05: Briefly summarise the Oracle Java Tutorial
guidelines for using wild-cards. State and explain
'In' and 'Out' type parameters and give examples.
//*/
/*
 * TASK5 explanation
 * 
 * 
    upper bounded wildcards define an in parameter.
    lower bounded wildcard define an out parameter.
    If the "in" parameter is accessible through an objects methods, use an unbounded wildcard.
	If you are0 accessing a parameter as both an "in" and an "out" parameter, do not use a wildcard.
	
	The above does not apply to a method's return type. This should be avoided.
	[2]

 * 
 * 
"In" parameter
	this refers to the data being input to a method as opposed to a parameter which stores the result.
An "Out" Variable
    this refers to the parameter storing data for later use 
 * 
 * for example,
 * detectSpots(image, results){
 * }
 * 
 * here image in the "in" parameter and results is the "out" parameter
 * /
 * 
[1] -http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeParameters.html#What%20is%20a%20bounded%20type%20parameter?
[2] - https://docs.oracle.com/javase/tutorial/java/generics/wildcardGuidelines.html