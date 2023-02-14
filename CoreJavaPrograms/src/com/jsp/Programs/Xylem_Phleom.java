package com.jsp.Programs;

import java.util.Scanner;

public class Xylem_Phleom {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int temp=n,mid=0,first=0,last=0;
        boolean flag=true;
        while(n>0)
        {
        	if(flag)
        	{
        		 last=n%10;
        		flag=false;
        	}
        	else if(n>9) mid+=n%10;
        	else first=n%10;
        	n/=10;
        }
        if((first+last)==mid)
        	System.out.println(temp+" is a Xylem");
        else
        	System.out.println(temp+" is a Phleom");
	}
}
