package com.jsp.Programs;

public class Least_HighestOccrChar {

	public static void main(String[] args) {
		String s1="i am a developerrrr";
		s1=s1.replace(" ","");
		int small=s1.length(),big=0;
		String sm="",bigg="";
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			int count=s1.length()-s2.length();
			if(small>count)
			{
				small=count;
				sm=c+"";
				
			}
			if(big<count)
			{
				big=count;
				bigg=c+"";
			}
			s1=s2;
		}
		System.out.println("Least Occurance = "+sm);
		System.out.println("Highest Occurance = "+bigg);
	}
}
