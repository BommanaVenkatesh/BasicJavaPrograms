package com.jsp.Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	       System.out.println("Enter the 1st number");
	       int n1=scn.nextInt();
	       System.out.println("Enter the 2nd number");
	       int n2=scn.nextInt();
	       int count=0,sum=0,big=0,small=n2,temp=0;
	       for(int i=n1;i<=n2;i++)
	       {
	    	   if(isPrime(i))
	    	   {
	    		   System.out.print(i+" ");
	    		   count++;
	    		   if(count==5)
	               temp=i;
	    		   if(count==5 || count==10) 
	    			   sum+=i;
	    		    big=i;
	    		   if(small>i) small=i;
	    	   }
	       }
	       System.out.println();
	       System.out.println("Number of primes between "+n1+" and "+n2+" is "+ count);
	       System.out.println("5th prime number is "+temp);
	       System.out.println("Sum of 5th and 10th prime numbers is "+sum);
	       System.out.println(big+" is big prime ");
	       System.out.println(small+" is a small");
		}
	       public static boolean isPrime(int n)
	       {
	    	   int count=0;
	    	   for(int i=1;i<=n;i++)
	    	   {
	    		   if(n%i==0) count++;
	    	   }
	    	  return count==2;
	       }
	}


