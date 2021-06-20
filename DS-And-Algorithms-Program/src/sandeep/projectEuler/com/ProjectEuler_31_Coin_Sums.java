package sandeep.projectEuler.com;

import java.util.Scanner;

public class ProjectEuler_31_Coin_Sums 
{
	public static void main(String[] args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any length ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		coinSum(arr);	
	}
	private static void coinSum(int[] arr)
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				count++;
			}
		}
		System.out.println(count);
		*/
		int target=200;
		int waysCount=0;
		for(int a=target;a>=0;a-=200)
		{
			for(int b=a;b>=0;b-=100)
			{
				for(int c=b;c>=0;c-=50)
				{
					for(int d=c;d>=0;d-=20)
					{
						for(int e=d;e>=0;e-=10)
						{
							for(int f=e;f>=0;f-=5)
							{
								for(int g=f;g>=0;g-=2)
								{
									waysCount++;
								}
								
							}
						}
					}
				}
			}
		}
		System.out.println("Toatl Number of Ways:= " +waysCount);	
	}
}

/*
Toatl Number of Ways:= 73682
*/