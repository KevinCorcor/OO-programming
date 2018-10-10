class Person{
  String name;
  Pet pet;

 public Person(String name){
    this.name = name;
 }
 public Person(String name, Pet pet){
    this.name = name;
    setPet(pet);
  }

  void setPet(Pet pet){
    this.pet = pet;
  }
  public String toString(){
    return "Person:{\n name: " + name + ",\n Pet:{\n \t" + pet + "}}";
  }
}
