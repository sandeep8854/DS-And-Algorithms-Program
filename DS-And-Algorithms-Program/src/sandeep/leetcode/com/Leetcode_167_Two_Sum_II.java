package sandeep.leetcode.com;

import java.util.Scanner;

public class Leetcode_167_Two_Sum_II
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?  ? ");
		int t=sc.nextInt();
		for(int iii=0;iii<t;iii++)
		{
		System.out.println("Enter Any Array Length  ?  ?");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any target Value ?  ? ");
		int target=sc.nextInt();
		int res[]=twoSumII(arr,target);
		for(int ii=0;ii<res.length;ii++)
		{
			System.out.println(res[ii] + " ");
		}
		}
	}
	private static int[] twoSumII(int[] arr, int target)
	{
		int startingPointer=0;
		int actualLength=arr.length-1;
		int result[]=new int[2];
		while(startingPointer<actualLength)
		{
			if((arr[startingPointer]+arr[actualLength])==target)
			{
				result[0]=startingPointer+1;
				result[1]=actualLength+1;
				break;
			}
			else if(arr[startingPointer]+arr[actualLength]>target)
			{
				actualLength--;
			}
			else
			{
				startingPointer++;
			}
		}
		return result;
	}
}

/*
Enter Any Test Cases  ?  ? 
3
Enter Any Array Length  ?  ?
4
2
7
11
15
Enter Any target Value ?  ? 
9
1 
2 
Enter Any Array Length  ?  ?
3
2
3
4
Enter Any target Value ?  ? 
6
1 
3 
Enter Any Array Length  ?  ?
2
-1
0
Enter Any target Value ?  ? 
-1
1 
2 
 */


//Return an Empty Array Using new int[0] in Java
//If the array has a length of zero, then it does
// not contain any element. To return an empty array 
// from a function, we can create
// a new array with a zero size. In the example 
 //below, we create a function returnEmptyArray() that returns an array of int