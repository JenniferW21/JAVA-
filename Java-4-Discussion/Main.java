class Main {
  
  public static void main(String[] args) {
    (new Main()).init();
  }

  // Init function runs when the program begins.  

  void init(){
    // Number of cars
       int numOfCars = 20;
       System.out.println(numOfCars);
    // Investment amount in currency
      double investmentAmount = 200.99;
      System.out.println(investmentAmount);
    // Person's first name
      String fName = "Mary";
      System.out.println(fName);
    // Is a game over?
      boolean isGameOver = false;
      System.out.println(isGameOver);
    // Store the first initial of a name
      char fInitial = 'N';
      System.out.println(fInitial);
    // Maximum number of customers in a theater (declare as a constant)
      final int MaxCust = 500;
      System.out.println(MaxCust);

  }

  
}