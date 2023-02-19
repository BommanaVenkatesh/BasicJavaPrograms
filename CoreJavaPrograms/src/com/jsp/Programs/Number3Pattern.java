package com.jsp.Patterns;
import java.util.Scanner;
public class Number3Pattern {
	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter the number of rows");
         int n=scn.nextInt();
         int n1=n;
         for(int i=1;i<=n;i++)
         {
        	 int num=1;
        	 for(int j=1;j<=n1;j++)
        	 {
        		 System.out.print(num+"\t");
        		 if(i>1) num+=i-1;
        	 }
        	 n1--;
        	 System.out.println();
         }
	}
}
