class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

 void init(){
// Define a variable for each situation in the challenges below. Assign a value to each variable.
// Display the value of each variable to the console.

/*  Challenge 1:    
    1) student's age 
    2) number of people that live with you
    3) number of items in a cart 
*/  
    int student_age = 17;
    System.out.println(student_age);
    System.out.println("Student's age is " + student_age);
    int family_mem = 5;
    System.out.println(family_mem + " people live with me");
    int cart_item = 10;
    System.out.println("There are " + cart_item + " items in the cart");


/*  Challenge 2:
    1) temperature 
    2) student's GPA
    3) growth rate of your investment
*/
    double temp = 75.77;
    System.out.println("The termperature is " + temp);
    double student_avg = 81.87;
    System.out.println("Student average is " + student_avg);
    double growth_rate = .13;
    System.out.println("Growth rate is " + growth_rate);

/*  Challenge 3:
    1) Student's last name 
    2) student's first initial
    3) description of an item 
*/
    String lastName = "Wang";
    System.out.println("Student's last name is " + lastName);
    char lastInit = 'W';
    System.out.println("Student's last name initial is " + lastInit);
    String descrip_item = "blue";
    System.out.println("Item description: " + descrip_item);

/*  Challenge 4:
    1) the status whether lights are on
    2) the status whether the game is over
    3) the status whether the battery is charging
*/
    boolean light_on = true;
    System.out.println("The light is on: " + light_on);
    boolean gameOver = true;
    System.out.println("The game is over: " + gameOver);
    boolean battery_charging = true;
    System.out.println("The battery is charging: " + battery_charging);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}
