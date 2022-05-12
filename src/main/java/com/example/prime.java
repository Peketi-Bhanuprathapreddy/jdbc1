package com.example;
import java.util.*;
public class prime {
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        int i=0;
         int num=0;
         String primenumbers="";
         System.out.println("enter the value of num");
         int n=sc.nextInt();
         sc.close();
         for(i=1;i<=n;i++)
         {
          int count=0;
          for(num=i;num>=1;num--)  {
              if(i%num==0)
              {
                  count=count+1;
              }
              
          } 
          if(count==2)
          {
              primenumbers=primenumbers+i+" ";
          }
         }System.out.println("num 1to 50 is:-");
         System.out.println(primenumbers);

    }
    
}
