class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    // create 3 dogs
    Dog dog1 = new Dog("Husky", 5, "Clifford");
    Dog dog2 = new Dog("Pitbull", 3, "Bob");
    Dog dog3 = new DOg("Pug", 8, "Alice");
    Dog dog4 = new Dog("Chihuahua" 7, "Kim");
    Dog dog5 = new Dog("Poodle", 2, "Nancy");
    
    // display object property values
    print(dog3.age);
    
    // invoke object behaviors(functions)
    dog2.bark();
    
  }

  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }

}