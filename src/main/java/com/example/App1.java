package com.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class App1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhanu", "root", "root");

            String query = "insert into emp values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

          //  ResultSet rs = ps.executeQuery();

            // System.out.println("Names :-");
            // while(rs.next()) {
            //     System.out.println(rs.getString("emp_id"));
            //     System.out.println(rs.getString("name")); 
            //     System.out.println(rs.getString("branch"));
           // }
ps.setInt(1, 18);
ps.setString(2, "king kohli");
ps.setString(3, "cricketer");
ps.setString(4, "india");

           ps.execute();       


con.close();
        } catch(SQLException | ClassNotFoundException se) {
            System.out.println(se.getMessage());
        }
    }
}