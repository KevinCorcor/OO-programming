/**
 *TASK:
 *	Create a test program to demo java.util.ArrayList to yourself. 
 * 		You need only use ArrayList<String>.
 *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 *	
 * 1) In the program - demonstrate the following:
 *		a) set()
 *		b) subList()
 *		c) addAll()		//briefly comment what this does
 *		d) retainAll()	//briefly comment what this does
 *		e) toArray()
 *		f) toArray(T[])
 *
 * 2) Answer the following questions:
 * 		Q2a) What does set(:int, :Element) return? What other obvious name 
				could have been used to describe it's function?
 *			
 *		Q2b) Suppose you have an ArrayList<String> with elements: 
 *				[ pear, apple, orange, kiwi].
 *				Suppose you then do a 'List l = subList(0,2);' operation. If you 
 *				then do an 'l.set(0,"kiwi");' operation, what does 'l' contain, 
 *				& what does the original ArrayList<String> contain?
 *				(Look-up the term "backed-list" w.r.t Java Collections and briefly explain it).
 *
 *		Q2d) How does Collections.sort() compare to Arrays.sort()?
 *			Resource: http://stackoverflow.com/questions/5208133/collections-vs-arrays-regarding-sort
 *
 */
import java.util.*;

public class Task_02{
    public static void main(String args[]){

		System.out.println("########################## 1 #############################");
		
			List<String> l1 = new ArrayList<String>(Arrays.asList("Cat in the wall, eh?! Okay, now you’re talking my language".split(" ")));
			System.out.println(l1);
			// A 
			System.out.println("Replaced '" + l1.set(l1.indexOf("talking"), "speaking") +"' with 'speaking'");
			System.out.println(l1);

			// B
			System.out.println(l1.subList(6,l1.size())); // indexes are inclusive and exclusive repectively [2]

			// C:
			// appends elements to the specified collection [1]
			Collections.addAll(l1, "WILD", "CARD");
			System.out.println(l1);
			//OR
			// append one collectin to another [1]
			List<String> more = new ArrayList<String>();
			more.addAll(Arrays.asList("Nightman", "Cometh"));
			l1.addAll(more);
			System.out.println(l1);

			// if the collection being appended to has changed 'true' is returned otherwise false [1]. 


			// D
			System.out.println("remove everything from "+l1+ " other than elements in "+more);
			System.out.println("ArrayList changed? " + l1.retainAll(more));
			System.out.println(l1);
			/*
			reduces array list to only what elements are common with another specified list and returns true or false
			based on whether or not the array list to be reduced has in fact changed [3]. 
			*/

			// E
			System.out.println(l1.toArray().getClass()); // ->  class [Ljava.lang.Object;
			/*
				returns a 'new' array of type object [4]
			*/
			for (Object item : l1.toArray()){
				System.out.print(item+" - ");
				System.out.println(item.getClass());
			}
			System.out.print("\n");

				// F
				System.out.println(l1.toArray(new String[2]).getClass()); // ->  class [Ljava.lang.String;
				/*
					returns a 'new' array of matching the array type and length given as an argument [5]
				*/
				for (String item : l1.toArray(new String[2])){

					System.out.print(item+" - ");
					System.out.println(item.getClass());
				}
				System.out.print("\n");
	


		
		



		

		System.out.println("########################## 2 #############################");
				// 2a
				/* 
					it returns the element that has been replaced as shown above.
					An alternative name for this method could be 'replace'
				*/
				
				// 2b
				/*
					Since .subList() only returns a view to the specified portion of the original array list,
					a change in either the original list or the view is seen from both instances [2].

					A backed list is one returned backed by the original array (no copy is made), methods like .toArray makes a copy, 
					so it returns and array not backed by the collection.
				*/
				List<String> l2 = new ArrayList<String>(Arrays.asList("Mantis Toboggan, MD".split(" ")));
				List l = l2.subList(0, 2);
				System.out.println("l2: "+l);// [Mantis, Toboggan,, MD]
				l.set(0,"Frank");
				System.out.println("l: "+l); // [Frank, Toboggan,, MD]
				System.out.println("l2: "+l2);// [Frank, Toboggan,, MD]

				// 2c 
				/*
					Collections.sort() is used for dealing with lists
					Arrays.sort() is used for dealing with arrays 
					Also Collections.sort() calls Arrays.sort() [7]
				*/

				


	}

}
/*
[1] - https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#addAll(java.util.Collection) 
[2] - https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#subList(int,%20int)
[3] - https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#retainAll(java.util.Collection)
[4] - https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#toArray()
[5] - https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html#toArray(T[])
[6] - https://stackoverflow.com/questions/10636528/what-is-backed-collection-in-java
[7] - https://stackoverflow.com/questions/5208133/collections-vs-arrays-regarding-sort
*/