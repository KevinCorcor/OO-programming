/**
 *TASK:
 *	Create a test program to demo java.util.ArrayList to yourself. 
 * 		You need only use ArrayList<String>.
 *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 *				https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
 *	
 * 1) In the program - demonstrate how to use an Iterator over the list:
 *		a) hasNext()	//brief explain in comments
 *		b) next()		//brief explain in comments
 *		c) remove		//brief explain in comments
 *	
 *		Q1 Suppose you have an ArrayList<String> with the elements:
 *				[pear, apple, orange]
 *			and you have an iterator 'i' on the list...
 *			a) Can you do a 'next()' operation without doing a 'hasNext()' before?
 *				(Briefly outline the danger in doing this?)
 *			b) Suppose you have done a 'next()' but you want to start again, 
 *				 what are your options? 
 *			c) Suppose you have a new iterator on the List above and you call next(), 
 *					and then call remove(): what get's removed pear or apple?
 *					(How does remove() work?)
 *			d) If you do a 'remove()' on a new Iterator without doing a 
 *				next() before-hand - what happens?
 */

import java.util.*;

public class Task_04{
    public static void main(String args[]){
		System.out.println("########################## 1 #############################");
                       
        List<String> l1 = new ArrayList<String>(Arrays.asList("Mantis Toboggan, MD".split(" ")));
        
        Iterator<String> i = l1.iterator();
        // A 
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        /* There is nothing stoping us from going out of bounds*/
        
        //B
        /*
        create a new iterator
        list iterator I believe has a .previous() [1]

        */
        //C
        Iterator<String> j = l1.iterator();
        j.next();
        j.remove();
        Iterator<String> k = l1.iterator();
        while (k.hasNext()) {
			System.out.println(k.next());
        }
        /*
        as sen above teh first element of the list is removed

        The remove() method removes an element from the underlying collection (the last element returned by the iterator) and can only be called 
        once per call to next(). 
        */

        //d
        Iterator<String> m = l1.iterator();
        //m.remove();
        /*
        m.remove() throws the following exception:
            Exception in thread "main" java.lang.IllegalStateException
            at java.util.ArrayList$Itr.remove(Unknown Source)
            at Task_04.main(Task_04.java:65)
        */
    }
}
/*
[1] - https://stackoverflow.com/questions/13689288/java-reset-list-iterator-to-first-element-of-the-list
[2] - https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html#remove()
*/
