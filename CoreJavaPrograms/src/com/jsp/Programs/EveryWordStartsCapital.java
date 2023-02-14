package com.jsp.Programs;

public class EveryWordStartsCapital {

	public static void main(String[] args) {
		String s1="I am a java developer";
	       String[] s=s1.split(" ");
	       for(int i=0;i<s.length;i++)
	    	  System.out.println(cap(s[i]));
		}
	     public static String cap(String s)
	     {
	    	 char[] a=s.toCharArray();
	    	 if(a[0]>=97 && a[0]<=123)
	    		 a[0]=(char)(a[0]-32);
	    	 return new String(a);
	     }
	}


