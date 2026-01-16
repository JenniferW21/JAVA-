class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
    //Car(String brand, String model, String color, int year, double value)
    Car car1 = new Car("Toyota", "Camry", "Black", 2016, 27200.98);
    Car car2 = new Car("Honda", "Civic", "White", 2009, 45090.02);
    Car car3 = new Car("Ford", "Mustang", "White", 2020, 29574.45);
    Car car4 = new Car("BMW", "1 Series", "White", 2004, 10078.62);


    // display brand, model and value of each car
    print("Brand:" + car1.brand +"\n" + "Model:" + car1.model +"\n"+ "Value:" + car1.value);
    print("Brand:" + car2.brand +"\n" + "Model:" + car2.model +"\n"+ "Value:" + car2.value);
    print("Brand:" + car3.brand +"\n" + "Model:" + car3.model +"\n"+ "Value:" + car3.value);
    print("Brand:" + car4.brand +"\n" + "Model:" + car4.model +"\n"+ "Value:" + car4.value);

    // Display brand and model of any car with value over 30,000
    print("\nCars with value exceeding $30,000:");
    if(car1.value>30000){
      print("Car 2: " + car1.value);
    }else if(car2.value>30000){
      print("Car 2: " + car2.value);
    }


	  // Make BMW honk
	  print("\nUsing car functions(behavior):");	
    car1.honk();
    
  }

}