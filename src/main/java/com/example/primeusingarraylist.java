package com.example;
import java.util.ArrayList;
public class primeusingarraylist {
    public static void main(String[]args){    
ArrayList<Integer> a=new ArrayList<>();
    for(int n=2022; n<=2052; n++)
{    
        if (( n%400 == 0)|| (( n%4 == 0 ) &&( n%100 != 0))) {
        a.add(n);
  
        }}
    System.out.println( "the leap years from 2022 to 2052 is:--"+a);
        
}
    }

