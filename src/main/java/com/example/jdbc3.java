package com.example;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class jdbc3 {
   public static void main(String[] args) throws Exception { 
    Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhanu", "root", "root");

  //  String query = "insert into emp values(?,?,?,?)";
     
      Statement stmt = con.createStatement();
      String query =";
      
      System.out.println("Employee table created");
      String query1 = "aLTER TABLE emp ADD address CHAR(100) ";
     // String query2 = "ALTER TABLE employees DROP COLUMN last_name";
     stmt.execute(query);      
      stmt.execute(query1);
      con.close();
     // stmt.execute(query2);
      System.out.println("Address column added to the table & last_name column removed from the table");
      
      //String query3 = "drop table employees";
      //stmt.execute(query3);
     // System.out.println("Employees table removed");
   }	
}