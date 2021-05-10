package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_9_Birthday_Cake_Candles
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		SandeepbirhdayCakeCandles(arr);
	}
	private static void SandeepbirhdayCakeCandles(int[] arr)
	{
		int n=arr.length;
		int Count=0;
		int big=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=big)
			{
				big=arr[i];
			}
			if(arr[i]==big)
			{
				Count++;
			}
		}
		System.out.println(Count);
	}
}
/*
Enter Any Array Length ?  ?   
4
4
4
1
3
2
*/