package sandeep.leetcode.com;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_242_Valid_Anagram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String  ?   ?  ");
		String str1=sc.next();
		System.out.println("Enter Second String  ?   ? ");
		String str2=sc.next();
		boolean res=anagram(str1,str2);
		if(res==true)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram ");
	}

	private static boolean anagram(String str1, String str2) 
	{
		int n1=str1.length();
		int n2=str2.length();
		str1=str1.replace(" ", " ");
		str2=str2.replace(" ", " ");
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
			return true;
		else
			return false;
	}
}
/*
Enter First String  ?   ?  
anagram
Enter Second String  ?   ? 
nagaram
Anagram
*/
