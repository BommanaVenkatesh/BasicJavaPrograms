package com.jsp.Programs;

public class Knowledge {

	public static void main(String[] args) {
	     String s1="Knowledge";
	       String s2="";
	       String s3="";
	       for(int i=4;i<s1.length();i++)
	       {
	    	   if(i==4)
	    		   s2+=(char)(s1.charAt(i)-32);
	    	   else
	    	   s2+=s1.charAt(i);
	       }
	       System.out.print(s2);
	       
	       for(int i=0;i<4;i++)
	       {
	    	   s3+=s1.charAt(i);
	       }
	       String s4=rev(s3);
	       System.out.println(s4);
		}
		public static String rev(String s)
		{
			char[] a=s.toCharArray();
			int i=0,j=a.length-1;
			while(i<j)
			{
				char temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			return new String(a);
	}

}
