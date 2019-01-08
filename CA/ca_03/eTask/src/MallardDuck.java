//WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class MallardDuck extends Duck implements Quackable, Flyable {

	void display() {
		System.out.println("MallardDuck shows its feathers");
	}
  public void quack(){
    System.out.println("quack");
  }
  public void fly(){
    System.out.println("flying");
    System.out.println("wheesh");
  }
}
