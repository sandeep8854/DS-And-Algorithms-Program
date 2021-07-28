package sandeep.algoExpert.com;
import java.util.Scanner;
public class Interpolation_Search
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
		int result=interpolationSearch(arr,target);
		if(result==-1)
			System.out.println("Element Not Found .");
		else
			System.out.println("Element Found at index " +result);
	}
	private static int interpolationSearch(int[] arr, int target)
	{
		int n=arr.length;
		int low=0;
		int high=n-1;
		int mid;
		while((arr[high]!=arr[low]) && (target>=arr[low]) && (target<=arr[high]))
		{
			mid=low+((target-arr[low])*(high-low)/(arr[high]-arr[low]));
			
			if(arr[mid]<target)
				low=mid+1;
			else if(target<arr[mid])
				high=mid-1;
			else
				return mid;
		}
		
		if(target==arr[low])
			return low;
		else
			return -1;
	}
}
/*
Enter Any Array Length ?   ?  
3
1
2
3
Enter Search Value  ?   ? 
4
Element Not Found .

Enter Any Array Length ?   ?  
8
1
2
3
4
5
6
7
8
Enter Search Value  ?   ? 
5
Element Found at index 4

*/