package sandeep.algoExpert.com;
import java.util.Scanner;
public class Fibonacci_Search
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
		System.out.println("Enter Search Value  ?   ? ");
		int target=sc.nextInt();
		int result=fibonacciSeries(arr,target);
		if(result==-1)
			System.out.println("Element Not Found  .. ");
		else
			System.out.println("Element Found At index " +result);
	}
	private static int fibonacciSeries(int[] arr,int target)
	{
		int n=arr.length;
		int fibZero=0;
		int fibOne=1;
		int fibTotal=fibZero+fibOne;
		
		int offSet=-1;   //eliminated Range
	    while(fibTotal < n)
	    {
	    	fibZero=fibOne;
	    	fibOne=fibTotal;
	    	fibTotal=fibZero+fibOne;
	    }
	    while(fibTotal>1)
	    {
	    	int i=Math.min(offSet+fibZero, n-1);
	    	if(arr[i]<target)
	    	{
	    		fibTotal=fibOne;
	    		fibOne=fibZero;
	    		fibZero=fibTotal-fibOne;
	    		offSet=i;
	    	}
	    	else if(arr[i]>target)
	    	{
	    		fibTotal=fibZero;
	    		fibOne=fibOne-fibZero;
	    		fibZero=fibTotal-fibOne;
	    	}
	    	else
	    		return i;	
	    }
	    
	    if(fibOne ==target && arr[offSet+1]==target)
	    {
	    	return offSet+1;
	    }
		return -1;
	}
}

/*
Enter Any Array Length ?   ?  
5
10
20
30
40
50
Enter Search Value  ?   ? 
60
Element Not Found  .. 
Enter Any Array Length ?   ?  
7
1
2
3
4
5
6
7
Enter Search Value  ?   ? 
6
Element Found At index 5

It similar to binary search ,its also based on divide and conquer strategy AND ASLO NEEDS THE ARRAY TO BE SORTED
Time complexity both algorithm is logarithmic
its called Fibonacci series becasue it utilize the fibonacci series (Current number is the sum )
of two predessor F[i]=F[i-1]+F[i-2];
and F[0]=0, and F[1]=1;
Use only addition and subtruction operations compare to division and multiplication and bits shift required by binary search; 
Time Complexity:=
--------------------------
Best Cases -  = o(n)
Average Cases-= o(logn)
Worst Cases-  = o(logn)
---------------------------------
Space Complexity;=
O(1)
-----------------------------------
*/
