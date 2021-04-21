package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_4_A_Big_Sum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ?");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		long res=bigSum(arr);
		System.out.println(res);	
	}
	private static long bigSum(int[] arr)
	{
		long sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;	
	}
}
/*
Enter Any Number ?  ?
5
1000000001
1000000002
1111111113
1000000005
1000000006
5111111127
*/