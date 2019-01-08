//First (and only) Concrete Class on FlyingBird side
class BlackBird extends FlyingBird { // seemingly no need to inherit from FlyingBird since we can inherit from Bird and achieve the same effect

	BlackBird(){
		setType("Blackbird");
	}
	BlackBird(String name){
		setName(name);
		setType("Blackbird");
	}

	void sing() {
		System.out.println("ChirpChirp I'm a Blackbird");
	}
}
