package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_29_Search_Insert_Position
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Larget Value ?   ");
		int target=sc.nextInt();
		insertPosition(arr,target);
		//System.out.println(res);
	}
	private static void insertPosition(int[] arr, int target) 
	{
		int n=arr.length;
		int i;
		for( i=0;i<arr.length;)
		{
			
			if(arr[i]==target)
			{
				System.out.println(i);
			}
			else
			{
				i++;
			}
		}
		System.out.println("0");
		
	}
}

/*
 Enter Any Array Length  ?  ? 
4
2
4
5
6
Enter Any Larget Value ?   
7
0

 */



























