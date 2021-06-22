package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_53_Maximum_Subarray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=maximumSum(arr);
		System.out.println(res);
	}

	private static int maximumSum(int[] arr)
	{
		int sum=arr[0];
		int maxSum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(sum+arr[i]>arr[i])
			{
				sum=sum+arr[i];
			}
			else
			{
				sum=arr[i];
			}
			maxSum=Math.max(sum, maxSum);
		}
		return maxSum;
	}

}

/*
Enter Any Array  ?  
9
-2
1
-3
4
-1
2
1
-5
4
6
*/