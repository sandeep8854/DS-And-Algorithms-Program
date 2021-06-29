package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_ProductMax
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lengtn  ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=productMax(arr);
		System.out.println(res);
	}

	private static int productMax(int[] arr)
	{
		int n=arr.length;
		if(n<2)
			return 1;
		int a=arr[0];
		int b=arr[1];
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]*arr[j]>a*b)
				{
					a=arr[i];
					b=arr[j];
				}
			}
		}
		return a*b;
	}
}


/*
Enter Any Array Lengtn  ?  ? 
5
5
6
2
4
7
42
*/