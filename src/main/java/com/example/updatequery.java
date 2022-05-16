package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;


 
public class updatequery {
     public static void main(String[] args) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhanu", "root", "root");

        String query = "update emp set address=? where branch=?";
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("enter the address: ");
        String address=br.readLine();
     //   System.out.println("enter the roll: ");
       // String Role=br.readLine();
        System.out.println("enter the branch: ");
        String Branch=br.readLine();
        PreparedStatement ps = con.prepareStatement(query);
        String query2 = "delete from emp where name = kohlihhh";
        
ps.setString(1, address);
ps.setString(2, Branch);
//ps.setString(3, Branch);


     
       ps.execute(query); 
       ps.execute(query2);
con.close();
    } catch(Exception se) {
        System.out.println(se.getMessage());
    }
}
}
    

