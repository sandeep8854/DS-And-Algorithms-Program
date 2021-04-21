package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_2_Simple_Array_Sum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?  ?");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int res=arraySum(arr);
		System.out.println(res);
	}
	private static int arraySum(int[] arr) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}
}
/*
Enter Any Array Length ?  ?
5
2
3
2
3
5
15
*/