package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Scanner;
public class Hack_57_Find_The_Median
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
		int res=findTheMedian(arr);
		System.out.println(res);
	}
}
	private static int findTheMedian(int[] arr)
	{
		Arrays.sort(arr);
		int L=arr.length;
		int midian=L/2;
		if(arr.length%2==1)
		{
			return arr[midian];
		}
		else
		{
			return (int)(arr[midian-1]+arr[midian])/2;
		}		
	}
}


