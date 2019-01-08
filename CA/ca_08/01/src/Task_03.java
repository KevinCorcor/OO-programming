/**
 *TASK:
 *	Create a test program to demo java.util.ArrayList to yourself. 
 * 		You need only use ArrayList<String>.
 *	Resource:	https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 *	
 * 1) In the program - demonstrate the following:
 *		a) Assign an ArrayList<String> object to a  List<String> reference 
 *		b) Use Arrays.asList() in conjunction with "String Value".split(" ")
 *				to create an ArrayList<String> object that is assigned to a List<String>
 *				reference
 */

import java.util.*;

public class Task_03{
    public static void main(String args[]){
        // A        
        List<String> l1 = new ArrayList<String>();
        // B
        List<String> l2 = new ArrayList<String>(Arrays.asList("Mantis Toboggan, MD".split(" ")));


        
    }
}