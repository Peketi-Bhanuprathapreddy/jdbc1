package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class deletequery {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhanu", "root", "root");
    
            String query = " delete from emp where Emp_ID=1";
            PreparedStatement ps = con.prepareStatement(query);
 ps.execute();
 con.close();
        }catch(Exception e)   
        {
            System.out.println(e.getMessage());
        }           
            
    
}}
