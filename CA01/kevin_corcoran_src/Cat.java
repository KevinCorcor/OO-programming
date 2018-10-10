class Cat extends Pet{
  Fish fish;

  Cat(String name, String gender){
    super(name, gender, "meow!");
    fish = new Fish();
  }

  public String toString(){
    return "Cat:{ \n\t name: " + name + ",\n\t gender: " + gender + ",\n \t sound: " + sound + ",\n \t Fish: " + fish + "\n}";
  }
}
