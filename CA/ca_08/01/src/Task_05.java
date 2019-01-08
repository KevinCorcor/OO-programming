/**
 *TASK:
 *	Create a test program to demo java.util.ArrayList to yourself. 
 * 		You need only use ArrayList<String>.
 *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 *				https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
 *				http://beginnersbook.com/2014/06/difference-between-iterator-and-listiterator-in-java/
 *	
 * 1) In the program - demonstrate how to use an ListIterator over the list:
 *		a) previous()	
 *		b) nextIndex()		
 *		c) previousIndex()
 *		d) set()	
 *		e) add() 
 *	
 *		Q1 Suppose you have an ArrayList<String> with the elements:
 *				[pear, apple, orange]
 *			Briefly explain what you could do with a ListIterator, that you 
 * 			could NOT do with an Iterator over that ArrayList<String> 
 */

import java.util.*;

public class Task_05{
    public static void main(String args[]){
       
        List<String> l1 = new ArrayList<String>(Arrays.asList("Mantis Toboggan, MD".split(" ")));
        l1.set(0,"Frank");
        l1.add("Philly");
        ListIterator<String> i = l1.listIterator();
		while (i.hasNext()) {
			System.out.println(i.next() + " " + i.nextIndex());
        }
        while (i.hasPrevious()) {
			System.out.println(i.previous() + " " + i.previousIndex());
        }
        /*as seen in te above code i can use a method .previous to go back to the beginning*/
 

        
    }
}