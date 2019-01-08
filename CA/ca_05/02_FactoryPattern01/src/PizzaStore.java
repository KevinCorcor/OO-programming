public abstract class PizzaStore {

	/*
	 *Implemented method: refers to abstract method below
	 *	which will be defined by sub-classes
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);	//**HERE 'createPizza(...)' 
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	/*
	 *Abstract method: to be defined by sub-class
	 */
	abstract Pizza createPizza(String item);
}
