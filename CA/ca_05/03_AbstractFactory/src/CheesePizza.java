public class CheesePizza extends Pizza {
	 
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	void prepare() {
		System.out.println("Preparing " + name);
		dough	= ingredientFactory.createDough();
		sauce	= ingredientFactory.createSauce();
		cheese 	= ingredientFactory.createCheese();
	}
}
