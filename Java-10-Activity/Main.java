class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
   // Invoke functions with appropriate arguments
   System.out.println("Weighted GPA is " + gpa(98));
   System.out.println("GPA is " + gpa(85));
   System.out.println(isGraduating(12,45));
   System.out.println(isGraduating(11,45));
   System.out.println(BMI(100,60));
   System.out.println(BMI(260,50));
   System.out.println(blueOrViolet(700));
   System.out.println(blueOrViolet(590));

  }

/* Challenge 1:
  Write a function "gpa" that takes in the GPA value and returns the following: 
  if GPA is over 90, return GPA weighted by an extra 10%;
  otherwise return the raw GPA.
*/
double gpa(double GPA){
  if(GPA>90)
    return GPA * 1.10;
  else 
    return GPA;
}


  
/* Challenge 2:
    Write a function "isGraduating" that accepts a grade level and number of credits earned. It returns the boolean value TRUE if a student is a Senior and has 44 or more credits; otherwise it returns FALSE. 
  
  In the init() function:
  Display to console "Student Graduating" or "Student NOT Graduating" depending on the value returned by the function.
*/
  String isGraduating(int gradeLvL, int credits){
    if(gradeLvL == 12 && credits >= 44)
      return "Student Graduating";
    else
      return "Student NOT Graduating";
  }

  //   boolean isGraduating(int gradeLvL, int credits){
  //   if(gradeLvL == 12 && credits >= 44)
  //     return true;
  //   else
  //     return false;
  // }

/* Challenge 3:  BMI
  Write a function "BMI" that accepts a weight in pounds and a height in inches. 
  Calculate the BMI (search up the formula) and return the following:
    BMI 18.4 or less:  return Underweight
    BMI over 18.4 to under 25.0:  return Normal
    BMI of 25.0 or more to under 40.0:  return Overweight
    BMI of 40.0 or more:  return  Obese 
*/
  String BMI(double weight, double height){
    double bmi = 703 * weight/Math.pow(height,2);
      if(bmi<=18.4)
        return "Underweight";
      else if(bmi>=18.4 && bmi<25.0)
        return "Normal";
      else if(bmi>=25.0 && bmi<40.0)
        return "Overweight";
      else if(bmi>=40)
        return "Obese";
      else
        return "Error";
      
  }

/* Challenge 4:
  Write a function "shippingCost" that accepts a weight in pounds and returns:
       0.00, if 10 pounds or less,
       5.00, if more than 10 pounds but 15 pounds or less,
       10.00, if more than 15 pounds but 25 pounds or less,
       10.00 plus 2 cents per pound over 25 pounds, if over 25 pounds.
*/
    double shippingCost(double pounds){
      if(pounds <= 10)
        return 0.00;
      else if(pounds>10 && pounds<=15)
        return 5.00;
      else if(pounds>15 && pounds<=25)
        return 10.00;
      else
        return 10+(pounds-25)*0.02;
    }

/* Challenge 5:
  Write a function "blueOrViolet" that accepts a light frequency in THz and returns true for either blue frequencies (600-670 THz inclusive) or violet frequencies (700-750 THz inclusive), otherwise return false.
*/
//**&& has precedence over ||**
  boolean blueOrViolet(int freq){
    if(freq>=600 && freq<=670 || freq>=700 && freq<=750)
      return true;
    else
      return false;
  
  }

  
} 