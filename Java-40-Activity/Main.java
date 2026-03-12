import java.io.IOException;
import java.sql.*;
// To Compile on the Replit shell use: (same as for mac)
// javac -cp sqlite-jdbc-3.23.1.jar: Main.java

// To compile in Windows use:
// javac -cp sqlite-jdbc-3.23.1.jar

// To execute(run) use:
// java -cp sqlite-jdbc-3.23.1.jar: Main
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {   

    String sql = "";
    String queryResult="";

    // All challenges are based on the "cr101" table of the "students.db" database. Display all resulting tables to the console. NOTE: String values from DB are case sensitive.
    
    // Challenge 1:  Create the database object and connect to the "students" database.  
    Database db = new Database("jdbc:sqlite:students.db");

    // 160 Challenge 2:  Retrieve and display all student records for whom "BANU" is a teacher. (Hint: use teacher1 and teacher2 field names)
    sql = "SELECT * FROM cr101 WHERE teacher1='BANU' OR teacher2='BANU'";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);
    print("*************************");
    // 34 Challenge 3:  Retrieve and display all student records for whom "JOSEPH" is their period 2 teacher. (Hint: use teacher1 field name)
    sql = "SELECT * FROM cr101 WHERE teacher1='JOSPEH' AND period = 2";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);
    print("*************************");

    
    // 2789 Challenge 4:  Retrieve and display the ID for each student. How many students are there? (Hint: only unique values)
    sql = "SELECT DISTINCT StudentID FROM cr101";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);
    print("*************************");
    
    // 215 Challenge 5:  Retrieve and display the ID, grade, course, room and period for each student who is a junior and has a class in any of the following rooms: 106, 108, 322.
    sql = "SELECT DISTINCT StudentID,grade,course,room,period FROM cr101 WHERE grade = 11 AND Room IN(106,108,322)";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);
    print("*************************");
   

    // 107 Challenge 6:  Retrieve and display all records for all students taking an AP Math course. (HINT: Math courses start with an M and AP courses end with an X)
    sql = "SELECT * FROM cr101 WHERE course LIKE 'M%X'";
    queryResult = db.runSQL(sql,"table-auto");
    print(queryResult);
    print("*************************");  

     
  }    
}