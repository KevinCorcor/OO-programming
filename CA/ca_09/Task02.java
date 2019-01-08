

public class Task02{
    public static void main(String args []){
        
        Box<Integer> b = new Box<Integer>();
        b.set(Integer.valueOf(1));
        b.boxTest( new SmallNum(10) ); // fine! is subclass
        //integerBox.boxTest( new OtherNum() );	// Try this: what happens?
            // This produces an incompatible bounds error 
    }
}
class Box<T> {
    
        private T b;          
    
        public void set(T b) {  
            this.b = b;  
        }
        public T get() { 
            return b;    
        }
    
        public <U extends Num> void boxTest(U u){					//**HERE the type-specification will allow
            System.out.println("T: field: " + b.getClass().getName());		// 		only arguments of type Num or subclasses
            System.out.println("U: param: " + u.getClass().getName());		// 		It is "bounded" to be only of these types
        }
    }
class OtherNum{}							//Not a subclass

class Num{								//Type Num
    int a;
    Num(int aVal){ 
        a = aVal; 
    }
    int value(){ 
        return a; 
    }			// ...has method 'value():int'
}

class SmallNum extends Num{				//Type SmallNum extends Num
    SmallNum(int aVal){
        super(aVal);
        this.a = (aVal < 100) ? aVal : 0;	//only allows values < 100
    }
}