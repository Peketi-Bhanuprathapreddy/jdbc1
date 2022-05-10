package com.example;
import java.util.*;
public class bhanu{

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        String s=sc.nextLine();
        System.out.println(s);
        String ss[]=s.split("");
        int m=0;
        for(String mm:ss) 
        {
            int l=(int)mm.length();
            if(l>a&&l%2!=0)
            {
    System.out.println(mm);
    m=0;
    break;
           }
           else
            {
               m=1;
           }
        }
           if(m==1)
           {
               System.out.println("better luck next time");
           }
        }
}
