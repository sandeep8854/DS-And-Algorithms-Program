package sandeep.leetcode.com;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Leetcode_136_Single_Number
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Length  ?  ?   ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int res=single_Number(arr);
		System.out.println(res);
	}
	private static  int single_Number(int[] arr) 
	{
		int xor=0;
		for(int i=0;i<arr.length;i++)
		{
			xor=xor^arr[i];
		}
		return xor;
	}
}

/*
Enter Any Array Length  ?  ?   
5
4
1
2
1
2
4
*/

/*
Enter Any Array Length  ?  ?   
3
2
2
1
1
*/


