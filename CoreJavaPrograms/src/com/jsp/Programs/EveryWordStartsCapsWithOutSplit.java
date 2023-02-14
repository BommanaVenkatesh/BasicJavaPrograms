package com.jsp.Programs;

public class EveryWordStartsCapsWithOutSplit {

	public static void main(String[] args) {
		 String s1="I am a java developer";
	      String s2=cap(s1);
	      System.out.println(s2);
	      
		}
		static String cap(String s)
		{
			 char[] a=s.toCharArray();
		      int len=s.length();
		      int i=0,j=0;
		      while(j<len)
		      {
		    	  while(j<len && a[j]!=' ') j++;
		    	  int k=j-1;
		    	  while(k>i) {
		    		  k--;
		    	  }
		    	  if(a[k]>=97 && a[k]<=129) a[k]=(char)(a[k]-32);
		    	  
		    	  j++;
		    	  i=j;
		      }
		      return new String(a);
		}
	}


