/**
 *TASK:
 *	We're going to use the following two utilities in to create quick collections
 *	of Strings for the tasks in this folder.
 *	- Arrays.asList() 					//java.util.Arrays is a utility class with handy methods for collections/array processing
 *	- String.split(delimeter:String) 	//java.lang.String - method to create an array from a String of values
 *
 *	1. String.split() - try the following, and see that in each case you get back an array of String
 *
 		String[] s = "each word in this string is seperated by a space".split(" ");	
 		for(String word: s){System.out.println(word);}
		s.getClass(); //the getClass() method of java.lang.Object returns the class (/type) of object
 *	
 *	2. See the Java documentation here: 
		http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#asList%28T...%29
 *		for Arrays.asList() 
 *		//note: you can pass it a set of comma-seperated values, or an array of values: e.g.
 *		//a) for String objects
 *				List<String> l1 = Arrays.asList("this", "that", "these", "those"); //see returns a List<T>
 *				List<String> l2 = Arrays.asList( new String[]{"father", "mother", "brother", "other"} );
 *
 *	//You may find the String.split() slightly easier to use: i.e.
 *				List<String> l3 = Arrays.asList( "how now brown cow".split(" ") ); //the String.split() creates an array argument
 
 *	3. See Collections.addAll() here:
			Collections.addAll( l1, "I", "owe", "you")
 */

import java.util.*;
public class Task_00{
	public static void main(String args[]){
		
		System.out.println("########################## 1 #############################");
		
		System.out.println( "I am just cultivating mass".split(" ").getClass() ); // out: class [Ljava.lang.String;
		/* If this class object represents a class of arrays, then the internal form of the name consists of the name
		 of the element type preceded by one or more '[' characters representing the depth of the array nesting. [1]
		 */ 
		for (String item: "There is no Pepe Silvia".split(" ")){
			System.out.println(item.getClass());
		}


		
		System.out.println("########################## 2 #############################");
		
		List<String> l1 = Arrays.asList("A starter car?! This car is a finisher car!".split(" "));
		System.out.println(l1);

		List<String> l2 = Arrays.asList("Care","for","an,","egg", "in", "this", "trying","time");
		System.out.println(l2);


		
		System.out.println("########################## 3 #############################");

		try{
			Collections.addAll(l1, "A", "Transporter", "of", "gods");
		}catch(Exception UnsupportedOperationException){ //[2]
			
			System.out.println("Collections.addAll(l1, 'A', 'Transporter', 'of', 'gods'); Fails since l1 is of type "+ l1.getClass()+ ". So lets try something else");
			/*
			 java.util.Arrays$ArrayList is a nested class inside the Arrays class that implements the List interface. 
			 This implementation has a fixed length and is backed by an array.
			 The method Arrays.asList returns an instance of this class.[3]
			*/
			List<String> arrlist = new ArrayList<String>(l1);
			System.out.println(arrlist.getClass());
			Collections.addAll(arrlist, "A", "Transporter", "of", "gods");
			System.out.println(arrlist);
		}
	}
}
 
/*
[1] - https://stackoverflow.com/questions/3442090/java-what-is-this-ljava-lang-object
[2] - https://stackoverflow.com/questions/7399482/java-lang-unsupportedoperationexception-at-java-util-abstractlist-removeunknown
[3] - https://stackoverflow.com/questions/29574436/what-does-java-util-arraysarraylist-mean?rq=1
*/