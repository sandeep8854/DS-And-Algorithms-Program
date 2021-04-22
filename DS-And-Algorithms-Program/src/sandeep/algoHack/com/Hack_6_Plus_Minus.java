package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_6_Plus_Minus
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ? ?  ?");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		plusMinus(arr);	
	}

	private static void plusMinus(int[] arr)
	{
		int n=arr.length;
		double plusCount=0;
		double minusCount=0;
		double zeroCount=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]< 0 )
			{
				minusCount++;
			}
			else if(arr[i]>0)
			{
				plusCount++;
				
			}
			else
			{
				zeroCount++;
			}
		}
		System.out.println(plusCount/n+"00000");
		System.out.println(minusCount/n+"00000");
		System.out.println(zeroCount/n+"00000");
	}
}
