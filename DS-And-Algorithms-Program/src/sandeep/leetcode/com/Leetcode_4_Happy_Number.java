package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_4_Happy_Number
{
	//////sum of square in individual digit called Happy number.
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ? ?");
		int number=sc.nextInt();
		boolean b1=happyNumber(number);
		if(b1==true)
			System.out.println("Happy Number..");
		else
			System.out.println("Not Happy Number..");			
	}
	private static  boolean happyNumber(int num)
	{
		while(num >9)
		{
			int sum=0;
			while(num!=0)
			{
				int reminder=num%10;
				sum=sum+reminder*reminder;
				num=num/10;
			}
			num=sum;
		}
		return num==1||num==7;	
		

	}

}
/*
Enter Any Number  ? ?
153
Not Happy Number..
*/
