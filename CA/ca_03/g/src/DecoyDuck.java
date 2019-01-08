class DecoyDuck extends Duck {

	DecoyDuck(){
		quackBehavior = new MuteQuack();			//Add types here
		flyBehavior   = new FlyNoWay();
	}

	void display() {
		System.out.println("DecoyDuck.display()");
	}

}
