import java.util.*;		

  
public class Q02iii{
    
    public static void main(String[] args)  
    { 
        List<Integer> al = new ArrayList<Integer>(Arrays.asList(10,2,6,5,3,4,5,3,5,7,6,7,8,90,6,5,4,3));
        
        LinkedList<Integer> ll= new LinkedList<Integer>(al);
   
        System.out.println(ll);
        
        ll.add(1996); 
        ll.add(2014); 
        System.out.println(ll); 
        /*the method calls above append the give values to the linkedlist returns treu if successful*/
        
        ll.addLast(987); 
        ll.addFirst(132); 
        System.out.println(ll); 
        /*the method calls above append the give values to the end and beginnning of the linkedlist respectively*/
        
        ll.remove("B"); 
        System.out.println(ll); 
        /*removes the first occurrence of the given object or value and returns a boolean*/ 
        System.out.println("removed: "+ll.remove(3));
        System.out.println(ll);  
        /*removes the element at the specified postion and returns it*/ 
        

        ll.removeFirst(); 
        ll.removeLast(); 
        System.out.println(ll); 

    
    } 
      
    
}