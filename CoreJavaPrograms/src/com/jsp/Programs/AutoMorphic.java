package com.jsp.Programs;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
       if( auto(n))
    	   System.out.println(n+" is auto");
       else
    	   System.out.println(n+" is not a auto");
	}
	static boolean auto(int n)
	{
		int s=n*n;
		while(n>0)
		{
			if(n%10!=s%10) return false;
			n/=10;
			s/=10;
		}
		return true;
	}

	}


