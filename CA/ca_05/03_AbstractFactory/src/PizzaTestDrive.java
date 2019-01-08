public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
		PizzaIngredientFactory chIngredientFactory = new ChicagoPizzaIngredientFactory();
 
		Pizza pizza;
		
		pizza = new CheesePizza( nyIngredientFactory );
		System.out.println("new CheesePizza( nyIngredientFactory) : " + pizza + "\n");
 
		pizza = new CheesePizza( chIngredientFactory );
		System.out.println("new CheesePizza( nyIngredientFactory) : " + pizza + "\n");
	}
}
