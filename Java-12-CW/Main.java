class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
  }
/*
Problem 1:
Write a function collegeCredit() that accepts a course code and if a course gets college credit return true otherwise return false. If the 6th letter of the course code is "E" or "M" then it is a college credit course.
*/
  boolean collegeCredit(String course){
    if(course.substring(5,6).equals("M")||course.substring(5,6).equals("E"))
      return true;
    else
      return false;
  }


/*
Problem 2:
Write a function getCounselor() that accepts a student's official class code and returns their guidance counselor based on the either the first or the middle character of the official class code being:
B-Berrouet
C-Chu !
D-Dinn !
E-Eyzengart
F-Flores !
G-Gibson !
*/
  String getCounselor(Strinh ofcl){
    if(ofcl.substring(0,1).equals("D")|| ofcl.substring(1,2).equals("D")){
      return "Dinn";
    }
    else if(ofcl.substring(0,1).equals("F")|| ofcl.substring(1,2).equals("F")){
      return "Flores";
    }
    else if(ofcl.substring(0,1).equals("C")|| ofcl.substring(1,2).equals("C")){
      return "Chu";
    }
    else if(ofcl.substring(0,1).equals("G")|| ofcl.substring(1,2).equals("G")){
      return "Gibson";
    }
    else if(ofcl.substring(0,1).equals("B")|| ofcl.substring(1,2).equals("B")){
      return "Berrouet";
    }
    else if(ofcl.substring(0,1).equals("E")|| ofcl.substring(1,2).equals("E")){
      return "Eyzengart";
    }
    else 
      return "Unknown";
  }

/*  
Problem 3:
Write a function imageType() that accepts an image filename and returns the image type based on the file extension.

JPEG or JPG - Joint Photographic Experts Group
PNG - Portable Network Graphics
GIF - Graphics Interchange Format
PDF - Portable Document Format(not an image type)
*/ 
  String imageType(String fileName){
    int pos = fileName.indexOf(".");

    if(fileNAme.substring(pos+1).equalsIgnoreCase("JPEG")||fileName.substrings(pos+1).equalsIgnoreCase("JPG")){
      return "Joint Photographic Experts Group";
    }
    else if(fileNAme.substring(pos+1).equalsIgnoreCase("PNG")){
      return "Portable Network Graphics";
    }
    else if(fileNAme.substring(pos+1).equalsIgnoreCase("GIF")){
      return "Graphics Interchange Format";
    }
    else if(fileNAme.substring(pos+1).equalsIgnoreCase("PDF")){
      return "Portable Document Format(not an image type)";
    }
    else 
      return "Unknown data file";
  }
 
  
}