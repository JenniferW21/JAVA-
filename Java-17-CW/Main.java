class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){


    
  }

  // reverse function for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }

  /*
  Problem 1:
  Write a function swapCharacter() that accepts a string to modify, a string(one character) to find, and a string(one character) to replace. The function returns a string with the 'find' strings replaced by the 'replace' string.
  Example: swapCharacter("the seen","e","%")  ==> "th% s%%n"
  */
  String swapCharacter(String s, String find, String replace){
    String build="";
    for(int x=0;x<=s.length()-1;x++){
      if(s.substring(x,x+1).equals(find))
        build += replace;
      else
        build += s.subtring(x,x+1);

    }
    return build;
  }


  /*
  Problem 2:
  Write a function encryption2() that accepts a string and returns the string where the orginal string is split in half and each letter from each half is used to create a new string.
  Example:
  encryption2("abcdefgh") ==> "aebfcgdh"
    process:  "abcdefgh" -> "abcd" "efgh"  -> "aebfcgdh"

  encryption2("abcdefghi")==> "aebfcgdhi"
   process:  "abcdefghi" -> "abcd" "efghi"  -> "aebfcgdhi"
  */
  String encryption2(String s){
    String bld = "";
    String fHalf = s.substring(0,len/2.0);
    String sHalf = s.substring(len/2.0)
    for(int x=0; x<=fHalf.length()-1;x++){
      build += fHalf.substring(x,x+1) + sHalf.substring(x,x+1);

    if(len%2==1)
      build += sHalf.substring(sHalf.length()-1);

      return build;
    }
  }
  
  /*
  Problem 3:
  Write a function encryption3() that accepts a string and returns the string that rearranges the characters of the original string in the order: 1st,last,2nd,last-1,3rd,last-2,...   and so on.
  Example:
  encryption3("abcdef")==> "afbecd"
  encryption3("abcde")==> "aebdc"
  */
  

  
}