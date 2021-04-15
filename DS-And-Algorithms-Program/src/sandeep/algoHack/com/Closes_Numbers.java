package sandeep.algoHack.com;
import java.util.Arrays;
import java.util.Scanner;
public class Closes_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ? ");
		int len=sc.nextInt();
		int arr_sandeep[]=new int[len];
		for(int i=0;i<arr_sandeep.length;i++)
		{
			arr_sandeep[i]=sc.nextInt();
		}
		closestNum(arr_sandeep);	
	}
	private static void closestNum(int[] arr)
	{
		int n=arr.length;
		Arrays.sort(arr);
		int difference[]=new int[n];
		int min=Integer.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			difference[i]=arr[i]-arr[i-1];
			if(min>difference[i])
				min=difference[i];
		}
		for(int i=1;i<n;i++)
		{
			if(difference[i]==min)
			//	System.out.println(arr[i-1]);
				System.out.print(arr[i-1] + " " + arr[i] + " ");
		//	System.out.println(arr[i]);	
		}	
	}
}
/*
Enter Any Array Length ?   ? 
4
5
4
3
2
2
3
3
4
4
5
*/
/*
Enter Any Array Length ?   ? 
4
5
4
3
2
2 3 3 4 4 5 
*/