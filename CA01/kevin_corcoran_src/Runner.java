class Runner{

    public static void main(String args []){
      Cat cat = new Cat("Tiger","male");
      Dog dog = new Dog("Sam","male");
      Person p1 =  new Person("Andy",dog);
      Person p2 =  new Person("Amy");
      p2.setPet(cat);

      System.out.println(p1);
      System.out.println(p2);
    }
}
