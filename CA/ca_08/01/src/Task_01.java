/**
 *TASK:
 *	Create a test program to demo java.util.ArrayList to yourself. 
 * 		You need only use ArrayList<String>.
 *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 *	
 * 1) In the program - demonstrate the following:
 *		a) add()
 *		b) remove()
 *		c) get()
 *		d) indexOf()
 *		e) contains()
 *
 * 2) Answer the following questions:
 * 		Q2a) If you have a list with size() = 3 (i.e. indices [0][1][2] ), 
 *				What happens if you pass the get(:int) method a value
 *					* >2, 
 *					* <0?
 *		Q2b) Suppose you have an ArrayList<String> with 
 *				elements: [ pear, apple, orange].
 *				Suppose you then do a 'remove("pear");' operation. What happens if you 
 *				then do a indexOf("pear") operation?
 *
 *		Q2c) Suppose you have an ArrayList<String> with elements:
 *				[apple, pear, apple, orange, apple]
 *				i)   Suppose you do an 'indexOf("apple")' operation - what do you get?
 *				ii)  How do you get the second "apple" instance?)
 *				iii) How do you get the last "apple" instance?)
 */

import java.util.*;

public class Task_01{
    public static void main(String args[]){

        System.out.println("########################## 1 #############################");
            List<String> l1 = new ArrayList<String>(Arrays.asList("Then, I’ll just regress, because I feel I made myself perfectly redundant".split(" ")));
            
            // A - ADD
            System.out.println(l1);
            for (String word : "Bird Law is not governed by reason".split(" ")){
                System.out.println("Adding '"+word +"': "+l1.add(word));
            }
            System.out.println(l1);

            // B - REMOVE
            System.out.println("removed 'Then,': " + l1.remove("Then,"));
            System.out.println("removed 'because,': " + l1.remove("because"));
            System.out.println(l1);

            // C - GET
            System.out.print(l1.get(10)+" "+l1.get(11));

            // D - INDEXOF
            System.out.println("The index of 'redundant' is: " + l1.indexOf("redundant"));

            // E - CONTAINS
            System.out.println("Contains 'Law'? \n Ans: " + l1.contains("redundant"));
        System.out.println("########################## 2 #############################");
            // 2A
            List<String> l2 = new ArrayList<String>(Arrays.asList("i'm sorry rumham".split(" ")));
            System.out.println(l2.size());
        
            try{
                l2.get(3);
            }catch(IndexOutOfBoundsException e){
                System.out.println("The following Exception ocurred upon execution of 'l2.get(3);'");
                System.out.println(e);
            }
            try{
                l2.get(-1);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("The following Exception ocurred upon execution of 'l2.get(-1);'");
                System.out.println(e);
            }
            /*
            IndexOutOfBoundsException is thrown when the index is out of range for the given array whereas,
            ArrayIndexOutOfBoundsException implements IndexOutOfBoundsException and is thrown when the array is trying to access an illegal index.
            ArrayIndexOutOfBoundsException is thrown in the later example since it is the subclass.
            */

            // 2B
            System.out.println("removed 'sorry,': " + l2.remove("sorry"));
            System.out.println("The index of 'sorry' is: " + l1.indexOf("sorry"));
            /* 
            -1 ia returned since 'sorry' is nolonger contained in the arraylist [2].
            */ 
           
            // 2C
            List<String> l3 = new ArrayList<String>(Arrays.asList("Rum Ham Rum Ham Rum Ham".split(" ")));
            // i
            System.out.println("The index of 'Ham' is: " + l3.indexOf("Ham"));
            // ii 
            int index = 0;
            for (String item : l3) {
                if(index !=l3.indexOf("Ham") && item.equals("Ham") ){
                    System.out.println("The second index of 'Ham' is: " + index);
                    break;
                }
                index++;

            }
            // iii
            System.out.println("The last index of 'Ham' is: " + l3.lastIndexOf("Ham"));





    }
}

/*
[1] - https://stackoverflow.com/questions/34266174/difference-between-arrayindexoutofboundsexception-and-indexoutofboundsexception
[2] - https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
*/