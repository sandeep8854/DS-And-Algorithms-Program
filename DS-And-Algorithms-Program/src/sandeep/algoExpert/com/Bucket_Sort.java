package sandeep.algoExpert.com;
import java.util.Scanner;
public class Bucket_Sort 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res[]=bucket_sort(arr);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
		
	}
	private static int[] bucket_sort(int[] arr)
	{
		int L=arr.length;
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
		}
		
		int bucket[]=new int[max+1];
		int sortedArray[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			bucket[arr[i]]++;
		}
		
		int temp=0;
		for(int i=0;i<bucket.length;i++)
		{
			for(int j=0;j<bucket[i];j++)
			{
				sortedArray[temp++]=i;
			}
		}
		return sortedArray;	
	}
}


/*
 Enter Any Array Length ?   ?  
6
78
14
25
01
12
56
1 12 14 25 56 78 
 */









