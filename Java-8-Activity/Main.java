class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  //1: printing a string
  void print(String s){
    System.out.println(s);
  }

  //2: Fahrenheit to Celsius temperature conversion
  double ftoC(double f){
    double c =(f-32)*5.0/9.0;
    return c;    
  }

  //3: Sphere volume
  double sphere(double r){
     double s = 4.0/3.0 * Math.PI * Math.pow(r,3);
     return s;
  }
  
  //4: Cone volume
  double cone(double radius, double h){
    double v = Math.PI * Math.pow(radius,2)* h/3.0;
    return v;
  }

  //5: Distance between two coordinate points
  double distance(double x2, double x1, double y2, double y1){
    double d = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    return d;
  }


  
  void init(){
    //1
    System.out.println("Enter your name ");
    String name = Input.readString();
    print("Welcome "+name);

    //2
    System.out.println("Enter a temp in degree Fahrenheit");
    double f = Input.readDouble();
    System.out.println("Temp in degree Celsius is " + ftoC(f));
    //3
    System.out.println("Enter radius");
    double r = Input.readDouble();
    System.out.println("Sphere Volume: " + sphere(r));
    //4
    System.out.println("Enter a radius");
    double radius = Input.readDouble();
    System.out.println("Enter a height");
    double h = Input.readDouble();
    System.out.println("Sphere Cone: " + cone(r,h));
    //5
    System.out.println("Enter a x2");
    double x2 = Input.readDouble();
    System.out.println("Enter a x1");
    double x1 = Input.readDouble();
    System.out.println("Enter a y2");
    double y2 = Input.readDouble();
    System.out.println("Enter a y1");
    double y1 = Input.readDouble();
    System.out.println("Distance is " + distance(x2,x1,y2,y1));
    
  }
 
}