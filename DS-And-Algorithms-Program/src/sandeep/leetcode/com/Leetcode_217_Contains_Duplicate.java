package sandeep.leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_217_Contains_Duplicate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ? ");
		int t=sc.nextInt();
		for(int ii=0;ii<t;ii++)
		{
		System.out.println("Enter Any Array Length ?   ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		boolean res=duplicateTrue(arr);
		System.out.println(res);
		}
	}

	private static boolean duplicateTrue(int[] arr)
	{
		int n=arr.length;
		boolean SandeepRowdy=false;
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				SandeepRowdy=true;
				break;
			}
		}
		return SandeepRowdy;	
	}
}
/*
Enter Any Test Cases  ?   ? 
3
Enter Any Array Length ?   ?  
4
1
2
3
1
true
Enter Any Array Length ?   ?  
4
1
2
3
4
false
Enter Any Array Length ?   ?  
10
1
1
1
3
3
4
3
2
4
2
true
*/