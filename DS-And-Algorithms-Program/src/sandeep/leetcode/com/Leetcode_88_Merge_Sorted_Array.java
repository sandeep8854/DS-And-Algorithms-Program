package sandeep.leetcode.com;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_88_Merge_Sorted_Array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Array Length");
		int len1=sc.nextInt();
		int arr1[]=new int[len1];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter First target which can add the element ?   ");
		int target1=sc.nextInt();
		System.out.println("Enter   Second Array Length  ?   ?   ");
		int len2=sc.nextInt();
		int arr2[]=new int[len2];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter Second Target Value which you can add the element ?  ");
		int target2=sc.nextInt();
		
		int res[]=mergeSorted(arr1,target1,arr2,target2);
		Arrays.sort(res);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] mergeSorted(int[] arr1, int target1, int[] arr2, int target2)
	{
		//Arrays.sort(arr1);
		//Arrays.sort(arr2);

		int result[]=new int[target1+target2];
		int len1=arr1.length-1;
		int len2=arr2.length-1;
		for(int i=0;i<target1;i++)
		{
			result[i]=arr1[i];
		}
		for(int j=0;j<target2;j++)
		{
			result[j+len1]=arr2[j];
		}
		
		
		return result;
	}

}
/*
Enter First Array Length
4
3
2
5
1
Enter First target which can add the element ?   
3
Enter   Second Array Length  ?   ?   
3
8
2
3
Enter Second Target Value which you can add the element ?  
3
2 2 3 3 5 8 
 */













