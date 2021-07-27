package sandeep.algoHack.com;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Hack_56_Sherlock_And_Array
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases ?  ?  ?   ?   ");
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		System.out.println("Enter Any Array Lenght  ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int ii=0;ii<arr.length;ii++)
		{
			arr[ii]=sc.nextInt();
		}
		sherlockArray(arr);	
		}
	}
	private static void sherlockArray(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int left_sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(left_sum==(sum-left_sum-arr[i]))
			{
				System.out.println("YES");
				break;
			}
			left_sum+=arr[i];
		}
		System.out.println("NO");
	}
}
