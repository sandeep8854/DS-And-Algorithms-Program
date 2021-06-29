package sandeep.leetcode.com;
import java.util.Scanner;
public class Leetcode_35_1_Search_Insert_Position
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Test Cases  ?   ?  ");
		int t=sc.nextInt();
		for(int ii=0;ii<t;ii++)
		{
		System.out.println("Enter Any Array Length  ?  ? ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Any Target Value ?   ");
		int target=sc.nextInt();
		int res=insertPosition(arr,target);
		System.out.println(res);
		}
	}
	private static int insertPosition(int[] arr, int target)
	{
		int left=0;
		int right=arr.length-1;
		while(left<right)
		{
			int mid=left+(right-left)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid;
			}			
		}
		if(arr[left]<target)
			return left+1;
		else
			return left;	
	}
}
/*
Enter Any Test Cases  ?   ?  
5
Enter Any Array Length  ?  ? 
4
1
3
5
6
Enter Any Target Value ?   
5
2
Enter Any Array Length  ?  ? 
4
1
3
5
6
Enter Any Target Value ?   
2
1
Enter Any Array Length  ?  ? 
4
1
3
5
6
Enter Any Target Value ?   
7
4
Enter Any Array Length  ?  ? 
4
1
3
5
6
Enter Any Target Value ?   
0
0
Enter Any Array Length  ?  ? 
1
1
Enter Any Target Value ?   
0
0
*/