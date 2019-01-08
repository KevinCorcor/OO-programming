public class Task01{
    public static void main(String args []){
        
        
        // WITHOUT GENERICS

        //CASTING
        Box1 b1 = new Box1();
        b1.set("String test 1");
        String s1 = (String) b1.get();  // inmcompatible types error. b1.get returns an Object not a String, thus casting is required
        System.out.println("cast of b1 string: " + s1);

        // NOT TYPESAFE
        b1.set(5); // compiles and runs.
        //Thus b1 is not homogeneous 
          

        //WITH GENERICS
       
        
        Box2<String> b2 = new Box2<>();
        b2.set("String test 2");
        String s2 = b2.get();
        System.out.println("no need to cast b2 string: " + s2);

        //TYPESAFE
        //b2.set(5); won't compile since 5 is not a string.
        
    }
}
class Box1 {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }
}
class Box2<T> {
    private T object;

    public void set(T object) { this.object = object; }
    public T get() { return object; }
}