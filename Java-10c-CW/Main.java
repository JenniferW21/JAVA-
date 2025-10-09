class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
      System.out.println(groupSavings(15));
      System.out.println(groceryDiscount(150.4, 3));
        
  }

  /*
    Problem 1:      
    Write a function groupSavings() that takes the number of tickets you want 
    to purchase. Return the total cost by applying the following prices:
    1 to 8 tickets  : each ticket costs $11.00
    9 to 16 tickets : each ticket costs $10.50
    over 16 tickts  : each ticket costs $8.50
  */
    double groupSavings(int x){
      if(x>=1 && x<=8)
        return 11 * x;
      
      else if(x>= 9 && x<= 16)
        return 10.5 * x;
      
      else if(x>16)
        return x * 8.5;
      else
        return 0;
    }
  
  /*
    Problem 2:
    Write a function groceryDiscount() that takes the total amount spent at 
    a grocery store and the number of cans purchased. Based on the total amount 
    and the number of cans purchased, you get a savings on your total bill.
    
    Return the amount saved:
      Spend $100 to $200 and purchase at least 3 cans: $10 savings
      Spend over $200 and purchase more than 4 cans: $25 savings
      Otherwise: No discount.
    */
   double groceryDiscount(double money, int can){
    if(money>100 && money<200 && can==3)
      return money - 10;
    else if(money>200 && can>4)
      return money - 25;
    else
      return money - 0;
   }

}