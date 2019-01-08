class RubberDuck extends Duck {

	RubberDuck(){
		quackBehavior = new Squeak();
		flyBehavior   = new FlyDisabled();
	}

	void display() {
		System.out.println("RubberDuck floats on the water");
	}

}
