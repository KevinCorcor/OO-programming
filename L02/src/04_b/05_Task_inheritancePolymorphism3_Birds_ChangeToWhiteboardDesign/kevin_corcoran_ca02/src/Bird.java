abstract class Bird
{
	// assuming we still wantthe attribute you supplied
	String name;
	String type;
	boolean canFly;
	boolean sings; //assuming all birds sing we do not need a setter for his attribute

	Bird(){
		setName("unknown");
		sings = true;
	}

	abstract void sing();

	void setName(String name) {
		this.name = name;
	}
	void setType(String type) {
		this.type = type;
	}
	boolean canFly(){
		return canFly;
	}
	boolean canSing(){
		return sings;
	}
}
