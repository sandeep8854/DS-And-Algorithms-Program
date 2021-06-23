package sandeep.algoExpert.com;
import java.util.Arrays;
import java.util.Scanner;

public class SumTarget 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Array Lenght ?  ?  ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Array Target  ?  ? ");
		int target=sc.nextInt();
		int res[]=sumTwo(arr,target);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
	}
	private static int[] sumTwo(int[] arr, int target) 
	{
		Arrays.sort(arr);
//		int sum=0;
		int left=0;
		int right=arr.length-1;
		int result[]=new int[2];
		while(left<right)
		{
			int sum=arr[left]+arr[right];
			if(sum==target)
			{
				result[0]=arr[left];
				result[1] =arr[right];
				return result;
			}
			else if(sum<target)
			{
				left++;
			}
			else
			{
				right--;
			}	
		}
		return new int[0];
	}
}


/*
Enter Any Array Lenght ?  ?  
6
7
11
10
0
2
6
Enter Any Array Target  ?  ? 
9
2 7 
 */









