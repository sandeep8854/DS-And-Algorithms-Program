package sandeep.algoHack.com;
import java.util.Scanner;
public class Candies
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ?  ?");
		int t=sc.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		candies(arr);	
	}
	private static void candies(int[] arr) 
	{
		int n=arr.length;
		int left[]=new int[n];
		int right[]=new int[n];
		left[0]=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]<=arr[i-1])
			{
				left[i]=1;
			}
			else
			{
				left[i]=left[i-1]+1;
			}	
		}
		
		right[n-1]=1;
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]<=arr[i+1])
			{
				right[i]=1;
			}else
			{
				right[i]=right[i+1]+1;
			}
		}
		
		int answer=0;
		for(int i=0;i<n;i++)
		{
			answer+=Math.max(right[i],left[i]);
		}
		System.out.println(answer);
	}

}
/*
Enter Array Length ?  ?
6
4
3
1
6
4
3
12
*/