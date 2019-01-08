import java.util.*;		

  
public class Q02ii{
    
    public static void main(String[] args)  
    { 
      
        HashMap<String, Integer> hmap = new HashMap<>(); 
        hmap.put("Kevin", 3); 
        hmap.put("Dee", 5); 
        hmap.put("Sean1", 7); 
        hmap.put("Sean2", 11);

        TreeMap<String, Integer> tmap = new TreeMap<>();
        tmap.put("Kevin", 3);
        tmap.put("Dee", 5);
        tmap.put("Sean1", 7);
        tmap.put("Sean2", 11);

        System.out.println("hmap: "+hmap);
        System.out.println("tmap: "+tmap);

        /*The above code shows that Tree Maps order according to ascending order whereas
        hash maps simple do not preserve or implement and ordering*/

        System.out.println("hmap remove kevin: "+hmap.remove("Kevin"));
        System.out.println("tmap remove kevin: "+tmap.remove("Kevin"));
        /*both remove the element correspnding to the given key and return true if successfull
        if no element exists return null*/ 
        
         
    } 
      
    
}