package sandeep.algoHack.com;

import java.util.Scanner;

public class Hack_14_Between_Two_Set 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n for first array ?  ? ");
		int n=sc.nextInt();
		System.out.println("Enter m for second array ?  ? ");
		int m=sc.nextInt();
		System.out.println("Enter First Array ? ");
		int arr1[]=new int[100];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Second Array ?  ?");
		int arr2[]=new int[100];
		for(int i=0;i<m;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		betweentoset(n,m,arr1,arr2);	
	}
	private static void betweentoset(int n, int m, int[] arr1, int[] arr2) 
	{
		int count=0;
		for(int i=1;i<101;i++)
		{
			int k=0;
			for(int j=0;j<n;j++)
			{
				if(arr1[j]%i==0)
				{
					k++;
				}
			}
			for(int j=0;j<m;j++)
			{
				if(arr2[i]%i==0)
				{
					k++;
				}
			}
			if(k==m+n)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
