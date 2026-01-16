class Car{
    // class properties (variables)
    String brand;
    String model;
    String color;
    int year;
    double value;

    // add the constructor
    Car(String brand, String model, String color, int year, double value){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.value = value;
    }
    
    // class behaviors (functions) 
    void honk(){
        System.out.println("Honk");
    }
}