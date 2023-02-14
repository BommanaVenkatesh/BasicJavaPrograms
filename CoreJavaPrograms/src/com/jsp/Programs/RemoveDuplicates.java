package com.jsp.Programs;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		 String s1=scn.next();
	      String s2="";
	      for(int i=0;i<s1.length();i++)
	      {
	    	  char c=s1.charAt(i);
	    	  if(s2.indexOf(c)==-1)
	    		  s2+=c;
	      }
	      System.out.println(s2);
	}

}
