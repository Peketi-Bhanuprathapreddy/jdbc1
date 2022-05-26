package main.java.com.example.practice;

import java.util.*;
class tofind_maximumtoys
{
 public static int toys(int cost[],int money)   
 {
     int add=0;
     int count=0;
     int max=0;
     for(int i=0;i<cost.length;i++)
     {
         sum=count=0;
         for( int j=1;j<cost.length;j++)
         {
             if((sum+cost[j])<=money)
             {
                 add=add+cost[j];
                 count=count+1;
                 max=Math.max(count,max);
             }  
             else{
                 count=0;
                 add=0;
                 break;
             }
         }
     }
     return max;
 }
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(system.in);
     int n=sc.nextInt();
     int cost[]=new int[n];
     for(int i=0;i<n;i++ )
     {
         cost[i]=sc.nextInt();
         int money=sc.nextInt();
         System.out.println(toys(cost,money));
     }
 }
}