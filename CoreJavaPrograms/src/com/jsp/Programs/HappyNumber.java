package com.jsp.Programs;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scn.nextInt();
        int temp=n;
        do {
        	int sum=0;
        	while(n>0)
        	{
        		int rem=n%10;
        		sum+=(rem*rem);
        		n/=10;
        	}
        	n=sum;
        	
        }while(n>9);
        if(n==1)
        	System.out.println(temp+" is a Happy Number");
        else
        	System.out.println(temp+" is not a Happy Number");
	}

}
