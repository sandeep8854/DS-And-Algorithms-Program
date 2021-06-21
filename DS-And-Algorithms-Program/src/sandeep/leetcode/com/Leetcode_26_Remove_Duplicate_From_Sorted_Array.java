package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_26_Remove_Duplicate_From_Sorted_Array 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	    int res=sorted(arr);
	    System.out.println(res);
	}

	private static int sorted(int[] arr)
	{
	/*	int n=arr.length;
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
				count++;
		}
		return count+1;*/
		
		int uniqueCount=0;
		int currentCount=1;
		int n=arr.length;
		
	    while(currentCount<n)
	    {
	        if(arr[currentCount]==arr[uniqueCount]) 
	        {
	            currentCount++;
	        } 
	        else
	        {
	            if(uniqueCount+1!=currentCount)
	            {
	                arr[uniqueCount+1]=arr[currentCount];
	            }
	            uniqueCount++;
	            currentCount++;
	        }
	    }
	    return uniqueCount+1;
	}
}
/*
Enter Any Array Length ?  ?  
3
1
1
2
2
*/
/*
Enter Any Array Length ?  ?  
10
0
0
1
1
1
2
2
3
3
4
5
*/
