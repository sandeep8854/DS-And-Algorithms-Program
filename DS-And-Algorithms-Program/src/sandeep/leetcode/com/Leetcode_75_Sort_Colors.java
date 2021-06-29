package sandeep.leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_75_Sort_Colors
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length ? ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	int res[]=sortColors(arr);	
	for(int i=0;i<res.length;i++)
	{
		System.out.println(arr[i] + " ");
	}
	
	}
	private static int[] sortColors(int[] arr)
	{
		Arrays.sort(arr);
		return arr;	
	}
}
/*
Enter Any Array Length ? ?  
4
3
2
1
0
0 
1 
2 
3 
*/