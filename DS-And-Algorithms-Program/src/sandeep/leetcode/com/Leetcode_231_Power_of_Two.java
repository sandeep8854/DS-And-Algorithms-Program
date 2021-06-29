package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_231_Power_of_Two
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ? ");
		int number=sc.nextInt();
		boolean res=powerTwo(number);
		System.out.println(res);
	}
	private static boolean powerTwo(int number)
	{
		if(number==0)
			return false;
		if(number==1)
			return true;
		if(number%2==1)
			return false;
		return powerTwo(number/2);
	}
}
/*
Enter Any Number ?  ? 
17
false
*/
/*
Enter Any Number ?  ? 
0
false
*/
/*
Enter Any Number ?  ? 
3
false
*/