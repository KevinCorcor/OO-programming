package fruits;

public class Apple extends Fruit{ 		// 02: made public
	String type;

	public Apple(String aType){			// 03: made public
		type = aType;
		squeeze();
		System.out.println( this.getClass().getName() );
	}

}
