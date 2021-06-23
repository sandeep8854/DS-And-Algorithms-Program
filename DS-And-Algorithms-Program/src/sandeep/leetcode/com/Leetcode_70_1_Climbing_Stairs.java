package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_70_1_Climbing_Stairs
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any NUmber ?  ?  ");
		int num=sc.nextInt();
		int res=climb(num);
		System.out.println(res);
	}

	private static int climb(int num)
	{
		if(num==0||num==1)
			return 1;
		int ways[]=new int[num+1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=num;i++)
		{
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[num];
	}

}
