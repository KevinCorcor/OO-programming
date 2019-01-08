import java.util.*;		//Set, HashSet

public class Q02i{
    public static void main(String args[]){
        
        Integer arr[] = { 10,2,6,5,3,4,5,3,5,7,6,7,8,90,6,5,4,3}; 
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr)); 
  
        List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10,2,6,5,3,4,5,3,5,7,6,7,8,90,6,5,4,3));
        TreeSet<Integer> ts1 = new TreeSet<Integer>(l1); 
  
        System.out.println("TreeSet: "+ts1); 
        System.out.println("HashSet: "+set); 

        ts1.add(50);
        ts1.add(50);
        set.add(50);
        set.add(50);
        System.out.println("TreeSet: "+ts1); 
        System.out.println("HashSet: "+set);
        /* Both add if the element is not already present*/

        TreeSet<Integer> t= (TreeSet)ts1.clone();
        Set<Integer> s = (HashSet)set.clone();
        System.out.println("TreeSet clone: "+t); 
        System.out.println("HashSet clone: "+s);
        /*the results from above show that cloning a hashset does not presever the order of its elements whereas
        a a*/ 

        System.out.println("TreeSet contains 51: "+ts1.contains(51));
        System.out.println("TreeSet contains 50: "+ts1.contains(50));
        System.out.println("HashSet contains 62: "+set.contains(62));
        System.out.println("HashSet contains 2: "+set.contains(2));
        /* both return boolean values*/

        Iterator v = set.iterator(); 
        System.out.println("TreeSet values are: "); 
        while (v.hasNext()) { 
            System.out.print(v.next()+" "); 
        } 
        System.out.print("\n"); 

        Iterator u = ts1.iterator(); 
        System.out.println("HashSet values are: "); 
        while (u.hasNext()) { 
            System.out.print(u.next()+" "); 
        }
        System.out.print("\n"); 

        /* both the above methods return the values of the collections however,
            Hashset iterator return the elements in no particular order whereas 
            the TreeSet iterator returns them in ascending order
        */

        System.out.println("TreeSet: remove 90: "+ts1.remove(90));
        System.out.println("TreeSet: remove 90: "+ts1.remove(45));
        System.out.println("HashSet: remove 90: "+set.remove(90));
        System.out.println("HashSet: remove 90: "+set.remove(45));
        System.out.println("TreeSet: "+ts1); 
        System.out.println("HashSet: "+set);
        /*
            both methods remove the specied element should ti exist in the collection
        */

        System.out.println("TreeSet size: "+ts1.size());
        System.out.println("HashSet size: "+set.size());

        System.out.println("TreeSet is empty: "+ts1.isEmpty());
        System.out.println("HashSet is empty: "+set.isEmpty());

        ts1.clear();
        set.clear();
        System.out.println("TreeSet: "+ts1); 
        System.out.println("HashSet: "+set);

        System.out.println("TreeSet is empty: "+ts1.isEmpty());
        System.out.println("HashSet is empty: "+set.isEmpty());

      
    }
}