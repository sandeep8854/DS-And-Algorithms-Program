package sandeep.algoHack.com;
import java.util.Scanner;
public class Hack_27_Picking_Numbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ?   ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=pickingNumber(arr);
		System.out.println(result);
	}
	private static int pickingNumber(int[] arr)
	{
		int frequency[]=new int[101];
		int result=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			int index=arr[i];
			frequency[index]++;
			//frequency[index]=frequency[index]+1;
		}
		for(int i=1;i<=100;i++)
		{
			result=Math.max(result, frequency[i]+frequency[i-1]);
		}
		return result;
		
		
		
		
	}

}
/*
Enter Any Array Length ?   ? 
6
1
2
2
3
1
2
5
*/