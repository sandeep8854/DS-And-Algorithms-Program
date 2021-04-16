package sandeep.algoExpert.com;
import java.util.Scanner;
public class BinaryRecursive_2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Search Value?   ?");
		int search=sc.nextInt();
		int result=binaryRecursiveSearch(arr,search);
		if(result!=-1)
		{
			System.out.println("The Number is at index " + result);
		}else
		{
			System.out.println("Number Not Found . ");
		}	
	}
	private static int binaryRecursiveSearch(int[] arr, int search)
	{
		int lowerBound=0;
		int upperBound=arr.length-1;
		return binaryRecursiveSearch(arr,search,lowerBound,upperBound);	
	}
	private static int binaryRecursiveSearch(int[] arr, int search, int lowerBound, int upperBound) 
	{
		if(lowerBound>=upperBound)
		{
			if(arr[upperBound]==search)
			{
				return upperBound;
			}else
			{
				return -1;
			}
		}
		//comparisions
		int mid=(lowerBound+upperBound)/2;
		if(arr[mid]==search)
		{
			return mid;
		}else if(arr[mid]>search)
		{
			return binaryRecursiveSearch(arr,search,lowerBound,mid-1);
		}else
		{
			return binaryRecursiveSearch(arr,search,mid+1,upperBound);
		}
	}
}
/*
Enter Any Array Length ?  ? 
5
1
2
3
4
5
Enter Any Search Value?   ?
6
Number Not Found . 
 */
/*
Enter Any Array Length ?  ? 
5
10
20
30
40
50
Enter Any Search Value?   ?
50
The Number is at index 4
*/