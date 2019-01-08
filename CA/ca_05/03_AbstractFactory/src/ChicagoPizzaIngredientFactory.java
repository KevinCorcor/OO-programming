class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory 
{
	public Dough createDough() {
		return new ThickCrustDough(); //ThickCrust is Chicago Style
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce(); //Plum tomato is Chicago Style
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();//Mozzarella is Chicago Style
	}

}
