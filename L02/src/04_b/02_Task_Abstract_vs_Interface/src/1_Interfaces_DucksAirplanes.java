interface Flyable{	//Another interface describing something that can fly()
	void fly();		//public void fly();
}
class Duck implements Flyable{	//A Duck can fly
	public void fly(){
		System.out.println("fly(): duck flying");
	}
	void quack(){
		System.out.println("quack(): duck quack-quack");
	}
}
class Airplane implement Flyable{ //An Airplane can fly
	public void fly(){
		System.out.println("fly(): airplane flying");
		
	}
	void dropWheels(){
		System.out.println("dropWheels(): airplane drops it's wheels");
	}
}
class RunFlyable
{
	public static void main(String[] args){
		Flyable f;
		f = new Duck();
		f.fly();
		
		f = new Airplane();
		f.fly():
	}
}

