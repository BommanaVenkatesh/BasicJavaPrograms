package com.jsp.Programs;

public class CountOfChars {

	public static void main(String[] args) {
	      String s1="RamAna@123";
	      int ca=0,sm=0,in=0;
	      for(int i=0;i<s1.length();i++)
	      {
	    	  char c=s1.charAt(i);
	    	  if(c>=65 && c<97)
	    	  {
	    		  ca++;
	    	  }
	    	  if(c>=97 && c<=129)
	    	  {
	    		  sm++;
	    	  }
	    	  if(c>=49 && c<=58)
	    	  {
	    		  in++;
	    	  }
	    	  
	      }
	      System.out.println("Capital letters="+ca);
	      System.out.println("Small letters="+sm);
	      System.out.println("Integers ="+in);

	}

}
