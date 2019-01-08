package fruits.apples;			// a sub-package this time
import fruits.Fruit; 			// 04 import needed for inheritence

public class Apple extends Fruit{
	String type;

	public Apple(String aType){		 // 03: made public for call in Cider.java
		type = aType;
	}
	public void squeeze(){ 		// 05: needs to have equal or stronger access
		System.out.println("Apple.squeeze()");
		System.out.println(this.getClass().getName());
	}
}
