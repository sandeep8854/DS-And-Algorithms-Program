package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_8_Min_Max_Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ? ? ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		min_maxSum(arr);
	}
	private static void min_maxSum(int[] arr)
	{
		int n=arr.length;
		int min=arr[0];
		int max=arr[0];
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(arr[i]< min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
		}
		System.out.print((sum-max) + " " + (sum-min));		
	}
}
/*
Enter Any Array Length ? ? ? 
5
1
3
5
7
9
16 24
*/