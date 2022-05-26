package com.example.practice;
import java.sql.*;
public class createdatabase{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Register the Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhanu", "root", "root");
    
            String query = " create database RGV3";
            PreparedStatement ps=con.prepareStatement(query);
           // String table=" create table  job(num int(25), labour varchar( 45), manager varchar(25),gender varchar(25))";
            ps.execute();
           // PreparedStatement ps1=con.prepareStatement(table);
            System.out.println("RGV2 EXECUTED SUCCESSFULLY");
//ps1.execute();
            con.close();

    
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
    }}