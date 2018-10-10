interface Flyable{
	void fly();		//public void fly();
}
class Duck implements Flyable{
	public void fly(){
		System.out.println("fly(): duck flying");
	}
	void quack(){
		System.out.println("quack(): duck quack-quack");
	}
}
class Airplane implements Flyable{
	public void fly(){
		System.out.println("fly(): airplane flying");	
	}
	void dropWheels(){
		System.out.println("dropWheels(): airplane drops it's wheels");
	}
}
class RunFlyable{
	public static void main(String[] args){
		Duck d = new Duck();
		Airplane a = new Airplane();
		doFly(d);
		doFly(a);
	}
	static void doFly(Flyable f){ //A polymorphic method
		f.fly();					//dynamic binding @ runtime
	}
}

