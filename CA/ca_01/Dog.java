class Dog extends Pet{
  Bone bone;

  Dog(String name, String gender){
    super(name, gender, "woof!");
    bone = new Bone();
  }

  public String toString(){
    return "Dog:{\n\t name: " + name + ",\n\t gender: " + gender + ",\n\t sound: " + sound + ",\n\t Bone: " + bone + "\n}";
  }
}
