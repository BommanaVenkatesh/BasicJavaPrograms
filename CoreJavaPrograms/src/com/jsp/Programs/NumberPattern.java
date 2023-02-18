package com.jsp.Patterns;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter the number of rows");
         int n=scn.nextInt();
         int spaces=n/2,stars=1,num=1;
         for(int i=1;i<=n;i++)
         {
        	 for(int j=1;j<=spaces;j++)
        		 System.out.print("  ");
        	 for(int j=1;j<=stars;j++) {
        		 System.out.print(num+" ");
        		 if(j<=stars/2) num--;
        		 else num++;
        	 }
        	 num--;
        	 if(i<=n/2)
        	 {
        		 spaces--;
        		 stars+=2;
        		 num++;
        	 }
        	 else {
        		 spaces++;
        		 stars-=2;
        		 num--;
        	 }
        	 System.out.println();
         }
	}
}
