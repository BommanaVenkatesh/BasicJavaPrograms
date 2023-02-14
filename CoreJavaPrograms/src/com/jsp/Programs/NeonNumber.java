package com.jsp.Programs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		   System.out.println("Enter the number");
		   int n=scn.nextInt();
		       int temp=n*n;
		       int sum=0;
		       while(temp>0)
		       {
		    	   int res=temp%10;
		    	   sum+=res;
		    	   temp/=10;
		       }
		       if(sum==n)
		    	   System.out.println(n+" is a neon number");
		       else
		    	   System.out.println(n+" is not a neon number");
	}

}
