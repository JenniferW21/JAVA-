
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/* For each of the challenges below:
    a) declare the variables, 
    b) ask the user for the variable values, 
    c) write the specified equation, and 
    d) display the equation value.
*/    
 
  // Challenge 1:  See file Actvy7_Eq1  (done for you)
      System.out.println("Enter the value for x ");
      double x =Input.readDouble();
      double y = Math.pow(x,7);
      System.out.println("Value of y is "+y);   
  
//    Challenge 2:  See file Actvy7_Eq2
      System.out.println("Enter the value for A");
      double C = 0;
      double A = Input.readDouble();
      System.out.println("Enter the value for B");
      double B = Input.readDouble();
      C = Math.sqrt(A + B);
      System.out.println("Value of C is "+C);   
//    Challenge 3:  See file Actvy7_Eq3
System.out.println("Enter the value for z");
      double q = 0;
      double z = Input.readDouble(); 
      q = Math.pow(z,3)+5;
      System.out.println("Value of q is "+q); 
//    Challenge 4:  See file Actvy7_Eq4
System.out.println("Enter the value for m");
    double k = 0;
    double m = Input.readDouble();
    System.out.println("Enter the value for n");
    double n = Input.readDouble();
    k = Math.pow(m,5)/Math.sqrt(n + 1);
    System.out.println("Value of k is "+k);

//    Challenge 5:  See file Actvy7_Eq5
System.out.println("Enter the value for t");
    double s = 0;
    double t = Input.readDouble();
    System.out.println("Enter the value for r");
    double r = Input.readDouble();
    s = Math.pow(t,5)*Math.pow(r+2,4);
    System.out.println("Value of s is "+s);
//    Challenge 6:  See file Actvy7_Eq6
      System.out.println("Enter the value for x2");
      double d = 0;
      double x2 = Input.readDouble();
      System.out.println("Enter the value for x1");
      double x1 = Input.readDouble();
      System.out.println("Enter the value for y2");
      double y2 = Input.readDouble();
      System.out.println("Enter the value for y1");
      double y1 = Input.readDouble();
      d = Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0));
      System.out.println("Distance is " + d);
//    Challenge 7:  See file Actvy7_Eq7    (HINT: What does the "plus minus: after "-b" mean?)
      double x3 = 0;
      double x4 = 0.0;
      System.out.println("Enter the value for a");
      double a = Input.readDouble();
      System.out.println("Enter the value for b");
      double b = Input.readDouble();
      System.out.println("Enter the value for c");
      double c = Input.readDouble();
      x3 = 0.0-b + Math.sqrt(Math.pow(b,2)-4.0 * a * c)/2.0*a;
      x4 = 0.0-b - Math.sqrt(Math.pow(b,2)-4.0 * a * c)/2.0*a;
      System.out.println("x3 is " + x3);
      System.out.println("x4 is " + x4);

    

    // **************************************************
    // ******** Don't write any code below here. ********
    // **************************************************
  }
}