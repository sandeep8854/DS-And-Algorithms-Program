package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_17_Divisible_Sum_Pair
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ? ");
		int len=sc.nextInt();
		int arr1[]=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Divisor Number ? ?  ");
		int k=sc.nextInt();
		int result=divisibleSmPair(arr1,k);	
		System.out.println(result);
	}
	private static int divisibleSmPair(int[] arr1, int k)
	{
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if((arr1[i]+arr1[j])%k==0)
				{
					count++;
				}
			}
		}
		return count;	
	}
}
/*
Enter Any Array Length ?   ? 
6
1
3
2
6
1
2
Enter Divisor Number ? ?  
3
5
*/